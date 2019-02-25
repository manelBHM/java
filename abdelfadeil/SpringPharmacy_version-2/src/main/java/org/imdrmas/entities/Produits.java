package org.imdrmas.entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.imdrmas.users.Client;

@Entity
public class Produits implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id_produit;
	@Column
	private String designation;
	@Column
	private int quantite;
	@Column
	private double prix;
	@ManyToOne
	@JoinColumn(name="id_client")
	private Client client;
	
	
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Long getId_produit() {
		return id_produit;
	}
	public void setId_produit(Long id_produit) {
		this.id_produit = id_produit;
	}
	
	public Produits(String designation, int quantite, double prix, Long id_client) {
		super();
		this.designation = designation;
		this.quantite = quantite;
		this.prix = prix;
		id_client = id_client;
	}
	
	public Produits(String designation, int quantite, double prix, Client client) {
		super();
		this.designation = designation;
		this.quantite = quantite;
		this.prix = prix;
		this.client = client;
	}
	public Produits(Long id, String designation, int quantite, double prix) {
		super();
		this.id_produit = id;
		this.designation = designation;
		this.quantite = quantite;
		this.prix = prix;
	}
	public Produits(String designation, Integer quantite, Double prix) {
		super();
		this.designation = designation;
		this.quantite = quantite;
		this.prix = prix;
	}
	
	public Produits() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id_produit;
	}
	
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	

}
