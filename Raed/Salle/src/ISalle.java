
import java.util.List;
 
public interface ISalle<T> {
	boolean create(T o);
 
	boolean update(T o);
 
	boolean delete(T o);
 
	List<T> findAll();
 
	T findById(int id);
 
}

