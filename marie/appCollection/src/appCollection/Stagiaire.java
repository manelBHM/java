package appCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;


public class Stagiaire {

	String nom;
	int age;
	int id;
	
	public Stagiaire(String nom, int age, int id) {
		super();
		this.nom = nom;
		this.age = age;
		this.id = id;
		
	}

	@Override
	public String toString() {
		return "Stagiaire [ id= " + id + ",nom= " + nom + ", age= " + age + "]";
	}
	
	public int compareTo(Stagiaire st) {
		
        return (this.age - st.age);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static Comparator<Stagiaire> ComparatorAge = new Comparator<Stagiaire>() {
        public int compare(Stagiaire s1, Stagiaire s2) {
            return (int) (s1.getAge() - s2.getAge());
        }
	};
}



















