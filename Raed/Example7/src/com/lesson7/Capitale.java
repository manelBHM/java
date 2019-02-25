package com.lesson7;

public class Capitale extends Ville{
	protected String pays;
		
	public Capitale ()
		{
		
		}	
		

	public Capitale(String ville, int nbreD, String pays) {
		super (ville , nbreD);
		// this.ville= ville;
		// this.nbreD= nbreD;
		this.pays = pays;
		
	}

	


	public Capitale(String ville, String pays) {
		super ();
		this.ville= ville;
		this.pays = pays;
	}




	public String  presentToi() {
		String h ;
		String m;
		if(nbreD >0) {
			h = ""+nbreD;
			m = "ville "+this.ville+"nombre d'habitants "+h+" est la capitale de "+ pays;
		}else {
			h = "incoun";
			m = "ville "+this.ville+"nombre d'habitants "+h+" est la capitale de "+ pays;
			
		}
		
		return m;
		 	
		
	}
	
	
	
	

	 
 
}
