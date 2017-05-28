package com.two95.CoreLibraries;

import java.lang.Integer;

public class WrapperDemo {
	public static void main(String args[]) {
		int i = 10;
		double d = 11.12;
		// Wrap i in the object
		Integer ii = new Integer(i);
		Double dd = new Double(d);
		// Pass the object ii as a parameter
		add(ii);
		substract(dd);
	}

	static void add(Integer object) {
		int val = object.intValue() + 5;
		System.out.println(val);
	}

	static void substract(Double Object) {
		double ans = Object.doubleValue() - 11;
		System.out.println(ans);
	}
}