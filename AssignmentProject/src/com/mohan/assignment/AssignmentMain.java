package com.mohan.assignment;
import com.mohan.assignment.employees.Manager;
import com.mohan.assignment.employees.Developer;
import com.mohan.assignment.utilities.EmployeeUtilities;
public class AssignmentMain {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("Alice");
        manager.setEmployeeId(101);
        manager.setSalary(80000);
        manager.setTeamSize(10);
        
        Developer developer = new Developer();
        developer.setName("Bob");
        developer.setEmployeeId(102);
        developer.setSalary(60000);
        developer.setProgrammingLanguage("Java");

        EmployeeUtilities utils = new EmployeeUtilities();

        System.out.println("=== Manager Details ===");
        utils.showEmployeeDetails(manager);

        System.out.println("\n=== Developer Details ===");
        utils.showEmployeeDetails(developer);

        System.out.println("\n=== Salary Updates ===");
        utils.increaseSalary(manager, 10);  // 10% raise
        utils.increaseSalary(developer, 15); // 15% raise

        System.out.println("\n=== Updated Details ===");
        utils.showEmployeeDetails(manager);
        utils.showEmployeeDetails(developer);
    }
}
