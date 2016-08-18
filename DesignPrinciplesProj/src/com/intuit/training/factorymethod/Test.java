package com.intuit.training.factorymethod;

public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizaaFactory pizzaFactory=PizaaFactory.newInstance("c");
		Pizza pizza=pizzaFactory.createPizza();
		System.out.println("Type: "+pizza.getType());
		System.out.println("Price: "+pizza.getPrice());

	}
}
