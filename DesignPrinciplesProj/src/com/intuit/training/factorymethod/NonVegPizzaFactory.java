package com.intuit.training.factorymethod;

public class NonVegPizzaFactory extends PizaaFactory{

	@Override
	public Pizza createPizza() {

		return new NonVegPizza();
	}

}
