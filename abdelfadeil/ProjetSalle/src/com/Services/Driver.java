package com.Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.salle.Salle;


public class Driver {
	

	public static void main(String[] args) {
		System.out.println("test");
	SalleServices s = new SalleServices();
		
		s.Create(new Salle("salle 1", 250));
	    s.Create(new Salle("salle 2", 200));
		s.Create(new Salle("salle 3", 150));
		s.Create(new Salle("salle 4", 300));
		s.Create(new Salle("salle 5", 400));
		
		
	
	     List<Salle> liste =  s.FindAll();
	     Iterator it = liste.iterator();
	     
	while (it.hasNext()) {
		Salle ss = (Salle) it.next();
		System.out.println(ss);
		
	}
	       s.Create(new Salle("salle 6", 1200));
	       System.out.println(s.Delete(1));
           System.out.println(s.Update(3));
		
	       List<Salle> liste1 =  s.FindAll();
		     Iterator it1 = liste.iterator();
		     
		while (it.hasNext()) {
			Salle ss = (Salle) it.next();
			System.out.println(ss);
			
		}
	
		
		
	}

}
