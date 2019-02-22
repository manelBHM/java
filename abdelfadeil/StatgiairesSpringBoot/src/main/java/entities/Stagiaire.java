package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Stagiaire implements Serializable{
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_stagiaire;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private String matricule;
	
	public int getId_stagiaire() {
		return id_stagiaire;
	}


	public void setId_stagiaire(int id_stagiaire) {
		this.id_stagiaire = id_stagiaire;
	}


	public Stagiaire(String nom, String prenom, String matricule) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	
	
	

}
