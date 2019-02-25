package generics;

public class MaClassGeneric<NOM, PRENOM, AGE> {

	private NOM nom;
	private PRENOM prenom;
	private AGE age;

	public MaClassGeneric (NOM nom, PRENOM prenom, AGE age) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	

	
	public NOM getNom() {
		return nom;
	}


	public PRENOM getPrenom() {
		return prenom;
	}



	public AGE getAge() {
		return age;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nom : " + this.nom + ", Prenom : " + this.prenom + ", Age : " + this.age;
	}

}
