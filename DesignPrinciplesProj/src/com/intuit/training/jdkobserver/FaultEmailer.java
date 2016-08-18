package com.intuit.training.jdkobserver;

import java.util.Observable;
import java.util.Observer;

//concrete observer
public class FaultEmailer implements Observer {

	

	@Override
	public void update(Observable o, Object message) {
		// TODO Auto-generated method stub
		System.out.println("Sending Email "+message);
	}

}
