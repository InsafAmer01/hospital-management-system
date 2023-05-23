package com.example.Assignment1.service;

import com.example.Assignment1.dto.DoctorDTO;
import com.example.Assignment1.entity.Doctor;
import com.example.Assignment1.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Doctor createDoctor(DoctorDTO doctorDTO) {
        Doctor doctor = new Doctor(
                doctorDTO.getDid(),
                doctorDTO.getDname(),
                doctorDTO.getDPhoneNum(),
                doctorDTO.getDLicenceNum(),
                doctorDTO.getSpeciality(),
                doctorDTO.getAvailability()
        );
        return doctorRepository.save(doctor);
    }

    public Doctor getDoctorById(int doctorId) {
        Optional<Doctor> optionalDoctor = doctorRepository.findById(doctorId);
        return optionalDoctor.orElse(null);
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor updateDoctor(DoctorDTO doctorDTO) {
        Optional<Doctor> optionalDoctor = doctorRepository.findById(doctorDTO.getDid());
        if (optionalDoctor.isPresent()) {
            Doctor doctor = optionalDoctor.get();
            doctor.setDname(doctorDTO.getDname());
            doctor.setDPhoneNum(doctorDTO.getDPhoneNum());
            doctor.setDLicenceNum(doctorDTO.getDLicenceNum());
            doctor.setSpeciality(doctorDTO.getSpeciality());
            doctor.setAvailability(doctorDTO.getAvailability());
            return doctorRepository.save(doctor);
        }
        return null;
    }

    public boolean deleteDoctor(int doctorId) {
        Optional<Doctor> optionalDoctor = doctorRepository.findById(doctorId);
        if (optionalDoctor.isPresent()) {
            doctorRepository.delete(optionalDoctor.get());
            return true;
        }
        return false;
    }
}

