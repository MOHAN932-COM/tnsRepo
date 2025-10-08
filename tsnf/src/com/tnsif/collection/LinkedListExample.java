package com.tnsif.collection;

import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.addFirst("Start");
        list.addLast("End");

        System.out.println("LinkedList Elements: " + list);

        list.removeFirst();
        System.out.println("After removeFirst(): " + list);

        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

	}

}
