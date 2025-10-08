package com.tnsif.threads;

public class SynchronizationDemo {

	public static void main(String[] args) {
		Synchronization obj1 = new Synchronization();

        // Using Synchronized Method
		System.out.println("------Synchronized Method------");
        Thread t1 = new Thread(() -> obj1.methodSync(2), "T1");
        Thread t2 = new Thread(() -> obj1.methodSync(3), "T2");
        t1.start(); t2.start();
        try { t1.join(); t2.join(); } catch (Exception e) {}

        // Using Synchronized Block
        System.out.println("\n------Synchronized Block------");
        Thread t3 = new Thread(() -> obj1.blockSync(5), "T3");
        Thread t4 = new Thread(() -> obj1.blockSync(6), "T4");
        t3.start(); t4.start();
        try { t3.join(); t4.join(); } catch (Exception e) {}

        // Using Static Synchronized Method (class level lock)
        System.out.println("\n------Static Synchronized Method------");
        Thread t5 = new Thread(() -> Synchronization.staticSync(7), "T5");
        Thread t6 = new Thread(() -> Synchronization.staticSync(8), "T6");
        t5.start(); t6.start();

	}

}