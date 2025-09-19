package abstraction;

public abstract class Shape1 {
    // Abstract method
    abstract void draw();

	public static void main(String[] args) {
		// Anonymous inner class to implement abstract method
        Shape1 circle = new Shape1() {
            void draw() {
                System.out.println("Drawing  Circle");
            }
        };
        circle.draw(); // Call the implemented method
	}

}
