package exemple5;

public class CompterUnTexte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dire le nombre de mots, lignes et caractères
		
		String text = "Trente rayons"; //convergent au moyeu "+ "mais c'est le vide median" + "qui fait marcher le char."+"\n"+"On faconne l'argile pour en faire des vases,"+"mais c'est du vide interne que depend leur usage.";
		
		/*String tabText = text;
		
		int nombreLettre = 0;
		
		for(int i = 0 ; i < tabText.length();i++) {
			
			
			nombreLettre ++;
			
		}
		
		System.out.println("Nombre de lettre : "+nombreLettre);*/
		
		
		int nbCarac = 0, nbLignes=0, nbMots = 0;
		for(int i = 0 ; i < text.length();i++) {
			char c = text.charAt(i);
			nbCarac++;
			//System.out.println(c);
		}
		
		System.out.println(nbCarac);
	}
	
}
