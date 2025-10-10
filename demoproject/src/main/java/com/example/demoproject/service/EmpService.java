package com.example.demoproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.model.Employee;
import com.example.demoproject.repo.EmpRepo;

@Service

public class EmpService {
	@Autowired
	EmpRepo er;
	
	//insert
	public Employee addEmp(Employee emp)
	{
		return er.save(emp);
	}
	//select
	public List<Employee> getEmp()
	{
		return er.findAll();
	}
	//delete
	public void delEmp(int eid)
	{
		er.deleteById(eid);
	}
}
