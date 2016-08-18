package com.intuit.training.factory;

public class PizzaFactory {

	public static Pizza createPizza(String type){
		Pizza pizza=null;
		if(type.equals("V")){
			pizza=new VegPizza();
		}
		else if(type.equals("c")){
			pizza=new ChickenPizza();
		}
		return pizza;
	}
}
