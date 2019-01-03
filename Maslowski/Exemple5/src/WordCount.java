
public class WordCount {

	public static void main(String[] args) {
		// trouver le nombre de mots, de caractères et de lignes //
		
		String texte =  "Trente rayons convergent au moyeu mais c'est le vide median qui fait marcher le char."
		+ "\n" + "On façonne l'argile pour en faire des vases, mais c'est du vide interne que dépend leur usage." + "\n"
				+ "Une maison est percée de portes et de fenetres, c'est encore du vide qui permet l'habitat."
		+ "\n" +"L'être donne des possibilités, c'est par le non-être qu'on les utilise." + "\n" + "The End \n";
		
		System.out.println(texte);
		
		System.out.println("Il y a : " + (texte.split(" ",-1).length - 1) + " mots.");
		System.out.println("Il y a : " + (texte.split("\n",-1).length - 1) + " retours à la ligne.");
		System.out.println("Il y a : " + (texte.split(".",-1).length - 1) + " caractères.");
		
		
		
		
		
	}

}
