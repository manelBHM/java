package app3;
import java.util.Scanner;
public class Chaine {
    private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.print("Entrez un mot : ");
		 
	        String mot = scanner.nextLine();
	        String test = mot.toLowerCase();

	        int leftPos = 0;
	        int rightPos = test.length() - 1;
	        boolean palindrome=true;
	        while ((leftPos < rightPos) && palindrome) {
	            if (test.charAt(leftPos) != test.charAt(rightPos)) {
	                palindrome=false;
}
	            leftPos++;
	            rightPos--;
}
	 
	        if (palindrome) {
	            System.out.println("C'est un palindrôme !");
	        } else {
	            System.out.println("Non, ce n'est pas un palindrôme.");
	        }
	}

}
