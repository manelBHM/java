package applicationTriCollectionsObjets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.Comparator;




public class Stagiaire {
	
Integer id, age;
String nom;

public Stagiaire(Integer id, String nom, Integer age)
{
	this.id = id;
	this.nom = nom;
	this.age = age;
}

public Integer getId() {
	return id;
}

public Integer getAge() {
	return age;
}

public String getNom() {
	return nom;
}




public static Comparator <Stagiaire> ageComparator = new Comparator<Stagiaire>()
{

public int compare(Stagiaire a1, Stagiaire a2)
{
	
Integer age1 = a1.getAge();
Integer age2 = a2.getAge();

return age1-age2;
}

};





public static Comparator <Stagiaire>  idComparator = new Comparator<Stagiaire>()
{

public int compare(Stagiaire i1, Stagiaire i2)
{
	
Integer id1 = i1.getId();
Integer id2 = i2.getId();

return id1-id2;
}

};




public static Comparator <Stagiaire>  nameComparator = new Comparator<Stagiaire>()
{

public int compare(Stagiaire n1, Stagiaire n2)
{

return n1.nom.compareTo(n2.nom);
}

};


public String toString() 
{
	return "[id=" +  this.getId() + ", Nom=" + this.getNom() +  ", Age="+ this.getAge()+"]";
}

}

