package com.tnsif.collection;
import java.util.*;
public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);

        System.out.println("PriorityQueue Elements: " + pq);
        System.out.println("Peek (smallest element): " + pq.peek());

        pq.poll(); // removes head (smallest)
        System.out.println("After Poll: " + pq);

        // Descending order queue
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        maxPQ.addAll(Arrays.asList(10, 20, 5, 15));
        System.out.println("Max PriorityQueue: " + maxPQ);

	}

}
