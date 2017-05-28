package com.two95;

public class Book {

		// TODO Auto-generated constructor stub
String bookName;
int totalNumberOfPages;
String publisher;
double bookPrice;
public void setname(String name){
	System.out.println("book name is "+ name);
	bookName=name;
}
public String getname(){
	return bookName;	
}
public void setnumberOfPages(int numberOfPages){
	System.out.println("Number of pages is "+ numberOfPages);
	totalNumberOfPages=numberOfPages;
}
public int getnumberOfPages(){
return totalNumberOfPages;
}
public void setpublisherName(String publisherName){
	System.out.println("publisher of the book is "+publisherName);
	publisher=publisherName;
}
public String getpublisher(){
 return publisher;
}
public void setprice(double price){
	System.out.println("price of the book is "+ price);
	bookPrice=price;
}
public double getprice(){
return bookPrice;
}

	}


