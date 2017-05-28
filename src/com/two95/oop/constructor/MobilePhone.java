package com.two95.oop.constructor;

public class MobilePhone {
	String model;
	String operatingSystem;
	int price;
    int cameraPixels;
    int capacity;
public MobilePhone(){
	model="samsung";
	operatingSystem="antroid";
	price=200;
	cameraPixels=100;
	capacity=40;
}
public MobilePhone(String os){
	model="apple";
	operatingSystem=os;
	price=600;
	cameraPixels=200;
	capacity=60;
}
public MobilePhone(String mdl,String os){
	model=mdl;
	operatingSystem=os;
	price=200;
	cameraPixels=100;
	capacity=40;
}
public MobilePhone(String mdl,String os,int money){
	model=mdl;
	operatingSystem=os;
	price=money;
	cameraPixels=100;
	capacity=40;
}
public MobilePhone(String mdl,String os,int money,int cp){
	model=mdl;
	operatingSystem=os;
	price=money;
	cameraPixels=cp;
	capacity=40;
}
public MobilePhone(String mdl,String os,int money,int cp,int c){
	model=mdl;
	operatingSystem=os;
	price=money;
	cameraPixels=cp;
	capacity=c;
}
public void compute(){
	System.out.println(model+" Mobile Phone : operating system :"+operatingSystem +" Price : "+price +" Camera :"+cameraPixels+" Capacity: "+capacity);
	
}
}

