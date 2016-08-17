package com.intuit.training.iterator;

public class Employee {

	private int id;
	private String name;
	private String designation;
	
	public Employee(int id, String name, String designation) {
		// TODO Auto-generated constructor stub
		super();
		this.id=id;
		this.name=name;
		this.designation=designation;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EmployeeName--"+name;
	}
}
