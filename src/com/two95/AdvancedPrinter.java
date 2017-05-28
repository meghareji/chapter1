package com.two95;

public class  AdvancedPrinter {
String printType;
	// Document initialization
	 
	 AdvancedPrinter(String type) {
	printType = type;
	
	
	}
	public void printDocument(String text) {
	System.out.println(text + "printed in " + printType);
	}
	}


