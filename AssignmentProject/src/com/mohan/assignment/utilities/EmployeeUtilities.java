package com.mohan.assignment.utilities;

import com.mohan.assignment.employees.Employee;


public class EmployeeUtilities {

    
    public void increaseSalary(Employee emp, double percentage) {
        double newSalary = emp.getSalary() + (emp.getSalary() * percentage / 100);
        emp.setSalary(newSalary);
        System.out.println("Salary increased by " + percentage + "%. New Salary: " + newSalary);
    }

    
    public void showEmployeeDetails(Employee emp) {
        emp.displayInfo();
    }
}
