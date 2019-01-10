
public class App4 {
	
	static int[] remplir1(int x) {
		
		int[] tab = new int[x];
		
		for (int i = 0; i<x; i++) {
		
			tab[i] = i; }
		
		return tab;
	}
	
	static int[] remplir2(int x) {
		
		int[] tab = new int[x];
		
		for (int i =0; i<x; i++) {
			tab[i] = i+5;
		}
		
		return tab;
	}
	
	static int[] remplir3(int x) {
		int[] tab = new int[x];
		
		for (int i = 0; i<x; i++) {
			
			tab[i] = x-i;
			
		}
		
		return tab;
	}
	
	static void operation1(int[] tab) {
		int a=0;
		
		for(int i=0;i<tab.length;i++) {
			if (tab[i]==9) {
				a++;
			}
		}
		System.out.println("il y a " + a + " element 9");
	}
	
	static void operation2(int[]tab) {
		int x = 0;
		for(int i=0;i<tab.length;i++) {
			if(tab[i]<2 || tab[i]>4) {
				x++;
			}
			
		}
		System.out.println("il y a " + x + " element plus grand que 4 et plus petit que 2");
		}
	
	static void operation3(int[]tab) {
		int sum=0;
		
		for(int i=0;i<tab.length;i++) {
			sum+=tab[i];
		}
		System.out.println("la somme est : " + sum);
		}
	
	static void operation4(int[]tab) {
        int sum=0;
		
		for(int i=0;i<tab.length;i++) {
			sum+=tab[i];
		}
		System.out.println("la moyenne est : " + sum/tab.length);
		
		
		
	}
	
	static void operation5(int[] tab) {
		int max=0;
		for(int i=0;i<tab.length;i++) {
			if (max<tab[i]) {
				max=tab[i];
			}
			
		}
		System.out.println("le plus grand nombre est : " + max);
	}
	
	static void montrer(int[]tab) {
		for(int i=0;i<tab.length;i++) {
			System.out.print(tab[i] + " ");
		}
	}

	
	
	
	
	static void tableaux(int[] tab) {
		montrer(tab);
		operation1(tab);
		operation2(tab);
		operation3(tab);
		operation4(tab);
		operation5(tab);
	}
	
	
	

	public static void main(String[] args) {

		int[] tab = {1, 2 ,3 ,4, 5, 6, 7 , 8, 9, 10};
		
		tableaux(tab);
		
		System.out.println();
		
		int[] tab1 = remplir1(5);
		tableaux(tab1);
		
		System.out.println();
		
		int[] tab2 = remplir2(15);
		tableaux(tab2);
		
		System.out.println();
		
		int[] tab3 = remplir3(9);
		tableaux(tab3);
		
		
		
		
	}

}
