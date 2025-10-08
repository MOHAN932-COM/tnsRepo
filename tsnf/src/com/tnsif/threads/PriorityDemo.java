package com.tnsif.threads;

public class PriorityDemo {

	public static void main(String[] args) {
		Priority p1=new Priority();
		Priority p2=new Priority();
		p1.setPriority(1);
		p2.setPriority(10);
		p1.start();
		p2.start();

	}

}