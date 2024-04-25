package com.springboot.aashirvaadeventdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.aashirvaadeventdemo.entity.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
   
	
	
}
