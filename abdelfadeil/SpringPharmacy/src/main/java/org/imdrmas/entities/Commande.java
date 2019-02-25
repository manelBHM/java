package org.imdrmas.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.imdrmas.users.Client;

@Entity
public class Commande implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_com;
	private Date dateCommande;
	@ManyToOne
	@JoinColumn(name="id_client")
	private Client client;

	
}
