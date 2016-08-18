package com.intuit.training.jdkobserver;


import java.util.Observable;

//Concrete Observable
public class FaultMessageGenerator extends Observable {


	public void faultOccured(String message){
		// TODO Auto-generated method stub
		setChanged();
		notifyObservers(message);
	}

	
		
	

}
