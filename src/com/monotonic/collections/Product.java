package com.monotonic.collections;

public class Product {

	private final String name;
	private final int weight;
	
	public Product(String name, int weight) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product { " +
				"name ='" + name + '\'' +
				"weight=" + weight +
				'}';
	}
}
