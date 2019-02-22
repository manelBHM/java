package co.hamza.TomEtJerry.animaux;

public class Chat {

	private String nom;
	private int age ;
	
	Souris souris = new Souris();
	
	public Chat() {
		// TODO Auto-generated constructor stub
	}
	
	public Chat(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	public int tuer(Chat chat) {
		
		if(chat.age > 0 && chat.age < 3) {
			
			
			
		}else if(chat.age > 10) {
			
		}else {
			
		}
		
		
		return null;
		
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Souris getSouris() {
		return souris;
	}

	public void setSouris(Souris souris) {
		this.souris = souris;
	}

	
	
	
	
	
	
	
}
