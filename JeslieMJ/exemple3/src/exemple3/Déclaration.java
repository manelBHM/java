package exemple3;

public class Déclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = new String();
str ="Hello";
System.out.println(str);


String phrase;
phrase ="Voici Jeslie";
System.out.println(phrase);


String string ="C'est encore moi!";
System.out.println(string);

String chaine =new String("C'est encore encore moi !");
System.out.println(chaine);

System.out.println(string+ "  " +phrase+ "  " +chaine);

	double nbre1 = 10, nbre2 = 3;
	//int resultat = (int)(nbre1 / nbre2);
	System.out.println("Le résultat est = " + ((int) (nbre1/ nbre2)));
	
	//System.out.print'"Résultat = " + nbre1/nbre2);//ceci permet d'économiser une variable et par conséquent de la mémoire
	

	}
}
