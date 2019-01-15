
package com.gestionsdesalles.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gestiondesalles.interfaces.ISalle;
import com.gestiondesalles.objets.Salle;

public class Service implements ISalle {

	ArrayList<Salle> salle = new ArrayList<Salle>();
	Scanner sc = new Scanner(System.in);

	public Service() {

	}

	@Override
	public List<Salle> creer() {
		

		salle.add(new Salle(1001, "Marguerite", 150));
		salle.add(new Salle(1002, "Dahlia", 200));
		salle.add(new Salle(1003, "Tulipe", 70));

		return salle;
	}

	@Override
	public List<Salle> ajouter() {
		salle.add(2, new Salle(1004, "Lilas", 120));

		return salle;
	}

	@Override
	public List<Salle> supprimer() {
		salle.remove(1);

		return salle;
	}

	@Override
	public void afficher() {
		for (Salle valeur : salle) {
			System.out.println(valeur);

		}
		System.out.println("Le nombre de salles est  : " + salle.size());

	}

	@Override
	public List<Salle> modifierId(int oldId, int newId) {
		for (Salle valeur : salle) {
			if (oldId == valeur.getId()) {
				valeur.setId(newId);
			}

		}
		;
		return salle;
	}

	@Override
	public List<Salle> modifierLibelle(String oldLibelle, String newLibelle) {
		for (Salle valeur : salle) {
			if (oldLibelle == valeur.getLibelle()) {
				valeur.setLibelle(newLibelle);
			}

		}
		return null;
	}

	@Override
	public List<Salle> modifierCapacite(int oldCapacite, int newCapacite) {
		for (Salle valeur : salle) {
			if (oldCapacite == valeur.getCapacite()) {
				valeur.setCapacite(newCapacite);
			}

		}
		return null;
	}

}
