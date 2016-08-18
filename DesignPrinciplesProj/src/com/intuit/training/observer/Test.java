package com.intuit.training.observer;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FaultMessageGeneratorIntf generator=new FaultMessageGenerator();
		generator.addFaultListener(new FaultEmailer());
		generator.addFaultListener(new FaultLogger());
		generator.addFaultListener(new FaultMessager());
		generator.faultOccured("Database connection failure");

	}
}
