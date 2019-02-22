package appPokemon.pokemon;

public class Pokemon {
   private	int id;
	private static int conunt;
	protected static int getConunt() {
		return conunt;
	}

	private String nom;
	private int point;
	
	
	
	public Pokemon(String nom, int point) {
		this.id = ++conunt;
		this.nom = nom;
		this.point = point;
	
		
	}
	
	

	protected String getNom() {
		return nom;
	}



	protected void setNom(String nom) {
		this.nom = nom;
	}



	protected int getPoint() {
		return point;
	}



	protected void setPoint(int point) {
		this.point = point;
	}



	public void afficheResult(Pokemon pokemon) {
		if(this.point > pokemon.point) {
			System.out.println("Je suis plus fort que "+ pokemon.nom);
		}else if(this.point < pokemon.point){
			System.out.println("Je suis moins fort que "+ pokemon.nom);
		}else {
			System.out.println("Je suis à égalité avec "+ pokemon.nom);
		}
	}
	
	@Override
	public String toString() {
		
		return "Je suis le Pokémon "+ this.nom +"\n" + "J'ai "+ this.point + " points ";
	}
	
	

}
