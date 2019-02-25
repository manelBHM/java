package com.annotation1;

public class Salle {
	
	int id;
	String code;
	String libelle;
	
	 
	
	public Salle(int id,String code, String libelle) {
		//super();
		this.id =id;
		this.code = code;
		this.libelle = libelle;
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public String getLibelle() {
		return libelle;
	}



	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


 
	

	

}
