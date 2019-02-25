package co.apiMagasin;

public class Client {
	private String fullName;
	private String adresse;

	public Client(String fullName, String adresse) {
		this.fullName = fullName;
		this.adresse = adresse;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
