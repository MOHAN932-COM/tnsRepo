package com.tnsif.threads;

public class InterThread {
	private int data;
    private boolean hasData = false;

    // Producer puts data
    public synchronized void produce(int value) {
        while (hasData) { // if data not consumed, wait
            try {
                wait(); // releases lock and waits
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        hasData = true;
        System.out.println(Thread.currentThread().getName() + " Produced: " + data);
        notify(); // wakes up one waiting consumer
    }

    // Consumer takes data
    public synchronized void consume() {
        while (!hasData) { // if no data, wait
            try {
                wait(); // releases lock and waits
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " Consumed: " + data);
        hasData = false;
        notifyAll(); // wakes up all waiting threads (useful if multiple producers/consumers)
    }
}
