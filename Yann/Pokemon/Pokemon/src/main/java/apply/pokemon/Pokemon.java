package apply.pokemon;


public class Pokemon {

	private String nom;
	private int pv;
	private static int id;


	public Pokemon(String nom, int pv)
	{
		this.nom=nom;
		this.pv=pv;
		id++;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Je m'appelle " + this.getNom() + "\n" + "J'ai " + this.getPv()+" points de vie";
	}


	public void Fight(Pokemon pk)
	{

		if(pk.getPv()>this.getPv())
			System.out.println(this.getNom()+" est moins fort que " + " " + pk.getNom());
		else if(pk.getPv()<this.getPv())
			System.out.println(this.getNom()+" est plus fort que " + " " + pk.getNom());
		else 
			System.out.println(this.getNom()+" est de même niveau que " + " " + pk.getNom());

	}






}
