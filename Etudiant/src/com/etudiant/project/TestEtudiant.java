package com.etudiant.project;

public class TestEtudiant {

	public static void main(String[] args) {
		Etudiant etudiant = new Etudiant("toto");
		Etudiant etudiant2 = new Etudiant("toto");
		etudiant.travailler();
		etudiant2.seRepose();

	}

}
