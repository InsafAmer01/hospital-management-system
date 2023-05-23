package com.example.Assignment1.dto;

public class PatientDTO {
    private int Pid;
    public String Pname;
    private String Paddress;
    private Long PPhoneNum;

    private MedicalRecordDTO PmedicalRecord;
    private String allergies;

    public PatientDTO(int pid, String pname, String paddress, Long PPhoneNum, MedicalRecordDTO pmedicalRecord, String allergies) {
        Pid = pid;
        Pname = pname;
        Paddress = paddress;
        this.PPhoneNum = PPhoneNum;
        PmedicalRecord = pmedicalRecord;
        this.allergies = allergies;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int pid) {
        Pid = pid;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public String getPaddress() {
        return Paddress;
    }

    public void setPaddress(String paddress) {
        Paddress = paddress;
    }

    public Long getPPhoneNum() {
        return PPhoneNum;
    }

    public void setPPhoneNum(Long PPhoneNum) {
        this.PPhoneNum = PPhoneNum;
    }

    public MedicalRecordDTO getPmedicalRecord() {
        return PmedicalRecord;
    }

    public void setPmedicalRecord(MedicalRecordDTO pmedicalRecord) {
        PmedicalRecord = pmedicalRecord;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    @Override
    public String toString() {
        return "PatientDTO{" +
                "Pid=" + Pid +
                ", Pname='" + Pname + '\'' +
                ", Paddress='" + Paddress + '\'' +
                ", PPhoneNum=" + PPhoneNum +
                ", PmedicalRecord=" + PmedicalRecord +
                ", allergies='" + allergies + '\'' +
                '}';
    }
}
