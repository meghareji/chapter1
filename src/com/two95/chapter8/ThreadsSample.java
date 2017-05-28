package com.two95.chapter8;

import java.util.Date;

public class ThreadsSample {

	public static void main(String args[]) throws InterruptedException {
////		Thread t = Thread.currentThread();
//		System.out.println(t.getName());
//		System.out.println(t.getPriority());
//		System.out.println(t.isAlive());
//		System.out.println(t.getId());
//		String status = t.isAlive() ? "yes" : "no";
//	System.out.println(status);
	MyThreads th1=new MyThreads();
	
	MyThreads th2=new MyThreads();
	Thread t1=new Thread(th1);
	t1.setPriority(2);
	Thread t2=new Thread(th2);
	t2.setPriority(10);
	t1.start();
	t1.sleep(2000);
	t2.start();
	try {
		t2.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("iam in"+Thread.currentThread().getName()+new Date());
	AnotherThread at= new AnotherThread();
	at.setPriority(5);
	at.sleep(2000);
	at.start();
	}
	
	
	
	

}
