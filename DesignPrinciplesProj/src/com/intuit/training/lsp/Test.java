package com.intuit.training.lsp;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args){
		List<FlightBird> birds=new ArrayList<FlightBird>();
		birds.add(new Parrot());
	//	birds.add(new Ostrich());
		birds.add(new Crow());
		
		for(FlightBird bird:birds){
			bird.fly();
		}
	}
}
