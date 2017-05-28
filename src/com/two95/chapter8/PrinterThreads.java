package com.two95.chapter8;

public class PrinterThreads extends Thread {
	Printer p;
	String data;
	public PrinterThreads(Printer p, String data) {
	this.p = p;
	this.data = data;
	}
	public void run() {
	synchronized ( p ){
	p.print(data);
	}
	}}


