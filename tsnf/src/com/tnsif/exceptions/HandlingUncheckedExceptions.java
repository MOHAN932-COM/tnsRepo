package com.tnsif.exceptions;

public class HandlingUncheckedExceptions {
	public static void main(String[] args) {
		try{
			String s = null;
			System.out.println(s.length());
		}catch(Exception e) {
			System.out.println("The null value can not be read");
		}
	}

}