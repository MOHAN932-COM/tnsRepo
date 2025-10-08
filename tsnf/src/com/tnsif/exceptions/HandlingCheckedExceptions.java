package com.tnsif.exceptions;

import java.io.FileReader;
import java.io.File;

public class HandlingCheckedExceptions {
	public static void main(String[] args) {
		try {
			File f1 = new File("abc.txt");
			FileReader f2 = new FileReader(f1);
		}catch(Exception e){
			System.out.println("The file is not founded.");
		}
	}

}