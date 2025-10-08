package com.tnsif.threads;

public class MyThreadDemo {

	public static void main(String[] args) {
		 MyThread t1 = new MyThread();
		 MyThread t2 = new MyThread();
		 
		 t1.setName("Thread-1");
	     t2.setName("Thread-2");
	     
	     t1.start();
	     t2.start();
	     
	     try {
	    	 t1.join();
	    	 t2.join();
	     } catch (InterruptedException e) {
	    	 e.printStackTrace();
	     }
	     
	     System.out.println("Main thread ends after child threads.");

	}

}
