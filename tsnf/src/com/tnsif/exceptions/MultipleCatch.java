package com.tnsif.exceptions;

public class MultipleCatch {

	public static void main(String[] args) {
		try {
			int num = 10 / 0;
			int[] arr = new int[5];
			System.out.println(arr[10]); 
		} catch (ArithmeticException e) {
			System.out.println("Error: Cannot divide by zero!");
	    } catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("Error: Array index out of range!");
	    } catch (Exception e) { 
	    	System.out.println("Some other error occurred: " + e);
	    }
	    System.out.println("Program continues after exception handling...");
	}

}