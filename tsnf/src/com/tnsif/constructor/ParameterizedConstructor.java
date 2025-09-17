package com.tnsif.constructor;

class Box{
	int a,b,c;
	Box(int x, int y, int z){
		a=x;
		b=y;
		c=z;
		System.out.println("This is constructor.");
	}
	public void volumeBox() {
		int vol=a*b*c;
		System.out.println("Volume of the box: "+vol);
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
			Box B = new Box(10,20,30);
			B.volumeBox();

	}

}
