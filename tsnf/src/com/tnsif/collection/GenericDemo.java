package com.tnsif.collection;

public class GenericDemo {

	public static void main(String[] args) {
		Generic1<Integer> g = new Generic1<Integer>();
		g.setData(201);
		g.setData(202);
		System.out.println(g.getData());
		
		Generic1<String> g1 = new Generic1<String>();
		g1.setData("TNS");
		System.out.println(g1.getData());

	}

}
