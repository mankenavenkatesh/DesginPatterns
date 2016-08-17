package com.intuit.training.stockcommand;

public class Client {

	public static void main(String[] args){
		Agent agent=new Agent();
		agent.placeOrder("buy");
		agent.placeOrder("sell");
	}
}
