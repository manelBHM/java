package app11;
import java.util.*;

public class Reel implements iOperation, iAffichage {
	
int re;
	
	public Reel(int re)
	{
		this.re=re;
	}
	
	
	// Methode numero 1 pour l'addition @@@@@@@@@@
	
	public Reel plus(Object obj)
	{
		Reel c = (Reel) obj;
		
		return new Reel(this.re + c.re);	
	}
	
	
	// Methode numero 2 pour l'addition @@@@@@@@@
	
	public Reel plus(Reel obj)
	{
		int nbreel = this.re + obj.re;
		
		Reel globale = new Reel(nbreel);
		
		return globale;	
	}
	
	
	
	
	
	
	

	// Methode numero 1 pour l'addition @@@@@@@@@@
	
	public Reel moins(Object obj)
	{
		Reel c = (Reel) obj;
		
		return new Reel(this.re - c.re);	
	}
	
	
	// Methode numero 2 pour l'addition @@@@@@@@@
	
	public Reel moins(Reel obj)
	{
		int nbreel = this.re - obj.re;
		
		Reel globale = new Reel(nbreel);
		
		return globale;	
	}
	
	
	
	
	
	
	
	public String affiche()
	{
			return this.re + "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
}
