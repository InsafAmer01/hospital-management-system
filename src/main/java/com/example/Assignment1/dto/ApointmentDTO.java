package com.example.Assignment1.dto;


import lombok.Data;

import java.util.Date;

@Data
public class ApointmentDTO {

    private int Aid;
    private int Did;
    private int Pid;
    private Date date;
    private Long time;
    private String location;
    private Boolean Davailability;

    public ApointmentDTO(int aid, int did, int pid, Date date, Long time, String location, Boolean davailability) {
        Aid = aid;
        Did = did;
        Pid = pid;
        this.date = date;
        this.time = time;
        this.location = location;
        Davailability = davailability;
    }

    public int getAid() {
        return Aid;
    }

    public void setAid(int aid) {
        Aid = aid;
    }

    public int getDid() {
        return Did;
    }

    public void setDid(int did) {
        Did = did;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int pid) {
        Pid = pid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getDavailability() {
        return Davailability;
    }

    public void setDavailability(Boolean davailability) {
        Davailability = davailability;
    }

    @Override
    public String toString() {
        return "ApointmentDTO{" +
                "Aid=" + Aid +
                ", Did=" + Did +
                ", Pid=" + Pid +
                ", date=" + date +
                ", time=" + time +
                ", location='" + location + '\'' +
                ", Davailability=" + Davailability +
                '}';
    }
}
