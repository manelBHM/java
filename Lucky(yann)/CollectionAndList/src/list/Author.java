package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.Comparator;

public class Author{
	
	String firstName, lastName, book;
	int id;
	
      public  Author(String firstName, String lastName, String book, int id) 
      {
		this.firstName = firstName;
		this.lastName = lastName;
		this.book = book;
		this.id = id;
	} 
	
     
	
	public int getId() {
		return id;
	}

	
	public String getFirstName() {
		return firstName;
	}

	
	/*
	
	public static  Comparator<Author> nameComparator = new Comparator<Author>()
			{
		
		public int compareTo(Author au){
			
			* Sorting by last name. compareTo should return < 0 if this(keyword)
			* is supposed to be less than au, > 0 if this is supposed to be
			* greater than object au and 0 if they are supposed to be equal.
			
			int last = this.lastName.compareTo(au.lastName);
			//Sorting by first name if last name is same d
			
			
			return last == 0 ? this.firstName.compareTo(au.firstName) : last;
			}
		
			};
			*/
			
			
			public static  Comparator<Author> idComparator = new Comparator<Author>()
			{
		
		public int compare(Author s1, Author s2)
		{
			int id1 = s1.getId();
			int id2 = s2.getId();
			
			return id2-id1;
		}
			};
	

	
	
	
	public static void afficherList(final List<Author> x)
	{
		for(Author str : x)
		{
			System.out.println(str.firstName + ", " + str.lastName + ", " + " Book : " + str.book + ", " + " id :"+ str.id);
		
		}
	}
	
	
		    
		      public static void trierReverse(final List<Author> x)
		  	{ 
		  		Collections.reverse(x);
		  	
		  	}
			
		      
		      public static void trier(final List<Author> x)
		    	{ 
		    		Collections.sort(x, Author.idComparator);
		    	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Author> liste = new ArrayList<Author>();
		
		liste.add(new Author("lucky", "stan", "les ulysses", 1));
		liste.add(new Author("stef", "martial", "les idoles", 2));
		liste.add(new Author("friday", "black", "kristoff", 4));
		liste.add(new Author("ilarus", "bent", "les affranchis", 3));
		liste.add(new Author("tookie", "williams", "best of", 4));
		liste.add(new Author("test", "state", "amerikaz", 1));
		
		System.out.println("Liste initial ==>");
		System.out.println(" ");
		
		afficherList(liste);
	
		System.out.println("");
		
		System.out.println("Liste Comparer par les id ==>");
		
		System.out.println("");
		
		trier(liste);
		afficherList(liste);
	}

}
