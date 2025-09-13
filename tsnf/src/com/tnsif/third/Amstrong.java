package com.tnsif.third;

import java.util.Scanner;
public class Amstrong {
	public static boolean isArmstrong(int num) {
		int original = num;
	    int digits = String.valueOf(num).length(); 
	    int sum = 0;

        int temp = num;
        while (temp > 0) {
        	int digit = temp % 10; 
        	sum += Math.pow(digit, digits);
        	temp /= 10;
        }
        
        return sum == original;
    }


	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if (isArmstrong(num)) {
			System.out.println(num + " is an Armstrong number.");
		} else {
			System.out.println(num + " is NOT an Armstrong number.");
		}
		
		sc.close();
	}

}
