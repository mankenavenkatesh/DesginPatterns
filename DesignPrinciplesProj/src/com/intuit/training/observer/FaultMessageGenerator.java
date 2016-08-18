package com.intuit.training.observer;

import java.util.ArrayList;
import java.util.List;

//Concrete Observable
public class FaultMessageGenerator implements FaultMessageGeneratorIntf {

	private List<FaultListener> listeners=new ArrayList<FaultListener>();
	@Override
	public void addFaultListener(FaultListener listener) {
		// TODO Auto-generated method stub
		listeners.add(listener);
	}

	@Override
	public void removeFaultListener(FaultListener listener) {
		// TODO Auto-generated method stub
		listeners.remove(listener);
	}

	@Override
	public void faultOccured(String message) {
		// TODO Auto-generated method stub
		for(FaultListener listener:listeners){
			listener.handleFault(message);
		}
		
	}

}
