package com.tnsif.exceptions;

class Sample {
	public void show() throws Exception
	{
		String s= null ;
		throw new NullPointerException("No Null Values");
	}
}
public class ThrowsKey {
	public static void main(String[] args) throws Exception {
		Sample s1 = new Sample();	
		s1.show();
	}
}