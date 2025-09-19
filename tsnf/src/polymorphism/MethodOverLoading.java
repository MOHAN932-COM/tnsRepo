package polymorphism;

class Loading{
	public void Demo() {
		System.out.println("This is Default");
	}
	public void Demo(int a) {
		System.out.println("The value of a: "+a);
	}
	public void Demo(int a, int b) {
		System.out.println("Sum of a&b: "+ (a+b));
	}
}

public class MethodOverLoading {

	public static void main(String[] args) {
		Loading l = new Loading();
		l.Demo();
		l.Demo(10);
		l.Demo(20, 30);
	}

}
