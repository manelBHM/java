package co.hamza.TomEtJerry.des;

import java.util.Random;

public class Des {
	
private	char faces[] = {'A', 'B', 'C', 'D'} ;
	
	public Des() {
		
	}
	
	public char lancer() {
		Random hasard = new Random();
		int i = hasard.nextInt(faces.length);
		return faces[i];
	}
	
	
}
