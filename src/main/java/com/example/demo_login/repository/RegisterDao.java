package com.example.demo_login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_login.entity.Register;

@Repository
public interface RegisterDao extends JpaRepository<Register, String> {

}
