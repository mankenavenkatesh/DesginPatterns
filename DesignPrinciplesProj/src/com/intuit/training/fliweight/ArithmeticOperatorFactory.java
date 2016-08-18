package com.intuit.training.fliweight;

import java.util.HashMap;
import java.util.Map;

public class ArithmeticOperatorFactory {
	private static Map<Character, ArithmeticOperator> cache=new HashMap<>();
	public static ArithmeticOperator createArithmeticOperator(char op){
		ArithmeticOperator operator=null;
		if(cache.containsKey(op)){
			operator=cache.get(op);
		}
		else
		{
			operator=new ArithmeticOperator(op);
			cache.put(op, operator);
			
		}
		return operator;
	}
}
