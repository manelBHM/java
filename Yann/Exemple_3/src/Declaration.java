
public class Declaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String phrase;

		phrase = "Voici mon exemple";


		//Deuxième méthode de déclaration

		String str = new String();

		str = "Une autre chaîne de caractères";


		//Troisième méthode de déclaration

		String string = "Une autre chaine";


		//Quatrième méthode de déclaration

		String chaine = new String("Et une de plus  :) !");
		
		
		// Les opérateurs et Variables
		
		double nbre1=10, nbre2=3;
		
		int resultat = (int)(nbre1 / nbre2);
		
	
		
		System.out.println("Le Resultat est :  " + phrase + ", " + str + ", " + string + ", " + chaine);
		System.out.println("Le resultat de la division en double est : " + nbre1/nbre2);
		System.out.println("Le resultat de la division en int est : " + resultat);
	}

}