package com;

import java.util.Comparator;

public class Author {
	
	String fname;
	String Lname;
	String book;
	int id;
	Author(String fname, String Lname, String book, int id){
		this.fname=fname;
		this.Lname=Lname;
		this.book=book;
		this.id=id;
		
		
	}
	
	public int geId() {
		return id;
		
	}

	public static Comparator<Author> idComparator = new Comparator<Author>() {
	 
	
		
	}
	
	public static void main(String[] args) {
		

	}

}
