package com.tnsif.stringmethods;

public class StringBufferMethod {

	public static void main(String[] args) {
		 // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original String: " + sb);

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
