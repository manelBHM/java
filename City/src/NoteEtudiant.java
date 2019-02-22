import java.util.Scanner;

public class NoteEtudiant {
	private int[] notes;
	private String nom;

	Scanner sc = new Scanner(System.in);

	public NoteEtudiant(String nom) {
		this.nom = nom;
	}

	public void minum(int nmNote) {
		notes = new int[nmNote];
		int note;
		for (int i = 0; i < nmNote; i++) {
			System.out.println("Saisir une note : ");
			note = sc.nextInt();
			notes[i] = note;
		}
	}

	public int moyene() {
		int someNote = 0;
		int resultat;
		for (int i = 0; i < notes.length; i++) {
			someNote += notes[i];
		}
		if (notes.length == 0) {
			System.out.println("Il ya pas de note");
			return 0;
		} else {
			resultat = someNote / notes.length;
			return resultat;
		}
	}

	public int min() {
		int min = notes[0];
		for (int i = 0; i < notes.length; i++) {
			if (min < notes[i]) {
				min = notes[i];
			}
		}
		return min;
	}

	public int max() {
		int max = notes[0];
		for (int i = 0; i < notes.length; i++) {
			if (notes[0] > max) {
				max = notes[0];
			}
		}
		return max;
	}

	public boolean valid() {
		int valid = moyene();
		if (valid >= 10) {
			return true;
		} else {
			return false;
		}
	}
}
