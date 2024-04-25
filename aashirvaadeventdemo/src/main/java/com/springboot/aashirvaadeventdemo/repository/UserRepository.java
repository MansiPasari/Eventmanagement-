package com.springboot.aashirvaadeventdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.aashirvaadeventdemo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
