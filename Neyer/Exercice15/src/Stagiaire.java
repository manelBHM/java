import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Stagiaire {

	String nom;
	Integer age;
	Integer id;

	public Stagiaire(Integer id, String nom, Integer age) {
		this.id=id;
		this.nom=nom;
		this.age=age;
	}


	public String getNom() {
		return nom;
	}


	public Integer getAge() {
		return age;
	}


	public Integer getId() {
		return id;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id : "+this.id+", name : "+this.nom+", age : "+this.age;
	}


	public static Comparator<Stagiaire> idComparator = new Comparator<Stagiaire>() {

		public int compare(Stagiaire s1, Stagiaire s2) {
			Integer id1 = s1.getId();
			Integer id2 = s2.getId();

			/*For ascending order*/
			return id1-id2;
		}
	};

	
	public static Comparator<Stagiaire> ageComparator = new Comparator<Stagiaire>() {

		public int compare(Stagiaire s1, Stagiaire s2) {
			Integer age1 = s1.getAge();
			Integer age2 = s2.getAge();

			/*For ascending order*/
			return age2-age1;
		}
	};

	public static Comparator<Stagiaire> nomComparator = new Comparator<Stagiaire>() {

		public int compare(Stagiaire s1, Stagiaire s2) {
			
			/*For ascending order*/
			return s1.nom.compareTo(s2.nom);
		}
	};
}