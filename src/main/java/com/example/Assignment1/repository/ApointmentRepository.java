package com.example.Assignment1.repository;

import com.example.Assignment1.entity.Apointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApointmentRepository extends JpaRepository<Apointment, Integer> {
}
