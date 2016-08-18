package com.intuit.training.abstractfactory;

public class IndianFactory extends CountryFactory{

	@Override
	public Address createAddress() {
		return new IndianAddress();
		
	}

	@Override
	public PhoneNumber createPhoneNumber() {
		
		return new IndianPhoneNumber();
	}

}
