package com.intuit.training.factorymethod;

public class VegPizzaFactory extends PizaaFactory{

	@Override
	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new VegPizza();
	}

}
