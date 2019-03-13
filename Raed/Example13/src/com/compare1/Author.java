package com.compare1;

import java.util.Comparator;

public class Author implements Comparable<Author>{
	
	String firstName;
	String lastName;
	String bookName;
	int id;
	
	
	public Author(String firstName, String lastName, String bookName, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookName = bookName;
		this.id = id;
	}


	
	//to compare String
	@Override
	public int compareTo(Author o) {
		int name = this.lastName.compareTo(o.lastName);
		return name==0?this.firstName.compareTo(o.firstName):name;
	}

	
	
	
	
	//to compare int
/*
	@Override
	public int compareTo(Author o) {
		if(this.id==o.id) {
			return 0;
		}else if(this.id > o.id) {
			return 1;
		}else {
			return -1;
		}

	}
	
	
	
 */
	
	
	
	
	
	
	
	
/*	public int getId() {
		return id;
	}
*/


/*
	public static Comparator<Author> idco = new Comparator<Author>() {
		@Override
		public int compare(Author o1, Author o2) {
		 int i1 = o1.getId();
		 int i2 = o2.getId();
			return i1-i2;
		}
	};
	
	*/

}
