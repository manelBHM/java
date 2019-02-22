package entites;

public class apprenant {
	private int id;
	private String nom;
	private String prenom;
	private String date_naissance;
	private int active;
	
	
	public apprenant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public apprenant(String nom, String prenom, String date_naissance, int active) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		this.active = active;
	}


	public String getNom() {
		return nom;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getDate_naissance() {
		return date_naissance;
	}


	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}


	public int getActive() {
		return active;
	}


	public void setActive(int active) {
		this.active = active;
	}


	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "- "+this.getId()+ " : "+this.getNom()+" "+ this.getPrenom() + " Status "+this.getActive();
	}
	
	

}
