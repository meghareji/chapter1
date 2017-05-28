package com.two95.CoreLibraries;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("megha ");
		buffer.append(" reji");
		buffer.insert(5, " elsa");
		String finalText = buffer.toString();
		System.out.println(finalText);
	}

}
