package four;

public class RunFour {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Aliments a = new Aliments("Légume");
		
		Four four1 = new Four(190, 20, a);
		
		four1.cuire(a);
		
		four1.afficher();
		
	}

}
