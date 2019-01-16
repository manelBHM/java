import java.util.Comparator;

public class Stagiaires {

String nom;
int age;
int id;

public Stagiaires(String nom, int age, int id) {
	this.nom=nom;
	this.age=age;
	this.id=id;
}
public String toString() {
	return ("[ id="+id+", name="+nom+", age="+age+"]");
	

	
}
public static Comparator<Stagiaires> ageComparator = new Comparator<Stagiaires>() {
	public int compare(Stagiaires o1, Stagiaires o2) {
		int age1=o1.getAge();
		int age2=o2.getAge();
		return age1-age2;
	}
};
public static Comparator<Stagiaires> nomComparator = new Comparator<Stagiaires>() {
	public int compare(Stagiaires o1, Stagiaires o2) {
		String nom1=o1.getnom();
		String nom2=o2.getnom();
		return nom1.compareTo(nom2);
	}
};

public int compare(Stagiaires arg0, Stagiaires arg1) {
	// TODO Auto-generated method stub
	return 0;
}
protected int getAge() {
	// TODO Auto-generated method stub
	return age;
}
protected String getnom() {
	return nom;
}
}
