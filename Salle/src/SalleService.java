import java.util.Iterator;
import java.util.List;

public class SalleService extends Salle implements ISalle {

	public SalleService(int id, String code, String libelle) {
		super(id, code, libelle);
	}

	void update(Object o) {

	}

	@Override
	public void delete(List<Salle> list) {
		Iterator<Salle> iterator = list.iterator();
		while (iterator.hasNext()) {
			Salle lists = iterator.next();
			System.out.println(lists);
		}

	}
	/*
	 * List findAll() {
	 * 
	 * }
	 * 
	 * List findById(int id) {
	 * 
	 * }
	 */

}
