package main;

import java.util.Scanner;
import main.SuiteTU;
public class Main {
	public class square {
	int x;
	int result;
	public int Square() {
		int result = x*x;
		System.out.println("la valeur de "+x+" au carré est = " + result);
		return result;
		
	}
	public class cube {
		int x;
		int result;
		public int Cube() {
			int result = x*x*x;
			System.out.println("la valeur de "+x+" au cube est = " + result);
			return result;
		}
	}
	public class Palindrome{
		public String Palindrome(String string){
			   {
				      String original, reverse = ""; // Objects of String class
				 //     Scanner in = new Scanner(System.in);
				     
				 //.out.println("Enter a string to check if it is a palindrome");
				      original = string;//in.nextLine();
				     
				      int length = original.length();
				     
				      for (int i = length - 1; i >= 0; i--)
				         reverse = reverse + original.charAt(i);
				         
				      if (original.equals(reverse))
				         System.out.println("The string is a palindrome.");
				      else
				         System.out.println("The string isn't a palindrome.");
						return reverse;
				   }

			
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scChoix = new Scanner(System.in);
		System.out.println("Vous désirez faire un calcule au carré ? au cube ? vérifier un palindrome ? ou le FizzBuzz de la muerte ?!");
		String choix = scChoix.nextLine();
		if (choix.equals("carré")) {
		Square(0);
		}else if (choix.equals("cube")){
		Cube(0);
		}else if (choix.equals("palindrome")){
		Palindrome("");
		}else if (choix.equals("FizzBuzz")){
			System.out.println("Entrez votre Fizz et buzzez !");
			Scanner startFB = new Scanner(System.in);
			int starter = startFB.nextInt();
			game(starter);
			}else {
			System.out.println("Nous n'avons pas compris veuillez réessayer.");
		}
		
		}

	private static String game(int number) {
		// TODO Auto-generated method stub
		String answer;
		if (number <= 0){
			answer = " ERROR ";
			System.out.println(answer);
			return answer;
		}else if (number % 5 == 0 && number % 3 == 0) {
			answer = " [ Fizz Buzz ] ";
			System.out.println(answer);
			return answer;
		}else if (number % 3 == 0) {
			answer = " [ Fizz ] ";
			System.out.println(answer);
			return answer;
		}else if (number % 5 == 0) {
			answer = " [ Buzz ] ";
			System.out.println(answer);
			return answer;
		}else {
		answer = Integer.toString(number);
		System.out.println(answer);
		return answer;

}
}
	

	public static String Palindrome(String string) {
		   {
			      String original, reverse = ""; // Objects of String class
			//      Scanner in = new Scanner(System.in);
			     
			 //     System.out.println("Entrez un mot pour voir si c'est un palindrome");
			      original = string; // in.nextLine();
			     
			      int length = original.length();
			     
			      for (int i = length - 1; i >= 0; i--)
			         reverse = reverse + original.charAt(i);
			         
			      if (original.equals(reverse))
			         System.out.println("C'est un palindrome.");
			      else
			         System.out.println("Ce n'est pas palindrome.");
					return reverse;
			   }
		
	}

	public static int Cube(int x) {
	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("Déclarez votre valeur de X : ");
	//	int x = sc.nextInt();
		int result = x*x*x;
	//	System.out.println("la valeur de "+x+" au cube est = " + result);
		return result;
	}

	public static int Square(int x) {
	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("Déclarez votre valeur de X : ");
	//	int x = sc.nextInt();
		int result = x*x;
	//	System.out.println("la valeur de "+x+" au carré est = " + result);
		return result;
	}

}
