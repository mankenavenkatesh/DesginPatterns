package com.intuit.training.observer;

public class FaultEmailer implements FaultListener {

	@Override
	public void handleFault(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending Email "+message);
	}

}
