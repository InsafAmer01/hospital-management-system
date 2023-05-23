package com.example.Assignment1.dto;

public class DoctorDTO {
    private int Did;
    public String Dname;
    private Long DPhoneNum;
    private Long DLicenceNum;
    public String speciality;
    public Boolean availability;

    public DoctorDTO(int did, String dname, Long DPhoneNum, Long DLicenceNum, String speciality, Boolean availability) {
        Did = did;
        Dname = dname;
        this.DPhoneNum = DPhoneNum;
        this.DLicenceNum = DLicenceNum;
        this.speciality = speciality;
        this.availability = availability;
    }

    public int getDid() {
        return Did;
    }

    public void setDid(int did) {
        Did = did;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    public Long getDPhoneNum() {
        return DPhoneNum;
    }

    public void setDPhoneNum(Long DPhoneNum) {
        this.DPhoneNum = DPhoneNum;
    }

    public Long getDLicenceNum() {
        return DLicenceNum;
    }

    public void setDLicenceNum(Long DLicenceNum) {
        this.DLicenceNum = DLicenceNum;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "DoctorDTO{" +
                "Did=" + Did +
                ", Dname='" + Dname + '\'' +
                ", DPhoneNum=" + DPhoneNum +
                ", DLicenceNum=" + DLicenceNum +
                ", speciality='" + speciality + '\'' +
                ", availability=" + availability +
                '}';
    }
}
