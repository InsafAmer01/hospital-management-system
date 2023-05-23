package com.example.Assignment1.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(  //allows you to specify the details of the table that will be used to persist the entity in the database
        name = "doctor_tbl", uniqueConstraints = {@UniqueConstraint(columnNames = {"Did"})}
)

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Did;


    @Column(name = "Dname", nullable = false)
    private String Dname;

    @Column(name = "DPhoneNum")
    private Long DPhoneNum;

    @Column(name = "DLicenceNum")
    private Long DLicenceNum;

    @Column(name = "speciality")
    public String speciality;

    @Column(name = "availability")
    public Boolean availability;
}
