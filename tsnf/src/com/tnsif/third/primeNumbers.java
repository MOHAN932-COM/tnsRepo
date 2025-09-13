package com.tnsif.third;

public class primeNumbers {
	public static boolean isPrime(int num) {
		if(num <= 1) return false;
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 100 are:");
		for(int num = 1; num <= 100; num++) {
			if(isPrime(num)) {
				System.out.println(num + " ");
			}
		}

		

	}

}
