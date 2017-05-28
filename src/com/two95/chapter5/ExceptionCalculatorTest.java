package com.two95.chapter5;

public class ExceptionCalculatorTest {

	public static void main(String[] args) {
		ExceptionCalculator calc = new ExceptionCalculator();
		calc.divide(10, 2);
		calc.divide(10, 0);
	}

}
