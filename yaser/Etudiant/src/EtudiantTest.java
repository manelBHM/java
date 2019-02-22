
public class EtudiantTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Etudiants john = new Etudiants("Jean Dupont");
		    john.saisieNotes(3);

		    System.out.println("calcul de la moyenne"+ john.moyenne());
		    System.out.println("Note minimale" + john.minimum());
		    System.out.println("Note maximale" + john.maximum());
		    System.out.println("Annee valide ? => " + john.valide());


	}

}
