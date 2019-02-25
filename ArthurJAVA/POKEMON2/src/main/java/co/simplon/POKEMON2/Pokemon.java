package co.simplon.POKEMON2;

public class Pokemon implements IPokemon {

	final String nom;
	int PV;
	Attaques attaque1;
	Attaques attaque2;
	public Pokemon(String nom, int pV, Attaques attaque1, Attaques attaque2) {
		this.nom = nom;
		PV = pV;
		this.attaque1 = attaque1;
		this.attaque2 = attaque2;
	}
	public int getPV() {
		return PV;
	}
	public void setPV(int pV) {
		PV = pV;
	}
	public Attaques getAttaque1() {
		return attaque1;
	}
	public void setAttaque1(Attaques attaque1) {
		this.attaque1 = attaque1;
	}
	public Attaques getAttaque2() {
		return attaque2;
	}
	public void setAttaque2(Attaques attaque2) {
		this.attaque2 = attaque2;
	}
	public String getNom() {
		return nom;
	}
	
	
    

    
    





}
