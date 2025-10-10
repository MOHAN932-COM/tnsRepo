package com.example.demoproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoproject.model.Employee;

//Marker interface

public interface EmpRepo extends JpaRepository<Employee,Integer> {

}
