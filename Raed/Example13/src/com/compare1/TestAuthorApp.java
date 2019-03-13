package com.compare1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestAuthorApp {

	public static void main(String[] args) {	
		
		List<Author> author = new ArrayList<Author>();
		author.add(new Author("Gustave","Flaubert", "Madame Bauvary",1));
		author.add(new Author("William","Shakespear", "Hamlet",3));
		author.add(new Author("Charles","Baudelaire", "Les Fleurs du Mal",2));
		author.add(new Author("Jonathan","Swift", "Les Voyages de Gulliver",5));
		author.add(new Author("Hermann","Hesse", "Le Jeu des perles de verre",4));
		

 
		//Collections.sort(author, Author.idco); //this is with comparator method
		
		Collections.sort(author);
		
		for(Author str:author) {
			System.out.println(str.firstName+" "+ str.lastName+" "+"Book: "+str.bookName +"id: " +str.id);
		}
		
		System.out.println();
		
		
		
	 
	 

	}

}
