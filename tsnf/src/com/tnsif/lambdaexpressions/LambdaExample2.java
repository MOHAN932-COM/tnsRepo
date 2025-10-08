package com.tnsif.lambdaexpressions;

public class LambdaExample2 {

	public static void main(String[] args) {
		Greeting greet = name -> System.out.println("Hello, " + name + "!");
        greet.sayHello("Mohan");

	}

}
