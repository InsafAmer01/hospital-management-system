package com.example.Assignment1.service;

import com.example.Assignment1.dto.ApointmentDTO;
import com.example.Assignment1.entity.Apointment;
import com.example.Assignment1.repository.ApointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ApointmentService {

    private final ApointmentRepository apointmentRepository;

    @Autowired
    public ApointmentService(ApointmentRepository appointmentRepository) {
        this.apointmentRepository = appointmentRepository;
    }

    public Apointment createApointment(ApointmentDTO apointmentDTO) {
        Apointment apointment = new Apointment(
                apointmentDTO.getAid(),
                apointmentDTO.getDid(),
                apointmentDTO.getPid(),
                apointmentDTO.getDate(),
                apointmentDTO.getTime(),
                apointmentDTO.getLocation(),
                apointmentDTO.getDavailability()
        );
        return apointmentRepository.save(apointment);
    }

    public Apointment getApointmentById(int apointmentId) {
        Optional<Apointment> optionalApointment = apointmentRepository.findById(apointmentId);
        return optionalApointment.orElse(null);
    }

    public List<Apointment> getAllApointments() {
        return apointmentRepository.findAll();
    }

    public Apointment updateApointment(ApointmentDTO apointmentDTO) {
        Optional<Apointment> optionalApointment = apointmentRepository.findById(apointmentDTO.getAid());
        if (optionalApointment.isPresent()) {
            Apointment apointment = optionalApointment.get();
            apointment.setDid(apointmentDTO.getDid());
            apointment.setPid(apointmentDTO.getPid());
            apointment.setDate(apointmentDTO.getDate());
            apointment.setTime(apointmentDTO.getTime());
            apointment.setLocation(apointmentDTO.getLocation());
            apointment.setDavailability(apointmentDTO.getDavailability());
            return apointmentRepository.save(apointment);
        }
        return null;
    }

    public boolean deleteApointment(int apointmentId) {
        Optional<Apointment> optionalApointment = apointmentRepository.findById(apointmentId);
        if (optionalApointment.isPresent()) {
            apointmentRepository.delete(optionalApointment.get());
            return true;
        }
        return false;
    }
}
