package com.annotation1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public  class ServiceSalle  implements ISalle{

	Salle ss =  null;  //new Salle(null, null);
	
	
	
	
	@Override
	public void Create(Salle s) {
		
		List<Salle> salle = new ArrayList<Salle>();
		salle.add(s);
		for(Salle c:salle) {
			System.out.println(ss.getCode()+": "+ss.getLibelle()+": "+ss.getId());
		}
	 
		
	}
	
	
	
	

	@Override
	public void update(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}




 
 
	
	
	
	
	
	
	
 

 
 
 
	

}
