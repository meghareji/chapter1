package com.two95;

public class BookTest {

		// TODO Auto-generated constructor stub


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		b.setname("Java Basics");
		displaybookName(b);
		b.setnumberOfPages(124);
		displaynumberOfPages(b);
		b.setpublisherName("dc books");
		displaypublisher(b);
		b.setprice(24.4);
		displayprice(b);
		}
	static void displaybookName(Book b){
		String name=b.getname();
		System.out.println(name);
	}
	static void displaynumberOfPages(Book b1){
		int numberofpages=b1.getnumberOfPages();
		System.out.println(numberofpages);
	}
	static void displaypublisher(Book b1){
		String publisher=b1.publisher;
		System.out.println(publisher);
	}
	static void displayprice(Book b1){
		double price=b1.getprice();
		System.out.println(price);
	}


			
		}


