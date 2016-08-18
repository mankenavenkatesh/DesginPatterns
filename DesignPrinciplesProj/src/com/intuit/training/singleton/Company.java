package com.intuit.training.singleton;

public class Company {

	private static Company instance;
	
	private Company(){
		
	}
	
	public  static Company getInstance(){		
		if(instance==null){
			synchronized (Company.class) {
				if(instance==null){
					instance=new Company();	
				}
			}
		}
		return instance;
	}
	
	public String getName(){
		return "Intuit";
	}
}
