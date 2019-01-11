
	public  class Ville{
		
			private String nom;
			protected int nbHab; 
			public Ville (String leNom) {
				nom = leNom.toUpperCase( );
				nbHab = -1; 
			}
			
		public Ville(String leNom, int leNbHab){
			nom = leNom.toUpperCase( );
			
			if (leNbHab < 0)
			{ System.out.println("Un nombre d'habitant doit être positif.");      
			nbHab = - 1;
			}
			else 
				nbHab = leNbHab; }
		
			public String getNom ()
			{ return nom; }
			
			public  int getNbHab ()
			{ return nbHab ; }
			
			public void setNbHab (int nvNbHab)
			{if(nvNbHab < 0)
				System.out.println("Un nombre d'habitant doir être positif. La modification n'a pas été prise en compte");
			else nbHab = nvNbHab; }
			public String presenteToi ()
			{ String presente = "Ville "
					+ "" + nom + "nombre d'habitants";
			if (nbHab == -1)
				presente =presente + " inconnu" ;
			else
				presente =presente + " = " + nbHab;
			
			return presente;
			
		
		}
	}
		
		
		
		
		
		
		
		