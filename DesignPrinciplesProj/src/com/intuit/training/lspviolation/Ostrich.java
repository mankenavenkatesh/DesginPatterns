package com.intuit.training.lspviolation;

public class Ostrich implements Bird{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ostrich eating");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Ostrich cannot fly");
	}

}
