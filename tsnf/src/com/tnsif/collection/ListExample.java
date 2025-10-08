package com.tnsif.collection;

import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // duplicates allowed
        numbers.add(30);

        System.out.println("List Elements: " + numbers);
        System.out.println("Element at index 1: " + numbers.get(1));

        numbers.set(2, 25);
        System.out.println("After set(2,25): " + numbers);
	}

}
