package com.intuit.training.factorymethod;

public class NonVegPizza implements Pizza{

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Non Veg";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 300;
	}

}
