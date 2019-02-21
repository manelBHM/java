package exple5;

public class wordcount {

	public static void main(String[] args) {
		
		
		String text = "Trente rayons convergent en moyenne" +
		"mais c'est le vide median" +
		"qui fait marcher le char." +"\n"+
		"On faconne l'argile pour en faire des vases, mais c'est du vide interne que depend leur usage." +"\n"+
		"Une maison est percee de portes et de fenetres," +
		"c'est encore le vide" +
		"qui permet l'habitat." + "\n" +
		"L'etre donne des possibilites, c'est par le non-etre qu'on les utilises." + "\n" +
		"Fin. \n";
		boolean dansMot=false;
		int nombrechars= 0, nombreMots=0, nombreLignes=0;
		for( int i=0; i<text.length(); i++) {
			char c = text.charAt(i);
			nombrechars++;
			switch (c) {
			case '\n':
				nombreLignes++;
			case '\t':
			case ' ':
				if (dansMot) {
					nombreMots++;
					dansMot=false;
				}
				break;
			default:
				dansMot=true;
			}
			
			
			nombreMots++;
			nombreLignes++;
			
		}
	System.out.println(nombrechars + "\t" + nombreMots + "\t" + nombreLignes);

	}
	
}
