package com.comparable;

public class Author2 implements Comparable<Author> {
	String firstName;
	String lastName;
	String bookName;
	int id;

	Author2(String first, String last, String book, int id) {
		this.firstName = first;
		this.lastName = last;
		this.bookName = book;
		this.id = id;
	}

	@Override
	public int compareTo(Author au) {
		if (this.id == au.id)
			return 0;
		else if (this.id > au.id)
			return 1;
		else
			return -1;
	}

}