package exple4;

import java.util.Scanner;

public class Note {

	public static void main(String[] arg) {
		
		System.out.println("Entrer une note");
		Scanner sc = new Scanner(System.in);
		int note = sc.nextInt();
		
switch (note) {
case 8:
case 9:
	System.out.println("insufisant");
	break;

case 10:
case 11:
    System.out.println("passable");
    break;
    
case 12:
case 13:
	System.out.println("asser bien");
	break;
	
case 14:
case 15:
	System.out.println("bien");
	break;
	
case 16:
case 17:
case 18:
case 19:
case 20:
	System.out.println("très bien");
	break;
	default:
	System.out.println("il faut encore travailler");
}
		
		
}
}