package com.tnsif.threads;

public class RunnableDemo {

	public static void main(String[] args) {
		RunnableInterface ri = new RunnableInterface();
		Thread t1 = new Thread(ri);
		t1.start();
	}

}