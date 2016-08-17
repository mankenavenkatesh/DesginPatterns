package com.intuit.training.iterator;

import java.util.Iterator;

public class EmployeeList implements EmployeeListInt{

	private Employee[] employees;
	private int index;
	
	public EmployeeList(int size) {
		// TODO Auto-generated constructor stub
		employees=new Employee[size];
	}
	
	@Override
	public void addEmployee(Employee e) {
		employees[index++]=e;
		
	}

	@Override
	public Iterator<Employee> iterator() {
		// TODO Auto-generated method stub
		return new EmployeeListIterator(employees);
	}

}
