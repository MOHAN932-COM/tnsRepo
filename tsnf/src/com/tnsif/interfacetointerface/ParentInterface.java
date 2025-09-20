package com.tnsif.interfacetointerface;

public interface ParentInterface {
	void greet();  // Abstract method

    // Static method to produce output
    static void showMessage() {
        System.out.println("Hello from Parent Interface!");
    }
}

