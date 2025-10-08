package com.tnsif.streamapiprograms;

import java.util.Arrays;
import java.util.List;

public class ParallelOrderProcessing {

	public static void main(String[] args) {
		List<String> orders = Arrays.asList(
                "Order#1001 - Mobile",
                "Order#1002 - Laptop",
                "Order#1003 - Tablet",
                "Order#1004 - Headphones",
                "Order#1005 - Smartwatch"
        );

        System.out.println("Processing Orders in Parallel:\n");

        orders.parallelStream()
              .forEach(order -> {
                  System.out.println( " processing " + order);
                  //System.out.println(Thread.currentThread().getName() + " processing " + order);
                  simulateProcessingTime();
              });

        System.out.println("\nAll orders processed successfully!");
    }

    // Simulate some delay to mimic real processing (like payment, validation, etc.)
    private static void simulateProcessingTime() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

	}

}