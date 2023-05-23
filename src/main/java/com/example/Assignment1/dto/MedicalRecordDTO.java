package com.example.Assignment1.dto;

public class MedicalRecordDTO {
    private int recordId;
    private int patientid;
    private String diagnose;
    private String treatment;
    private String medication;
    private String labResult;

    public MedicalRecordDTO(int recordId, int patientid, String diagnose, String treatment, String medication, String labResult) {
        this.recordId = recordId;
        this.patientid = patientid;
        this.diagnose = diagnose;
        this.treatment = treatment;
        this.medication = medication;
        this.labResult = labResult;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getLabResult() {
        return labResult;
    }

    public void setLabResult(String labResult) {
        this.labResult = labResult;
    }
}
