package com.tnsif.collection;
import java.util.*;
public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10); // duplicate ignored

        System.out.println("TreeSet (Sorted Order): " + set);
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        System.out.println("Higher(15): " + set.higher(15));

	}

}
