package com.two95.oop.constructor;

public class CalculatorInheritanceTest {

	public static void main(String[] args) {
	CalculatorBasic cb=new CalculatorBasic();
			double result=cb.sum(12, 12);
			System.out.println("sum = "+result);
	CalculatorScientific cs=new CalculatorScientific();
	result= cs.multiply(2, 3);
	System.out.println("multiplication ="+result);
	result=cs.sum(3, 2);
	System.out.println("sum = "+ result);
	}

}
