package com.intuit.training.singleton;

public class Test {
	public static void main(String[] args){
		Company c1=Company.getInstance();
		Company c2=Company.getInstance();
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c1==c2);
	}
}
