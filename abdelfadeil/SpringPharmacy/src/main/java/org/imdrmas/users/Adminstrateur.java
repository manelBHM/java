package org.imdrmas.users;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adminstrateur implements Serializable{
	
	/**
	 * 
	 */

	 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Long id_admin;
	@Column
	private String prenom;
	@Column
	private String nom;
	@Column
	private String email;
	@Column
	private String password;

	public Adminstrateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Adminstrateur(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}



	public Adminstrateur(String prenom, String nom, String email, String password) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.password = password;
	}



	public Long getId_admin() {
		return id_admin;
	}
	
	
	
	public void setId_admin(Long id_admin) {
		this.id_admin = id_admin;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
