package com.intuit.training.fliweight;

public class Test {
	
	public static void main(String[] args){
		ArithmeticOperator operator1=ArithmeticOperatorFactory.createArithmeticOperator('+');
		System.out.println(operator1.performOperation(10, 6));
		
		ArithmeticOperator operator2=ArithmeticOperatorFactory.createArithmeticOperator('-');
		System.out.println(operator1.performOperation(13, 5));
		
		ArithmeticOperator operator3=ArithmeticOperatorFactory.createArithmeticOperator('+');
		System.out.println(operator1.performOperation(103, 65));
		
		System.out.println(operator1==operator2);
		
		// below is true. because both references point to same object
		System.out.println(operator1==operator3);
	}
}
