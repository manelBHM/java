package co.simplon.ExerciceMavenAchat;

public class NoProductInFactureExeception extends Exception{
	
	public NoProductInFactureExeception() {
		System.out.println("Votre panier est vide.");
	}

}
