
public class WordCount {

	public static void main(String[] args) {
		// trouver le nombre de mots, de caract�res et de lignes //
		
		String texte =  "Trente rayons convergent au moyeu mais c'est le vide median qui fait marcher le char."
		+ "\n" + "On fa�onne l'argile pour en faire des vases, mais c'est du vide interne que d�pend leur usage." + "\n"
				+ "Une maison est perc�e de portes et de fenetres, c'est encore du vide qui permet l'habitat."
		+ "\n" +"L'�tre donne des possibilit�s, c'est par le non-�tre qu'on les utilise." + "\n" + "The End \n";
		
		System.out.println(texte);
		
		System.out.println("Il y a : " + (texte.split(" ",-1).length - 1) + " mots.");
		System.out.println("Il y a : " + (texte.split("\n",-1).length - 1) + " retours � la ligne.");
		System.out.println("Il y a : " + (texte.split(".",-1).length - 1) + " caract�res.");
		
		
		
		
		
	}

}
