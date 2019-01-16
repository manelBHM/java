package com.gestiondesalles.tests;

import com.gestionsdesalles.services.Service;

public class Main {

	public static void main(String[] args) {

		Service service = new Service();

		service.creer();

		service.afficher();
		
		
		service.supprimer();

		System.out.println("");
		service.afficher();

		service.ajouter();

		System.out.println("");
		service.afficher();

		service.modifierId(1001, 1056);
		service.modifierCapacite(150, 300);
		service.modifierLibelle("Marguerite", "Mimosa");

		System.out.println("");
		service.afficher();

	}

}
