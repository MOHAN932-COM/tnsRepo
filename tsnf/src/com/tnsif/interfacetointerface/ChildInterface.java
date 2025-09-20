package com.tnsif.interfacetointerface;

public interface ChildInterface extends ParentInterface {
	void display();  // Additional abstract method

    // Static method to produce output
    static void showChildMessage() {
        System.out.println("Hello from Child Interface!");
    }
}
