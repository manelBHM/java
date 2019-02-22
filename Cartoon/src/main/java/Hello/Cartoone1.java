package Hello;

public class Cartoone1 {
	 
	String name;
	String prenom;
	

	Cartoone1(String name, String prenom){
		this.name=name;
		this.prenom=prenom;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "du bean :" + name + prenom ;
	}
}
