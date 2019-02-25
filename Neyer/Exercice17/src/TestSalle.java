
public class TestSalle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalleService s1 = new SalleService();
		s1.creer(new Salle("B","salle 2"));
		s1.creer(new Salle("A","salle 3"));
		s1.afficher();

	}

}
