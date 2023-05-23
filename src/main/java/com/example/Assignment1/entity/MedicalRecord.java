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

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(  //allows you to specify the details of the table that will be used to persist the entity in the database
        name = "medicalRecord_tbl", uniqueConstraints = {@UniqueConstraint(columnNames = {"Pid"})}
)

public class MedicalRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "record_id")
    private int recordId;

    @OneToOne
    @JoinColumn(name = "Pid")
    private Patient patient;

    @Column(name = "diagnose")
    private String diagnose;

    @Column(name = "treatment")
    private String treatment;

    @Column(name = "medication")
    private String medication;

    @Column(name = "labResult")
    private String labResult;

}
