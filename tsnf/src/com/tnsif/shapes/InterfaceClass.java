package com.tnsif.shapes;

public class InterfaceClass implements InterfaceDemo {
	// Implementing the abstract method
    public void displayMessage() {
        System.out.println("Hello! This message is from the implemented interface.");
    }

	public static void main(String[] args) {
		InterfaceClass obj = new InterfaceClass();
        obj.displayMessage();

	}

}
