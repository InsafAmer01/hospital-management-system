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
        name = "apointment_tbl", uniqueConstraints = {@UniqueConstraint(columnNames = {"Aid"})}
)


public class Apointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Aid;


    @Column(name = "Did", nullable = false)
    private int Did;

    @Column(name = "Pid", nullable = false)
    private int Pid;

    @Column(name = "date")
    private Date date;

    @Column(name = "time")
    private Long time;

    @Column(name = "location")
    private String location;

    @Column(name = "Davailability")
    private Boolean Davailability;
}
