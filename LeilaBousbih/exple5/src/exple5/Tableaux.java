package exple5;

import java.util.Scanner;

public class Tableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
        char tableauCaractere[] = {'a', 'e', 'i', 'o', 'u', 'y'};
		
		
		for (int i = 0; i < tableauCaractere.length; i++)
		
			System.out.println("A l'emplacement " + i +" du tableau, nous avons = " + tableauCaractere[i]);
		*/
		
		
		int e;
		int result;
		for (int i = 0; i < 10; i++) {
			result = 1;
			e = i;
			while(e > 0 ) {
				result*=2;
				e--;
			}
			System.out.println("2 a la puissance " + i + " est " + result);

	}

	}
	}
