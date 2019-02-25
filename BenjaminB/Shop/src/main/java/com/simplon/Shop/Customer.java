package com.simplon.Shop;

public class Customer {
String fullname;
String adress;
public Customer(String fullname, String adress) {
	getFullname();
	getAdress();
	this.fullname=getFullname();
	this.adress=getAdress();
}
String getFullname() {
	// TODO Auto-generated method stub
	return fullname;
}
String getAdress() {
	return adress;
}
}
