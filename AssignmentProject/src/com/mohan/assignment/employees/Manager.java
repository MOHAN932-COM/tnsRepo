package com.mohan.assignment.employees;

public class Manager extends Employee {

    private int teamSize;

    
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    
    public int getTeamSize() {
        return teamSize;
    }

    
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }
}
