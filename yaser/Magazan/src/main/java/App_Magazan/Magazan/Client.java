package App_Magazan.Magazan;

public class Client {
	private String nom;
	private String adresse;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}
	
	public Client(String nom, String adresse) {
		this.nom = nom;
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", adresse=" + adresse + "]";
	}


}
