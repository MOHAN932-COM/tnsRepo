package com.tnsif.gettersetter;

public class Student {
	 // Private variables
    private String name;
    private int age;

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name; // 'this' keyword differentiates instance variable from parameter
    }

    // Getter for 'age'
    public int getAge() {
        return age;
    }

    // Setter for 'age'
    public void setAge(int age) {
        if (age > 0) { // validation to ensure valid age
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }


	public static void main(String[] args) {
		 Student s = new Student();

	        // Using setters to set values
	        s.setName("John");
	        s.setAge(20);

	        // Using getters to get values
	        System.out.println("Name: " + s.getName());
	        System.out.println("Age: " + s.getAge());

	}

}
