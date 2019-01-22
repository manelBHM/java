package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortAuthorByNames {
	public static void main(String args[]) {
// List of objects of Author class
		ArrayList<Author> al = new ArrayList<Author>();
		al.add(new Author("Gustave", "Flaubert", "Madame Bauvary", 1));
		al.add(new Author("William", "Shakespear", "Hamlet", 3));
		al.add(new Author("Charles", "Baudelaire", "Les Fleurs du Mal", 2));
		al.add(new Author("Jonathan", "Swift", "Les Voyages de Gulliver", 5));
		al.add(new Author("Hermann", "Hesse", "Le Jeu des perles de verre", 4));
		/*
		 * Sorting the list using Collections.sort() method, we can use this method
		 * because we have implemented the Comparable interface in our user defined
		 * class Author
		 */
		Collections.sort(al);
		for (Author str : al) {
			System.out.println(str.firstName + " " + str.lastName + " " + "Book: " + str.bookName + "id: " + str.id);
		}
	}
}