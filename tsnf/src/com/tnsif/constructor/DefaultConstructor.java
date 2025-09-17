package com.tnsif.constructor;
class Sample{
	Sample(){
		System.out.println("This is constructor.");
	}
	public void show() {
		System.out.println("This is method.");
	}
}
public class DefaultConstructor {

	public static void main(String[] args) {
			Sample S = new Sample();
			S.show();

	}

}
