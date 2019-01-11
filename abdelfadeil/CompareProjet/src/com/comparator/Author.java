package com.comparator;

import java.util.Comparator;

public class Author {//implements Comparable<Author>{
	String firstName;
	String lastName;
	String bookName;
	int id;
	Author(String first, String last, String book, int id) {
	this.firstName = first;
	this.lastName = last;
	this.bookName = book;
	this.id = id;
	}
	public int getId() {
	return id;
	}
	/*Comparator for sorting the list by id*/
	public static Comparator<Author> idComparator = new Comparator<Author>() {
	public int compare(Author s1, Author s2) {
	int id1 = s1.getId();
	int id2 = s2.getId();

	/*For ascending order*/
	return id1-id2;
	}};
	
	public static Comparator<Author> fnameComparator = new Comparator<Author>() {
		public int compare(Author s1, Author s2) {
			int com = s1.firstName.compareTo(s2.firstName);
			return com ==0 ? s1.firstName.compareTo(s2.firstName): com;
		
		// For ascending order
		
		}};
}