package com.tnsif.threads;

public class Priority extends Thread{
	public void run() {
		System.out.println("The running thread name is:"+Thread.currentThread().getName());
		System.out.println("The running thread priority is:"+Thread.currentThread().getPriority());
	}
}