package com.intuit.training.lspviolation;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args){
		List<Bird> birds=new ArrayList<>();
		birds.add(new Parrot());
		birds.add(new Ostrich());
		birds.add(new Crow());
		
		for(Bird bird:birds){
			bird.fly();
		}
	}
}
