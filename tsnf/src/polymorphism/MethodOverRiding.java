package polymorphism;

class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Derived class
class Dog extends Animal {
    // Overriding the sound() method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another Derived class
class Cat extends Animal {
    // Overriding the sound() method
    void sound() {
        System.out.println("Cat meows");
    }
}
public class MethodOverRiding {

	public static void main(String[] args) {
		// Creating objects using polymorphism
        Animal myAnimal;

        myAnimal = new Dog(); // Animal reference, Dog object
        myAnimal.sound();     // Calls Dog's sound() method

        myAnimal = new Cat(); // Animal reference, Cat object
        myAnimal.sound();     // Calls Cat's sound() method

	}

}
