package org.imdrmas.vente;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.imdrmas.users.Client;
import org.springframework.beans.factory.annotation.Value;
@Entity
public class ProduitsPannier implements Serializable{

	/**
	 * 
	 */

	@Id
	@Column
	private Long id_produit_pannier;
	@Column
	private String designation;
	@Column
	private int quantite;
	@Column
	private double prix;
	
	@ManyToOne
	@JoinColumn(name="id_client")
	private Client client;
	
	private boolean enStck;
	
	
	public ProduitsPannier(Long id_produit, String designation, int quantite, double prix, boolean enStck) {
		super();
		this.id_produit_pannier = id_produit;
		this.designation = designation;
		this.quantite = quantite;
		this.prix = prix;
		this.enStck = enStck;
	}
	public Long getId_produit_pannier() {
		return id_produit_pannier;
	}
	public void setId_produit_pannier(Long id_produit_pannier) {
		this.id_produit_pannier = id_produit_pannier;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public ProduitsPannier(Long id, String designation, int quantite, double prix) {
		super();
		this.id_produit_pannier = id;
		this.designation = designation;
		this.quantite = quantite;
		this.prix = prix;
	}
	public ProduitsPannier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id_produit_pannier;
	}
	public void setId(Long id) {
		this.id_produit_pannier = id;
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
	public boolean isEnStck() {
		return enStck;
	}
	public void setEnStck(boolean enStck) {
		this.enStck = enStck;
	}
	
	

}
