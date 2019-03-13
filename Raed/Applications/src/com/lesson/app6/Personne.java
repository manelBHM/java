package com.lesson.app6;


//un accesseur en lecture pour l'attribut ami qui retourne la valeur de cet attribut ;

//un accessseur en écriture pour l'attribut ami qui sert à changer la valeur de cet attribut ;

 




public class Personne {
	
	private String nom;
	private Personne ami;
	
	
	
	//un constructeur ayant un paramètre de type String servant à initialiser l'attribut nom ;
	public Personne(String nom) {
		super();
		this.nom = nom;
	}

 

	//un constructeur ayant deux paramètres, un de type String et un de type Personne, servant à initialiser 
	//les attribut nom et ami
	public Personne(String nom, Personne ami) {
		super();
		this.nom = nom;
		this.ami = ami;
	}

	
	public void setPersonne(Personne ami){
		this.ami = ami;
	}
	

	//une méthode public String toString() qui retourne une chaîne de caractères donnant le nom et 
	//le nom de son ami (et si ami vaut null, le fait qu'il n'y a pas d'ami).
	@Override
	public String toString() {
		
		if(this.ami != null) {
			return nom+"is a friend with "+ami.nom;
		}else {
			return nom+" has no friends";
		}
	}
	
	


	

	
	
	

}
