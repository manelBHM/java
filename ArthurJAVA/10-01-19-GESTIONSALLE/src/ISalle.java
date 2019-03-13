import java.util.LinkedList;

public interface ISalle {

	
	public LinkedList<Salle> create();
	
	public void update();
	


	void clearList(LinkedList<Salle> liste);
	
	public void afficherSalles(LinkedList<Salle> liste);

	void delete(LinkedList<Salle> liste);
	
	
	
}
