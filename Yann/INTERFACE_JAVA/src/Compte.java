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
	
	
	public String consulterSolde()
	{
		 return this.solde+"";
		
	}
	
	
	
	public void deposer(int montant)
	{
		this.solde = this.solde+montant;
	}
	
	
	
	public void retirer(int montant)
	{
		this.solde = this.solde-montant;
	}
	
	
	public String getTitulaire() {
		return titulaire;
	}


	public int toInt()
	{
		return solde;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	}

}
