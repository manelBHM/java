package com.lesson.app1;

public class TestEtudiant {

	public static void main(String[] args) {
		
		
		Publique st1 = new Publique("Toto");
		Publique st2 = new Publique("Raed");
		st1.travailler();
		st1.seReposer();
		
		System.out.println();
		st2.travailler();
		
		st2.seReposer();
		
		
	 

	}

}
