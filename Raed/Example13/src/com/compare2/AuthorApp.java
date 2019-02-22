package com.compare2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.compare1.Author;

public class AuthorApp {

	public static void main(String[] args) {
 
		
		ArrayList<Author> au = new ArrayList<Author>();
		au.add(new Author("Gustave","Flaubert", "Madame Bauvary",1));
		au.add(new Author("William","Shakespear", "Hamlet",3));
		au.add(new Author("Charles","Baudelaire", "Les Fleurs du Mal",2));
		au.add(new Author("Jonathan","Swift", "Les Voyages de Gulliver",5));
		au.add(new Author("Hermann","Hesse", "Le Jeu des perles de verre",4));
		

 
	/*	
		for(Author str:au){
			System.out.println(str.firstName+" "+ str.lastName+" "+"Book: "+str.bookName +"id: " +str.id);
			}
	 
		
		System.out.println(author);
		

		
		Collections.sort(au,Author.firstcomp);
		for(Author str:au){
		System.out.println(str.firstName+" "+ str.lastName+" "+"Book: "+str.bookName +"id: " +str.id);
		}
		*/
		
		
		
	}

}
