package com.Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.interSalle.Isalle;
import com.salle.Salle;

public class SalleServices  implements Isalle{
	
	private List<Salle> salles;
	
	public SalleServices() {
		salles = new ArrayList<Salle>();
	}
	
	

	
	@Override
	public void Create(Salle s) {
		salles.add(s);
		
	}

	@Override
	public Salle Update(int id) {
		
	for (Salle salle : salles) {
		if(salle.getId() == id) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter new libellé");
			salle.setLibelle(sc.nextLine());
			System.out.println("Enter new Capacité");
			salle.setCapacite(sc.nextInt());
			return salle;
		}
	}return null;
		
	}

	@Override
	public boolean Delete(int id) {
		for (Salle salle : salles) {
			if(salle.getId() == id) {
				salles.remove(salle);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Salle> FindAll() {
		 
		return salles;
	}

	@Override
	public Salle Find(int id) {
		
		for (Salle salle : salles) {
			if(salle.getId() == id) {
				return salle;  
			}
		}return null;
		
	}

	
	
	

}
