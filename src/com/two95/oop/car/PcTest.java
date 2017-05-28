package com.two95.oop.car;

public class PcTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName;
		String lastNAme;
		Parent p=new Parent();
		lastNAme=p.firstName;
	
		ParentChild pc=new ParentChild();
		firstName=pc.firstName;
	String name=pc.constructName(firstName, lastNAme);
	

		System.out.println("my name is "+name);
		

	}

}
