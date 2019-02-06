package etudiant;
import java.util.Scanner;


public class Etudiant {
	
	Scanner sc = new Scanner(System.in);
	
	private String nom;
	
	
	
	public Etudiant(String nom)
	{
		this.nom=nom;
	}
	
	
	public void travailler()
	{
		
		System.out.println(this.nom + " se met au travail");
	}
	
	
	
	public void seReposer()
	{
	
		System.out.println(this.nom + " se repose ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
