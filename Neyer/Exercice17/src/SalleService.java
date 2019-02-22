import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SalleService implements ISalle{
	
	List<Salle> salle = new ArrayList<Salle>();
	
	public SalleService() {
		
	}

	
	public boolean creer (Salle o) {
		// TODO Auto-generated method stub
		
		
		salle.add(o);
		
		
		return true;
	}

	@Override
	public boolean supprimerParId(int idRemove) {
		// TODO Auto-generated method stub
		
		salle.remove(idRemove);
		
		return true;
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		
		
			/*Iterator iterator = salle.iterator();
			
			System.out.println("Votre liste :");
			
			while(iterator.hasNext()) {
				
				System.out.println(iterator.next());
			}*/
		for(Salle str : salle) {
			System.out.println(str.id+" "+str.libelle);
		}
	}
	
	

	@Override
	public void afficherParId() {
		// TODO Auto-generated method stub
		
	}
	
}
