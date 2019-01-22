package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortAuthorByNames {
	public static void main(String args[]) {
// List of objects of Author class
		ArrayList<Author> al = new ArrayList<Author>();
		al.add(new Author("Gustave", "Flaubert", "Madame Bauvary", 1));
		al.add(new Author("William", "Shakespear", "Hamlet", 3));
		al.add(new Author("Charles", "Baudelaire", "Les Fleurs du Mal", 2));
		al.add(new Author("Jonathan", "Shakespear", "Les Voyages de Gulliver", 5));
		al.add(new Author("Hermann", "Hesse", "Le Jeu des perles de verre", 4));
		for (Author str : al) {
			System.out.println(str.firstName + " " + str.lastName + " " + "Book: " + str.bookName + "id: " + str.id);
		}
		Collections.sort(al, Author.idComparator);
		for (Author str : al) {
			System.out.println(str.firstName + " " + str.lastName + " " + "Book: " + str.bookName + "id: " + str.id);
		}
	}
}