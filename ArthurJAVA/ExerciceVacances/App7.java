
public class App7 {

	public static void main(String[] args) {


		int[] tab = {3, -8, 14, 4};
		
		System.out.println("longueur du tableau est : " + tab.length);
		
		int sum = 0;
		
		for (int i=0; i<tab.length;i++) {
			
			sum += tab[i];
		}
		System.out.println("la somme des valeurs du tableau est : " + sum);
		
		int max = 0;
		int max2 = 0;
		for (int i=0; i<tab.length; i++) {
			
			if(max<tab[i]) {
				max = tab[i];
				max2=i;
			}
		}
		System.out.println("l'indice max du tableau est : " + max2);
		
		System.out.println("le tableau initial est : ");
		
		for (int i=0; i<tab.length; i++) {
			System.out.print(tab[i]+ " ");
		}		
		
		System.out.println();
		
		System.out.println("Apres ajout de : 20");
		
		int[] tab2 = {3, -8, 14, 4, 20};
		
		for (int i=0; i<tab2.length; i++) {
			System.out.print(tab2[i]+ " ");
		}			
		
	

	}

}
