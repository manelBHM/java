package co.simplon.ExerciceMavenAchat;

public class Four extends Produit {
	
	double contientMax;
	double temperatureMax;
	static String  nomProduit = "Four";

	public Four( double prix, double contientMax, double temperatureMax) {
		super(nomProduit,prix);
		this.contientMax=contientMax;
		this.temperatureMax=temperatureMax;
		
	}
	
	public void afficheProduit() {
		
		System.out.println("Le produit : "+ nomProduit + ", coûte : " + prix+"€");
		System.out.println("Propiétés : Contient Maximum : "+contientMax+"m3 ; "+"température Max : " +temperatureMax+"C°");
		System.out.println("");
	}
}