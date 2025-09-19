package com.tnsif.keywords;

class StaticProperties {

    // static variable
    static int number;

    // static block
    static {
        number = 25;
        System.out.println("Static block executed.");
    }

    // static method
    static void show() {
        System.out.println("Number is: " + number);
    }
}

public class StaticDemo {

	public static void main(String[] args) {
		StaticProperties.show();

	}

}
