
import java.util.ArrayList;
import java.util.List;

 
public class SalleService implements ISalle<Salle> {
 
	private List<Salle> salles;
 
	public SalleService() {
		salles = new ArrayList<Salle>();
	}
 
	@Override
	public boolean create(Salle o) {
		return salles.add(o);
	}
 
	@Override
	public boolean update(Salle o) {
		for(Salle s : salles){
			if(s.getId() == o.getId()){
				s.setCode(o.getCode());
				s.setLibelle(o.getLibelle());
				return true;
			}
		}
		return false;
	}
 
	@Override
	public boolean delete(Salle o) {
		Salle.nbre_Salles --;
		return salles.remove(o);
	}
 
	@Override
	public List<Salle> findAll() {
		return salles;
	}
 
	@Override
	public Salle findById(int id) {
		for (Salle s : salles) {
			if (s.getId() == id)
				return s;
		}
		return null;
	}
 
}

