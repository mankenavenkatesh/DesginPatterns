package com.intuit.training.builder;

public class TestPhoneBuilder {

	public static void main(String[] args) {
		Phone p=new PhoneBuilder().setOs("Android").setRam(3).build();
		System.out.println(p);
	}
}
