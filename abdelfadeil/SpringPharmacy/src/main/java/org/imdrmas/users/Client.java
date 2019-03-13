package org.imdrmas.users;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.imdrmas.entities.Produits;
import org.imdrmas.vente.ProduitsPannier;

@Entity
public class Client implements Serializable{
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column
	private Long id_client;
	@Column
	private String prenom;
	@Column
	private String nom;
	@Column
	private String email;
	@Column
	private String adresse;
	@Column
	private String password;
	@Column
	@OneToMany(mappedBy="client")
	private Collection<Produits> produits = new ArrayList<>(); 
	
	
	
	public Client(String prenom, String nom, String email, String adresse, String password) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.adresse = adresse;
		this.password = password;
		
	}

	public Client(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public Client(String prenom, String nom, String email, String password) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.password = password;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId_client() {
		return id_client;
	}

	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Produits> getProduits() {
		return this.produits;
	}

	public void setProduits(Collection<Produits> produits) {
		this.produits = produits;
	}
	
	
	

}
