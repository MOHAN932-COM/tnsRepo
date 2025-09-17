package com.tnsif.keywords;

class Demo{
	int a = 10;
}

class Demo1 extends Demo{
	int a = 50;
	public void show() {
		System.out.println("(Child class) "+a);
		System.out.println("(Parent class) "+super.a);
	}
}

public class SuperKey {

	public static void main(String[] args) {
			Demo1 D = new Demo1();
			D.show();
	}

}
