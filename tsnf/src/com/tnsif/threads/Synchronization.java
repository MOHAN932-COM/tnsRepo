package com.tnsif.threads;

public class Synchronization {
	
	// Synchronized Method
	synchronized void methodSync(int n) {
		for(int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (n * i));
			try {
				Thread.sleep(400);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	// Synchronized Block
	public void blockSync(int n) {
		synchronized (this) {
			for(int i = 1; i <= 3; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + (n * i));
				try {
					Thread.sleep(400);
				}catch(Exception e) {
				System.out.println(e);
				}
			}
		}
	}
	
	// Static Synchronized Method
	static synchronized void staticSync(int n) {
		for(int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (n * i));
			try {
				Thread.sleep(400);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}