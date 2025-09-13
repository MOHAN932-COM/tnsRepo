package com.tnsif.third;

class Car{
	String color = "Blue";
	String brand = "Baleno";
	String engineType = "Diesel";
	int seatingCapacity = 5;
	
	public void start() {
		System.out.println("Car is starting");
	}
	
	public void stop() {
		System.out.println("Car is stoping");
	}
	
	public void drifts() {
		System.out.println("Car is drifting");
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.color);
		System.out.println(c.brand);
		System.out.println(c.engineType);
		System.out.println(c.seatingCapacity);
		c.start();
		c.stop();
		c.drifts();
	}
}