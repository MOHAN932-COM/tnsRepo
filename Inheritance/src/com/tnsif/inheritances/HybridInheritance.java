package com.tnsif.inheritances;
//Base class
class A {
	void showA() {
		System.out.println("Class A method");
	}
}

//Derived class from A
class B extends A {
	void showB() {
		System.out.println("Class B method");
	}
}

//Interface
interface C {
	void showC();
}

//Class D extends B and implements C 
class D extends B implements C {
	public void showC() {
		System.out.println("Interface C method");
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		D obj = new D();
		obj.showA();  
	    obj.showB();  
	    obj.showC();

	}

}
