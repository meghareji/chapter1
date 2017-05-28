package com.two95.chapter8;

public class PrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p = new Printer();
		// Create Threads
		PrinterThreads p1 = new PrinterThreads(p, "Document2");
		PrinterThreads p2 = new PrinterThreads(p, "Document3");
		PrinterThreads p3 = new PrinterThreads(p, "Document1");
		PrinterThreads p4 = new PrinterThreads(p, "Document4");
		p1.start();
		p2.start();
		p3.start();
		p4.start();
	}

}
