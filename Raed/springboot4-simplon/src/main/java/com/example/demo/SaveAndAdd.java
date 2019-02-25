package com.example.demo;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface SaveAndAdd {
	
	public void save(Stagiaire theStagiaire);
	
	public List<Stagiaire> showList();

}
