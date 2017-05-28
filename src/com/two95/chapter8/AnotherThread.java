package com.two95.chapter8;

import java.util.Date;

public class AnotherThread extends Thread {
public void run() {
		System.out.println("executed the anotherThreads -->iam in"+Thread.currentThread().getName()+new Date());
		
	}
}
