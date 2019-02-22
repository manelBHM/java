public class Date implements Convertible{
	
	int jour, mois, annee;
	
	public Date(int j, int m, int a)
	{
		this.jour = j;
		this.mois = m;
		this.annee = a;
	}
	
	
	public void afficherDate()
	{
		System.out.println(this.jour + "," + this.mois + "," + this.annee );
	}
	
	public int toInt()
	{
		return jour+mois*100+annee*10000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date x = new Date(13, 12, 2018);
	    System.out.println(x.toInt());
	}

}
