import java.util.Comparator;
import java.util.Scanner;

public class Stagiaire {

	String nom;
	int age;
	int id;

	public Stagiaire(String nom, int age, int id) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Veuillez entrez le nom du stagiaire");
		 * 
		 * this.nom = sc.nextLine();
		 * System.out.println("Veuillez entrer l'age du stagiaire");
		 * 
		 * this.age = sc.nextInt();
		 * System.out.println("Veuillez entrer l'ID du stagiaire");
		 * 
		 * this.id = sc.nextInt();
		 */

		this.nom = nom;
		this.age = age;
		this.id = id;

	}
    
	
	
	public String toString() {

		return "id : " + id + " name : " + nom + " age : " + age;
	}

	public static Comparator<Stagiaire> idComparator = new Comparator<Stagiaire>() {
		public int compare(Stagiaire o1, Stagiaire o2) {
			// TODO Auto-generated method stub
			int id1 = o1.getId();
			int id2 = o2.getId();
			return id1 - id2;
		}
	};

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static Comparator<Stagiaire> ageComparator = new Comparator<Stagiaire>() {
		public int compare(Stagiaire o1, Stagiaire o2) {
			// TODO Auto-generated method stub
			int age1 = o1.getAge();
			int age2 = o2.getAge();
			return age1 - age2;
		}
	};

	// public static Comparator<Stagiaire> ageComparator = new
	// Comparator<Stagiaire>() {

	// };

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public char getPol() {
		
		
		return nom.charAt(0);
	}


	public static Comparator<Stagiaire> nameComparator = new Comparator<Stagiaire>() {
		public int compare(Stagiaire o1, Stagiaire o2) {
			// TODO Auto-generated method stub
			
			char name1 = o1.getPol();
			char name2 = o2.getPol();
			return name1 - name2;
		}
	};
	

	

}