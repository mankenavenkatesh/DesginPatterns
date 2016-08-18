package com.intuit.training.templatemethod;

public abstract class Animal {

	// step 2
	public abstract String getColor();
	
	// step 1
	public abstract int getLifeCycleTime();
	
	// step3
	public void behaviour(){
		System.out.println("eat, sleep");
	}
		
	
	
	// template method. defines skeleton of algorithm. some steps are defered to subclass
	public void describe(){
		System.out.println(getLifeCycleTime());
		System.out.println(getColor());
		behaviour();
	}
}
