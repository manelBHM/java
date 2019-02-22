package exple5;

import java.util.Scanner;

public class nombre {

	public static void main(String[] args) {
	
		System.out.println("entrer un nombre");
		Scanner sc = new Scanner(System.in);
		int nbre = sc.nextInt();
		
		while(nbre<=10) {
			System.out.println(nbre);
			nbre++;
		}
	
	}
}
