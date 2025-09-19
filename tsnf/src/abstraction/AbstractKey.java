package abstraction;

//Abstract class
abstract class Shape {
 abstract void draw(); // Abstract method
}

//Subclass
class Circle extends Shape {
 void draw() {
     System.out.println("Drawing a Circle");
 }
}
public class AbstractKey {

	public static void main(String[] args) {
		Shape s = new Circle(); // Using abstract class reference
        s.draw();               // Calls Circle's implementation
	}

}
