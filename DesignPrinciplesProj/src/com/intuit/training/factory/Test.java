package com.intuit.training.factory;

public class Test {

	public static void main(String[] args){
		Pizza pizza=PizzaFactory.createPizza("V");
		System.out.println(pizza.getType()+","+pizza.getPrice());
		
	}
}
