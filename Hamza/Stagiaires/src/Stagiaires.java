import java.util.Comparator;

public class Stagiaires {

	private String nom, prenom;
	private int age, id;

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public Stagiaires(String prenom, String nom, int age, int id) {
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.id = id;
	}

	@Override
//	public String toString() {
//
//		System.out.println("Je suis le stagiaire " + this.prenom + " " + this.nom + " , j'ai " + this.age
//				+ " ans et mon identifiant est le : " + this.id);
//		return super.toString();
//	}
	
	
	public String toString() {
		String s = "Je suis le stagiaire " + this.prenom + " " + this.nom + " , j'ai " + this.age
				+ " ans et mon identifiant est le : " + this.id ;
		return s;
	}
	

	public static Comparator<Stagiaires> ageComparator = new Comparator<Stagiaires>() {

		@Override
		public int compare(Stagiaires o1, Stagiaires o2) {

			return o1.getAge() - o2.getAge();

		}
	};

	public static Comparator<Stagiaires> idComparator = new Comparator<Stagiaires>() {

		@Override
		public int compare(Stagiaires o1, Stagiaires o2) {

			return o1.getId() - o2.getId();
		}
	};

	public static Comparator<Stagiaires> nomComparator = new Comparator<Stagiaires>() {

		@Override
		public int compare(Stagiaires o1, Stagiaires o2) {

			return o1.getNom().compareTo(o2.getNom());
		}
	};

	public static Comparator<Stagiaires> prenomComparator = new Comparator<Stagiaires>() {

		@Override
		public int compare(Stagiaires o1, Stagiaires o2) {

			return o1.getPrenom().compareTo(o2.getPrenom());
		}
	};

}
