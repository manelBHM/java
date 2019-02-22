package com.stages;

import java.util.Comparator;

public class Stagiaire {

	protected int id;
	protected String name;
	protected int ag;
	public Stagiaire(int id, String name, int ag) {
		super();
		this.id = id;
		this.name = name;
		this.ag = ag;
	}
	
	
	
	

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}





	public static Comparator<Stagiaire> idCo = new Comparator<Stagiaire>() {
		
		public int compare(Stagiaire o1, Stagiaire o2) {
			int i1 = o1.getId();
			int i2 = o2.getId();
			
			return i1 - i2;
		} 
	};
	



	
	//sorting by names 
	public static Comparator<Stagiaire> nom = new Comparator<Stagiaire>() {

		@Override
		public int compare(Stagiaire n1, Stagiaire n2) {
 
			String na1 = n1.getName();
			String na2 = n2.getName();
			return na1.compareTo(na2);
		}
		
	};

	public static Comparator<Stagiaire> idCo2 = new Comparator<Stagiaire>() {
		
		public int compare(Stagiaire o1, Stagiaire o2) {
			int i1 = o1.getId();
			int i2 = o2.getId();
			
			return i2 - i1;
		} 
	};
		
		

	
	
	
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", ag=" + ag + "]\n";
	}
	
	
	
}
	
	

	

