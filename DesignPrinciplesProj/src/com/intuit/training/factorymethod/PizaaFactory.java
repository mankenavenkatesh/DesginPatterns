package com.intuit.training.factorymethod;



public abstract class PizaaFactory {

	public abstract Pizza createPizza();
	
	public static PizaaFactory newInstance(String type){
		PizaaFactory pizzaFactory=null;
		if(type=="V"){
			pizzaFactory= new VegPizzaFactory();			
		}
		else if(type=="c"){
			pizzaFactory= new NonVegPizzaFactory();
		}
		
		return pizzaFactory;
	}
}
