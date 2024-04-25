package com.springboot.aashirvaadeventdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.aashirvaadeventdemo.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
