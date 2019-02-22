//import java.util.Arrays;
public class Tableau {

	public static void main(String[] args) {
		int [] tab = new int [] {3, -8, 14, 4};
		System.out.print("Le tableau initial : ");
		for (int i = 0; i < tab.length; i++) {
		 if(i==0) {
			 System.out.print("(");
			 } 
		 System.out.print(tab[i]);
		 if(i==tab.length-1) {
			 System.out.println(")");
		 }else {
			 System.out.print(", ");
		 }
		}
		// longueur du tableau
		System.out.println("Longueur du tableau = "+tab.length);
		// somme du tableau
		int somme=0;
		for (int i = 0; i < tab.length; i++) {
			somme+=tab[i];
		}
		System.out.println("somme du tableau = "+somme);
		
		// indice du max du tableau
		int max= tab[0];
		int indice=0;
		for (int i = 0; i < tab.length; i++) {
			if(max < tab[i]) {
				max = tab[i];
				indice= i;
			}
			
		}
		System.out.println("indice du max du tableau = "+ indice);
		// System.out.println("indice du max du tableau = "+ Arrays.asList(tab).indexOf(14));
		System.out.print("Après ajout de 20 : ");
		for (int i = 0; i < tab.length; i++) {
			 if(i==0) {
				 System.out.print("(");
				 } 
			 System.out.print(tab[i]);
			 if(i==tab.length-1) {
				 System.out.println(")");
			 }else {
				 System.out.print(", ");
			 }
			}
		
	    int [] tab1 = new int [tab.length+1];
        tab1 = tab;		
	    tab1[tab.length-1]= 20;
		System.out.print("et le résultat est : ");
		for (int i = 0; i < tab1.length; i++) {
			 if(i==0) {
				 System.out.print("(");
				 } 
			 System.out.print(tab1[i]);
			 if(i==tab1.length-1) {
				 System.out.println(")");
			 }else {
				 System.out.print(", ");
			 }
			}
	}

}
