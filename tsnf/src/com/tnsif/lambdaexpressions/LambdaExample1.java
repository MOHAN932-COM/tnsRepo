package com.tnsif.lambdaexpressions;

public class LambdaExample1 {

	public static void main(String[] args) {
		Runnable greet = () -> System.out.println("Hello from Lambda Expression!");
        greet.run();

	}

}
