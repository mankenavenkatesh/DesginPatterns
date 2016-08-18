package com.intuit.training.observer;

public class FaultMessager implements FaultListener{

	@Override
	public void handleFault(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending sms "+message);
	}

}
