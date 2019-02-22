package com.interSalle;

import java.util.List;

import com.Services.SalleServices;
import com.salle.Salle;

public interface Isalle {

	public void Create(Salle s);
	
	public Salle Update(int id);
	
	public boolean Delete(int id);
	
	public List<Salle> FindAll();
	
	public Salle Find(int id);

}
