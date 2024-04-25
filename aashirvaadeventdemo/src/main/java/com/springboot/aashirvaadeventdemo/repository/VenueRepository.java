package com.springboot.aashirvaadeventdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.aashirvaadeventdemo.entity.Venue;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Integer> {

}
