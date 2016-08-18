package com.intuit.training.observer;

public interface FaultMessageGeneratorIntf {
	public void addFaultListener(FaultListener listener);
	
	public void removeFaultListener(FaultListener listener);
	public void faultOccured(String message);
}
