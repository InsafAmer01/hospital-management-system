package com.example.Assignment1.controller;

import com.example.Assignment1.dto.ApointmentDTO;
import com.example.Assignment1.entity.Apointment;
import com.example.Assignment1.service.ApointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class ApointmentResource {

    private final ApointmentService apointmentService;

    @Autowired
    public ApointmentResource(ApointmentService apointmentService) {
        this.apointmentService = apointmentService;
    }

    @PostMapping
    public ResponseEntity<Apointment> createApointment(@RequestBody ApointmentDTO apointmentDTO) {
        Apointment apointment = apointmentService.createApointment(apointmentDTO);
        return new ResponseEntity<>(apointment, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Apointment> getApointmentById(@PathVariable int id) {
        Apointment apointment = apointmentService.getApointmentById(id);
        if (apointment != null) {
            return new ResponseEntity<>(apointment, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Apointment>> getAllApointments() {
        List<Apointment> apointments = apointmentService.getAllApointments();
        return new ResponseEntity<>(apointments, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Apointment> updateApointment(@PathVariable int id, @RequestBody ApointmentDTO apointmentDTO) {
        Apointment updatedApointment = apointmentService.updateApointment( apointmentDTO);
        if (updatedApointment != null) {
            return new ResponseEntity<>(updatedApointment, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteApointment(@PathVariable int id) {
        boolean deleted = apointmentService.deleteApointment(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
