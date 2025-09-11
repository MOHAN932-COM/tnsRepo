package com.tnsif.second;

public class typeConversion {

	public static void main(String[] args) {
		int x = 120;   
		double y = x;
		System.out.println("Implicit Conversion:");
        System.out.println("Integer value: " + x);
        System.out.println("Converted to double: " + y);
        System.out.println();
        
		double a = 10.273;
		int b = (int) a;
		System.out.println("Explicit Conversion:");
        System.out.println("Double value: " + a);
        System.out.println("Converted to integer: " + b);


	}

}
