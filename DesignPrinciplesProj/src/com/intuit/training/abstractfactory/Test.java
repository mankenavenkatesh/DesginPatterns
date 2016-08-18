package com.intuit.training.abstractfactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryFactory addressFactory=new IndianFactory();
		Address address=addressFactory.createAddress();
		
		address.setStreet("G-9th Street");
		address.setLocation("Ulsoor");
		address.setCity("Bangalore");
		System.out.println(address);
		
		PhoneNumber phoneNumber=addressFactory.createPhoneNumber();
		phoneNumber.setNumber(9880372634L);
		System.out.println(phoneNumber);

	}
}
