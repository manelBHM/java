import java.beans.DefaultPersistenceDelegate;
import java.util.LinkedList;

public class SalleMain {

	public static void main(String[] args) {

		SalleService service = new SalleService();

		LinkedList<Salle> s1 = service.create();

		service.menu(s1);
		

		// System.out.println("BIENVENUE DANS LA GESTION DE SALLE");

	}

}
