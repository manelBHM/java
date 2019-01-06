public class Compte implements Convertible {
	
	int solde;
	String titulaire;
	int numero;
	
	public Compte(String n, int num)
	{
		titulaire = n;
		numero = num;
		solde = 0;
	}
	
	
	public void afficher()
	{
		System.out.println("Solde " + this.solde);
		
	}
	
	
	public void deposer(int montant)
	{
		this.solde = this.solde+montant;
	}
	
	public void retirer(int montant)
	{
		this.solde = this.solde-montant;
	}
	
	
	public void titulaire()
	{
		System.out.println(titulaire);
	}
	
	
	
	public int toInt()
	{
		return solde;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	}

}
