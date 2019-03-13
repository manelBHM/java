package metier.dao;

import java.util.List;

public interface Idao<T> {
	
	public void Create(T e);
	public void Delete(int id);
	public T FindById(int id);
	public void Update(T e);
	public List<T> findByKeyWord(String kw);
	public List<T> findAll();
	

}
