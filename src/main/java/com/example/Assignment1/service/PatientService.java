package com.example.Assignment1.service;

import com.example.Assignment1.dto.PatientDTO;
import com.example.Assignment1.entity.Patient;
import com.example.Assignment1.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient createPatient(PatientDTO patientDTO) {
        Patient patient = new Patient(
                patientDTO.getPid(),
                patientDTO.getPname(),
                patientDTO.getPaddress(),
                patientDTO.getPPhoneNum(),
                patientDTO.getPmedicalRecord(),
                patientDTO.getAllergies()
        );
        return patientRepository.save(patient);
    }

    public Patient getPatientById(int patientId) {
        Optional<Patient> optionalPatient = patientRepository.findById(patientId);
        return optionalPatient.orElse(null);
    }

    public Patient updatePatient(PatientDTO patientDTO) {
        Optional<Patient> optionalPatient = patientRepository.findById(patientDTO.getPid());
        if (optionalPatient.isPresent()) {
            Patient patient = optionalPatient.get();
            patient.setPname(patientDTO.getPname());
            patient.setPaddress(patientDTO.getPaddress());
            patient.setPPhoneNum(patientDTO.getPPhoneNum());
            patient.setAllergies(patientDTO.getAllergies());
            return patientRepository.save(patient);
        }
        return null;
    }

    public boolean deletePatient(int patientId) {
        Optional<Patient> optionalPatient = patientRepository.findById(patientId);
        if (optionalPatient.isPresent()) {
            patientRepository.delete(optionalPatient.get());
            return true;
        }
        return false;
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}

