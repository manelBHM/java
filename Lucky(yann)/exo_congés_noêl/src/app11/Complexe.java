package app11;
import java.util.*;

public class Complexe implements iOperation, iAffichage {

	
	int im, re;
	
	public Complexe(int re, int im)
	{
		this.re=re;
		this.im=im;
	}
	
	
	// Methode numero 1 pour l'addition @@@@@@@@@@
	
	public Complexe plus(Object obj)
	{
		
		Complexe c = (Complexe) obj;
		return new Complexe(this.re + c.re, this.im + c.im);	
	}
	
	
	// Methode numero 2 pour l'addition @@@@@@@@@
	
	public Complexe plus(Complexe obj)
	{
		int nbreel = this.re + obj.re;
		
		int nbrim = this.im + obj.im;
		
		Complexe globale = new Complexe(nbreel, nbrim);
		
		return globale;	
	}
	
	
	
	
	
	
	
	// Methode numero 1 pour la Soustraction @@@@@@@@@
	public Complexe moins(Object obj)
	{
		Complexe c = (Complexe) obj;
		return new Complexe(this.re - c.re, this.im - c.im);
	}
	
	
	// Methode numero 2 pour la Soustraction @@@@@@@@@
	public Complexe moins(Complexe obj)
	{
		int nbreel = this.re - obj.re;
		
		int nbrim = this.im - obj.im;
		
		Complexe globale = new Complexe(nbreel, nbrim);
		
		return globale;	
	}
	
	
	
	
	
	
	
	public String affiche()
	{
		if(im>0)
			return this.re + " + " + this.im + " i ";
		
		else if(im<0)
			
			return this.re + " " + this.im + " i ";
		
		else
			return this.re + "";
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
