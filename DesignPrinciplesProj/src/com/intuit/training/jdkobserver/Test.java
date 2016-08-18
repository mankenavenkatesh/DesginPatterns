package com.intuit.training.jdkobserver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FaultMessageGenerator generator=new FaultMessageGenerator();
		generator.addObserver(new FaultEmailer());
		generator.addObserver(new FaultLogger());
		generator.addObserver(new FaultMessager());
		generator.faultOccured("Database connection failure");

	}

}