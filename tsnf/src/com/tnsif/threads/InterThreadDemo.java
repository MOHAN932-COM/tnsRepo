package com.tnsif.threads;

public class InterThreadDemo {

	public static void main(String[] args) {
		InterThread it = new InterThread();
		// Producer thread
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                it.produce(i);
                try { Thread.sleep(300); } catch (InterruptedException e) {}
            }
        }, "Producer");

        // Consumer thread
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                it.consume();
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        }, "Consumer");

        producer.start();
        consumer.start();

	}

}
