import java.util.Random;

public class Nom {

	public static void main(String[] args) {

		
		String[] tableau = {"Arthur", "Nabil", "Sami", "Ismail", "Fadel", "Tony", "Hamza", "Leila", "Coumba", "Jeslie",
			"Nala", "Inconnu", "Yasser", "Benjamin", "Kevin", "Inconnu2", "Samba", "Marie", "Yann", "Mahfuj"};
		
		
         int i = new Random().nextInt(tableau.length);        
         
System.out.println(tableau[i]);       

	}

}
