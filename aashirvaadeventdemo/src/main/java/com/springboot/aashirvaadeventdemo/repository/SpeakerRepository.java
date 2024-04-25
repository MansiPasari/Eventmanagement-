package com.springboot.aashirvaadeventdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.aashirvaadeventdemo.entity.Speaker;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Integer> {

}
