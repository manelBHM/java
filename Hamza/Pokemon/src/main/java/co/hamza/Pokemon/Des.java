package co.hamza.Pokemon;

import java.util.Random;

public class Des {
	
	int faces[] = {1, 2, 3, 4, 5, 6} ;
	
	public Des() {
		
	}
	
	public int lancer() {
		Random hasard = new Random();
		int i = hasard.nextInt(faces.length);
		return faces[i];
	}
	
	
	
	
	
	
	
	
	
	

}