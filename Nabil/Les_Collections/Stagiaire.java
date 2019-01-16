import java.util.Comparator;

public class Stagiaire {
	
	
	int id;
	String nom;
	int age;
	
	
	public Stagiaire (int id, String nom, int age) {
		
		this.id = id;
		this.nom = nom;
		this.age = age;
	}
	
	
	public String toString() {
		
		
		return "ID: "+ id + ", Nom: " + nom + ", Age:  "+ age;
		
	}
	
	public int getAge() {
		return age;
		}
		/*Comparator for sorting the list by id*/
		public static Comparator<Stagiaire> idComparator = new Comparator<Stagiaire>() {
		public int compare(Stagiaire s1, Stagiaire s2) { int id1 = s1.getAge();
		int id2 = s2.getAge();
		   /*For ascending order*/
		return id1-id2;
		}};


	
		
}
