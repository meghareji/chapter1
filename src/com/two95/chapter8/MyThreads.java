package com.two95.chapter8;

import java.util.Date;

public class MyThreads implements Runnable {

	@Override
	public void run() {
		System.out.println("executed the threads -->iam in"+Thread.currentThread().getName()+new Date());
		
	}

}
