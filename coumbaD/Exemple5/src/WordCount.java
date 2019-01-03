
public class WordCount {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texte = "Trente rayon convergnent au moyeu" + "\n "
				+ "mais c'est le vide median" + "\n" 
				+ "qui fait marcher le char "+ "\n" +
				"On façonne l'argile pour en faire des vases,"+ "\n"
				+ "mais c'est du vide interne que dépend leur usage." ;
		
		int nbCaracteres = texte.length();
		int retourLigne = 1;
		int Espace =0;
		
		char ch;
		
		System.out.println(texte);
		System.out.println (" ");
		
		
		
		for(int i = 0 ; i < texte.length(); i++)
				{
				 ch = texte.charAt(i);
				 if (ch== '\n') {
				 retourLigne++;
				 }
				 else if (ch == ' ') {
				Espace++ ;
				 }
				
				}
		System.out.println("Il y a " + nbCaracteres + " Caractères dans le texte");
		System.out.println("Il y a " + (Espace + retourLigne)+ " mots le texte");
		System.out.println("Il y a " + retourLigne + " lignes dans le texte");
		
	}
	
	}
