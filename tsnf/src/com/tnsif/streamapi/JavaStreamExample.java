package com.tnsif.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {

	public static void main(String[] args) {
		List<Product> pl = new ArrayList<Product>();
		pl.add(new Product(1,"hp",25000f));
		pl.add(new Product(2,"dell",30000f));
		pl.add(new Product(3,"Apple",90000f));
		pl.add(new Product(4,"lenovo",150000f));
		List<Float> pl2=pl.stream().filter(p->p.price>30000)
				.map(p->p.price)
				.collect(Collectors.toList());
		System.out.println(pl2);
	}

}
