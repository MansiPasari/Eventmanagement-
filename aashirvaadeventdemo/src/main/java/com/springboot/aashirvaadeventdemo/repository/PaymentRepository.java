package com.springboot.aashirvaadeventdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.aashirvaadeventdemo.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
