package com.tnsif.collections;

public class Laptop implements Comparable<Laptop>{
	private String brand ;
	private int cost;
	private  int gen ;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getGen() {
		return gen;
	}
	public void setGen(int gen) {
		this.gen = gen;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", cost=" + cost + ", gen=" + gen + "]";
	}
	public int compareTo1(Laptop o) {
		if(getCost()>o.getCost()) {
		return 1;
	}else
		return -1;
	}
	@Override
	public int compareTo(Laptop o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
