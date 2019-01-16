import java.util.ArrayList;
import java.util.List;

public class Personne {

	String nom = "";
	int id;
	String nomLivre;

	public Personne(String nom, int id) {
		this.nom = nom;
		this.id = id;
		List<String> userList = new ArrayList<>();
	}

	public void ajouter(String nomLivre) {

	}

	public void retirer(String nomLivre) {

	}

	public void réserver() {

	}

	public void retourner() {

	}

	public String getName() {
		return nom;
	}

	public int getId() {
		return id;
	}
}
