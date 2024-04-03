package com.example.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bank.model.Signup;

public interface SignupRepo extends JpaRepository<Signup,Integer>{
    
}