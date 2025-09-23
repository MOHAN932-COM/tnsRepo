package com.tnsif.stringmethods;

public class StringMethod {

	public static void main(String[] args) {
		String str1 = " Hello World ";
        String str2 = "hello world";
        // length()
        System.out.println("Length of str1: " + str1.length());
        
        // charAt()
        System.out.println("Character at index 1: " + str1.charAt(1));
        
        // compareTo()
        System.out.println("compareTo result: " + str1.trim().compareTo(str2));

        // contains()
        System.out.println("Contains 'World': " + str1.contains("World"));
        
        // concate()
        System.out.println("Concatenation: " + str1.concat("!!!"));

        // equals()
        System.out.println("Equals str2: " + str1.equals(str2));
        System.out.println("Equals Ignore Case: " + str1.trim().equalsIgnoreCase(str2));

        // toUpperCase()
        System.out.println("Uppercase: " + str1.toUpperCase());
        
        // toLowerCase()
        System.out.println("Lowercase: " + str1.toLowerCase());

        // replace()
        System.out.println("Replace 'World' with 'Java': " + str1.replace("World", "Java"));

        // split()
        String[] words = str1.trim().split("o"); // split by "o"
        System.out.println("Split words:");
        for (String w : words) {
        	System.out.println(w);
        }

        // trim()
        System.out.println("Trimmed String: '" + str1.trim() + "'");

	}

}
