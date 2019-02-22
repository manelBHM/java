
public class Person {
	private String nom;
	private String prenm;
	private String email;

	public Person() {
		this("Doe ", " Jhon ", " johndoe@gmail.com");
	}

	public Person(String nom, String prenm, String email) {
		super();
		this.setNom(nom);
		this.setPrenm(prenm);
		this.setEmail(email);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if (nom == null || nom.trim().equals(" ")) {
			throw new RuntimeException("valeur null");
		}
		this.nom = nom.trim().toUpperCase();
	}

	public String getPrenm() {
		return prenm;
	}

	public void setPrenm(String prenm) {
		if (nom == null || nom.trim().equals(" ")) {
			throw new RuntimeException("valeur null");
		}
		this.prenm = prenm.trim().toLowerCase();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email == null || !email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
			throw new RuntimeException("bad email");
		}
		this.email = email;
	}

	public String toString() {
		return this.nom + " " + this.prenm + " " + this.email;
	}

}
