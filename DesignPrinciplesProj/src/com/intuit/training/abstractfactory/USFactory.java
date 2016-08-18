package com.intuit.training.abstractfactory;

public class USFactory extends CountryFactory {

	@Override
	public Address createAddress() {
		
		return new USAddress();
	}

	@Override
	public PhoneNumber createPhoneNumber() {
		
		return new USPhoneNumber();
	}

}
