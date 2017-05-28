package com.two95.chapter5;

public class ExceptionTest1 {

	public static void main(String args[]) {
		try {
			int i = 10;
			int k = i / 0; // Culprit 1
		}catch (ArithmeticException ae) {
				System.out.println("Arithmetic exception handled");
			
			System.out.println("Hello 1");
		}try{
			int a[] = new int[2];
			a[0] = 1;
			a[1] = 2;
			a[2] = 3; // Culprit 2
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Hello 2");
		}
		
		System.out.println("DONE");
	}

}
