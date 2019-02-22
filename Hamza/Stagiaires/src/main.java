import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {

	public static void main(String[] args) {

		Stagiaires stagiaire = new Stagiaires("Nordine", "ATEUR", 25, 221);

		System.out.println("L'affichage de la méthode toString donne : ");
		System.out.println(stagiaire.toString());
		System.out.println("");

		List<Stagiaires> liste = new ArrayList<Stagiaires>();
		liste.add(new Stagiaires("Gérard", "MENVUSSA", 53, 222));
		liste.add(new Stagiaires("Gérard", "MENFIN", 33, 512));
		liste.add(new Stagiaires("Omar", "CHAIFRET", 19, 546));
		liste.add(new Stagiaires("Richard", "CUTIER", 23, 412));

		System.out.println("La liste originale : \n");
		for (Stagiaires valeur : liste) {
			System.out.println("[id = " + valeur.getId() + ", " + "Prenom = " + valeur.getPrenom() + ", " + "Nom = "
					+ valeur.getNom() + ", " + "Age = " + valeur.getAge() + "]");

		}
		System.out.println("");
		System.out.println("La liste triée par âge : \n");
		Collections.sort(liste, Stagiaires.ageComparator);
		for (Stagiaires valeur : liste) {
			System.out.println("[id = " + valeur.getId() + ", " + "Prenom = " + valeur.getPrenom() + ", " + "Nom = "
					+ valeur.getNom() + ", " + "Age = " + valeur.getAge() + "]");
		}

		System.out.println("");
		System.out.println("La liste triée par id : \n");
		Collections.sort(liste, Stagiaires.idComparator);
		for (Stagiaires valeur : liste) {
			System.out.println("[id = " + valeur.getId() + ", " + "Prenom = " + valeur.getPrenom() + ", " + "Nom = "
					+ valeur.getNom() + ", " + "Age = " + valeur.getAge() + "]");
		}

		System.out.println("");
		System.out.println("La liste triée par nom : \n");
		Collections.sort(liste, Stagiaires.nomComparator);
		for (Stagiaires valeur : liste) {
			System.out.println("[id = " + valeur.getId() + ", " + "Prenom = " + valeur.getPrenom() + ", " + "Nom = "
					+ valeur.getNom() + ", " + "Age = " + valeur.getAge() + "]");
		}

		System.out.println("");
		System.out.println("La liste triée par prénom : \n");
		Collections.sort(liste, Stagiaires.prenomComparator);
		for (Stagiaires valeur : liste) {
			System.out.println("[id = " + valeur.getId() + ", " + "Prenom = " + valeur.getPrenom() + ", " + "Nom = "
					+ valeur.getNom() + ", " + "Age = " + valeur.getAge() + "]");
		}
	}

}
