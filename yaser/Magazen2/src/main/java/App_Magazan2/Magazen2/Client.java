package App_Magazan2.Magazen2;

public class Client {
	String nom;
	String adress;
	
	public Client(String nom, String adress) {
		
		this.nom=nom;
		this.adress=adress;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public void afficheClient() {
		
		System.out.println("Nom du client : "+this.nom+"\n"+"Adresse : "+this.adress);
		System.out.println("");
	}

}
