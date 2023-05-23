package com.example.Assignment1.service;

import com.example.Assignment1.entity.MedicalRecord;
import com.example.Assignment1.repository.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MedicalRecordService {

    private final MedicalRecordRepository medicalRecordRepository;

    @Autowired
    public MedicalRecordService(MedicalRecordRepository medicalRecordRepository) {
        this.medicalRecordRepository = medicalRecordRepository;
    }

    public MedicalRecord getMedicalRecordById(int recordId) {
        Optional<MedicalRecord> optionalMedicalRecord = medicalRecordRepository.findById(recordId);
        return optionalMedicalRecord.orElse(null);
    }

    public MedicalRecord createMedicalRecord(MedicalRecord medicalRecord) {
        return medicalRecordRepository.save(medicalRecord);
    }

    public MedicalRecord updateMedicalRecord(MedicalRecord updatedRecord) {
        return medicalRecordRepository.save(updatedRecord);
    }

    public boolean deleteMedicalRecord(int recordId) {
        Optional<MedicalRecord> optionalMedicalRecord = medicalRecordRepository.findById(recordId);
        if (optionalMedicalRecord.isPresent()) {
            medicalRecordRepository.delete(optionalMedicalRecord.get());
            return true;
        }
        return false;
    }
}
