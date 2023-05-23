package com.example.Assignment1.entity;


import com.example.Assignment1.dto.MedicalRecordDTO;
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
        name = "patient_tbl", uniqueConstraints = {@UniqueConstraint(columnNames = {"Pid"})}
)

public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Pid;


    @Column(name = "Pname", nullable = false)
    public String Pname;

    @Column(name = "Paddress")
    private String Paddress;

    @Column(name = "PPhoneNum")
    private Long PPhoneNum;

    @Column(name = "PmedicalRecord")
    private MedicalRecordDTO PmedicalRecord;

    @Column(name = "allergies")
    private String allergies;

}
