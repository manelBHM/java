
public class Etutiant {

	public static void main(String[] args) {
		NoteEtudiant etude = new NoteEtudiant("jean");
		etude.minum(3);
		System.out.println("La note minimum de " + "est de " + etude.min());
		System.out.println("La note max de " + "est de " + etude.max());
		System.out.println("La note moyene de " + "est de " + etude.moyene());
		System.out.println("Annee valide ? => " + etude.valid());
	}
}