
public class App3 {

	public static void main(String[] args) {

		
		String nom ="Bonjour";
		String pal = "";
		
		
		
		for (int i=nom.length()-1 ;i>=0;i--) {
			
			pal+=nom.substring(i, i+1);
		}
		System.out.println("Bonjour a l'envers est " +pal);
		
		if (pal.equals(nom)) {
			System.out.println(nom + " est un palindrome");
		}
		else {
			System.out.println(nom + " n'est pas un pal");
		}
		
		
	
		
	}

}
