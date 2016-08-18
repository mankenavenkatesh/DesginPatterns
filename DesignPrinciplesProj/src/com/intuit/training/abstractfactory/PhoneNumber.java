package com.intuit.training.abstractfactory;

public abstract class PhoneNumber {

	private long number;

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}
	
	public abstract String getIsdCode();

	@Override
	public String toString() {
		return  getIsdCode()+"-"+number;
	}
	
}
