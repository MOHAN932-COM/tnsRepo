package com.tnsif.collection;
import java.util.*;
public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

        stack.push("Red");
        stack.push("Green");
        stack.push("Blue");

        System.out.println("Stack Elements: " + stack);

        System.out.println("Top Element (peek): " + stack.peek());
        System.out.println("Popped Element: " + stack.pop());
        System.out.println("After Pop: " + stack);


	}

}
