package com.mohan.assignment.employees;

public class Employee {

    
    private String name;
    private int employeeId;
    private double salary;

    
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + name + ", Salary: " + salary);
    }

    
    public static void main(String[] args) {
        
        Employee emp = new Employee();

        
        emp.setName("Alice");
        emp.setEmployeeId(101);
        emp.setSalary(50000);

        emp.displayInfo();
    }
}
