package four;

public class RunFour {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Aliments aliment1 = new Aliments("Pomme de terre");
		Aliments aliment2 = new Aliments("Poulet");
		
		
		Four four1 = new Four(190, 20, aliment1);
		Four four2 = new Four(90, 15, aliment2);
		
		
		
		four1.cuire(aliment1);
		
		four2.cuire(aliment2);
	
		
		four1.afficher();
		four2.afficher();
		
		
		
		
	}

}
