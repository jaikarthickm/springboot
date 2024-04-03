package com.example.myfirstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myfirstproject.employeeentity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer>{

}