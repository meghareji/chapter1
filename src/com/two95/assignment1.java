package com.two95;

public class assignment1 {

	public assignment1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("CALCULATOR");
		//Call methods from here
		add();
		sub();
		mul();
		div();
		sqr();
        cube();
	}
	static void add(){
		int i=10;
		int j=12;
	int	sum= i+j;
	System.out.println("Sum: "+ i + " + "+ j +" = "+sum);
	}
	static void sub(){
		int i=32;
		int j=11;
		int sub=i-j;
		System.out.println("Substaction: "+ i+" - " +j +" = " + sub);
	}
	static void mul(){
		int i=10;
		int j=2;
		int mul=i*j;
		System.out.println("Multiplication: "+ i+" * " +j +" = " + mul);
	}
	static void div(){
		float i=76;
		float j=4;
		float div=i/j;
		System.out.println("Division: "+ i+" / " +j +" = " + div);
	}
	static void sqr(){
		int i=4;
		int sqr=i*i;
		System.out.println("squre: "+ i+" ^ 2  = " + sqr);
		
	}
	static void cube(){
		int i=2;
		int cube=i*i*i;
		System.out.println("cube: "+ i+" ^ 3  = " + cube);
	}
		

	}

