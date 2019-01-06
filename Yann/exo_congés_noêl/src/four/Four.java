package four;

public class Four implements Cuire{

	int puissance, capacite;
	Aliments aliment;
	
	
	public Four(int puissance, int capacite, Aliments aliment)
	{
		this.puissance=puissance;
		this.capacite=capacite;
		this.aliment=aliment;
	}
	
	
	
	public int getPuissance() {
		return puissance;
	}

	

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	

	public int getCapacite() {
		return capacite;
	}

	

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	
	public Aliments cuire (Aliments aliment)
	{
	       return aliment;
	}
	
	
	public void afficher()
	{
		System.out.println("Je cuis un aliment : " + aliment.getAliment() + "\navec ma capacité de " + this.capacite + " litres\n" + "et ma puissance de " + this.puissance + " degrés.");
          System.out.println("");
	}


}
