package com.two95.oop.constructor;

public class MobilePhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MobilePhone m1=new MobilePhone();
MobilePhone m2=new MobilePhone("abc");
MobilePhone m3=new MobilePhone("abc","xyz");
MobilePhone m4=new MobilePhone("abc","xyz",399);
MobilePhone m5=new MobilePhone("abc","xyz",188,111);
MobilePhone m6=new MobilePhone("abc","xyz",199,112,12);
m1.compute();
m2.compute();
m3.compute();
m4.compute();
m5.compute();
m6.compute();
	}

}
