package com.tnsif.stringmethods;

public class StringBuilderMethod {

	public static void main(String[] args) {
		// Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // append()
        sb.append(" World");
        System.out.println("After append: " + sb);

        // charAt()
        System.out.println("Character at index 4: " + sb.charAt(4));

        // delete() 
        sb.delete(5, 11); 
        System.out.println("After delete: " + sb);

        // length()
        System.out.println("Length: " + sb.length());

        // reverse() 
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // substring() 
        sb.reverse(); 
        System.out.println("Substring(1,4): " + sb.substring(1,4));

	}

}