package com.lesson7;

public class Ville {

	protected String ville ;
	protected int nbreD ;
	protected int var ;
 
	
	public Ville()
	{
	
	}
	
	public Ville(String ville,int var) {
		super();
 
		this.var = var;
		this.ville = ville;
	}
	
	
	
	
	public Ville(String ville) {
		super();
		this.ville = ville;
	}

		
	

	public String  presentToi() {
		String h ;
		String m;
		if(var >0) {
			h = ""+var;
			m = "ville "+this.ville+"nombre d'habitants "+h;
		}else {
			h = "incoun";
			m = "ville "+this.ville+"nombre d'habitants "+h;
			
		}
		
		return m;
		 	
		
	}
	


	
	
	
	
	
	
	

}
