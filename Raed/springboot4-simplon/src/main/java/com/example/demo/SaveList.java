package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class SaveList implements SaveAndAdd{

	private List<Stagiaire> stag = new ArrayList<Stagiaire>();
	
	@Override
	public void save(Stagiaire theStagiaire) {
		stag.add(theStagiaire);
	}

	@Override
	public List<Stagiaire> showList() {
 		return stag;
	}
	
	
	

}
