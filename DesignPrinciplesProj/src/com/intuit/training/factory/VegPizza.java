package com.intuit.training.factory;

public class VegPizza implements Pizza{

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Veg";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 100;
	}

}
