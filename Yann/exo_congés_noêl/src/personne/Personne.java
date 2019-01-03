package personne;

public class Personne {

	protected String nom;
	protected Personne  ami;
	
	
	
	// Constructeur avec 1 PARAM
	
	public Personne(String nom)
	{
		super();
		this.nom=nom;
	}
	
	// Constructeur avec 2 PARAMS
	
	public Personne(String nom, Personne ami)
	{
		super();
		this.nom = nom;
		this.ami = ami;
		
	}
	
	
	
	
	// Methode Set Ami
	
	public void setAmi(Personne ami) {
		this.ami = ami;
	}


	
	// Methode pour Afficher le nom de la Personne et de son Ami
	
	public String toString()
	{
		String chaine;
		
		if(ami == null) {chaine = nom + " n'as pas d'ami";}
		else {
			chaine = nom + " a pour ami " + ami.nom;
		}
		return  chaine;
	}
	


}