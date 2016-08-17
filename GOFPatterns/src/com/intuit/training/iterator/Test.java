package com.intuit.training.iterator;

import java.util.Iterator;

public class Test {

	public static void main(String[] args){
		EmployeeListInt list=new EmployeeList(3);
		list.addEmployee(new Employee(1, "Aravind", "Developer"));
		list.addEmployee(new Employee(2, "Deva", "Architect"));
		list.addEmployee(new Employee(3, "Raman", "Tester"));
		
		Iterator<Employee> iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
