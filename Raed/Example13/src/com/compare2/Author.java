package com.compare2;

import java.util.Comparator;

public class Author{
	
	protected String firstName;
	protected String lastName;
	protected String bookName;
	protected int id;
	
	
	public Author(String firstName, String lastName, String bookName, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookName = bookName;
		this.id = id;
	}

 
	
	
	
	
	
	
	
	public String getFirstName() {
		return firstName;
	}




	public static Comparator<Author> firstcomp = new Comparator<Author>() {

		@Override
		public int compare(Author a1, Author a2) {
			String f1 = a1.getFirstName();
			String f2 = a2.getFirstName();
			return f1.compareTo(f2);
		}
		
	};





	public int getId() {
		return id;
	}




/*	public static Comparator<Author> idco = new Comparator<Author>() {
		@Override
		public int compare(Author o1, Author o2) {
		 int i1 = o1.getId();
		 int i2 = o2.getId();
			return i1-i2;
		}
	};
	*/
	

}
