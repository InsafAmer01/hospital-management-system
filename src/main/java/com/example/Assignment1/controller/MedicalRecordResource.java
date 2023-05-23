package com.example.Assignment1.controller;

import com.example.Assignment1.entity.MedicalRecord;
import com.example.Assignment1.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/medical-records")
public class MedicalRecordResource {

    private final MedicalRecordService medicalRecordService;

    @Autowired
    public MedicalRecordResource(MedicalRecordService medicalRecordService) {
        this.medicalRecordService = medicalRecordService;
    }

    @GetMapping("/{recordId}")
    public ResponseEntity<MedicalRecord> getMedicalRecordById(@PathVariable int recordId) {
        MedicalRecord medicalRecord = medicalRecordService.getMedicalRecordById(recordId);
        if (medicalRecord != null) {
            return ResponseEntity.ok(medicalRecord);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<MedicalRecord> createMedicalRecord(@RequestBody MedicalRecord medicalRecord) {
        MedicalRecord createdRecord = medicalRecordService.createMedicalRecord(medicalRecord);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdRecord);
    }

    @PutMapping("/{recordId}")
    public ResponseEntity<MedicalRecord> updateMedicalRecord(
            @PathVariable int recordId,
            @RequestBody MedicalRecord updatedRecord
    ) {
        MedicalRecord medicalRecord = medicalRecordService.getMedicalRecordById(recordId);
        if (medicalRecord != null) {
            updatedRecord.setRecordId(recordId);
            MedicalRecord updated = medicalRecordService.updateMedicalRecord(updatedRecord);
            return ResponseEntity.ok(updated);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{recordId}")
    public ResponseEntity<Void> deleteMedicalRecord(@PathVariable int recordId) {
        boolean deleted = medicalRecordService.deleteMedicalRecord(recordId);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

