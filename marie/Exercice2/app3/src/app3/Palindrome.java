package app3;
import java.util.Scanner;
public class Palindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.out.print("Entrez un mot : ");
		 Scanner sc = new Scanner(System.in);
	     String mot = sc.nextLine();


	    String rev= new StringBuilder(mot).reverse().toString();
	     if (mot.equals(rev)) {
	    	 System.out.println("C'est un palindrôme !");
    } else {
        System.out.println("Non, ce n'est pas un palindrôme.");
    }
	     System.out.println(mot +" "+ rev);
	        /*int leftPos = 0;
	        int rightPos = mot.length() - 1;
	        boolean palindrome=true;
	        for((leftPos < rightPos) && palindrome) {
	            if (mot.charAt(leftPos) != mot.charAt(rightPos)) {
	                palindrome=false;
}
	            leftPos++;
	            rightPos--;
	    
}
	 
	        if (palindrome) {
	            System.out.println("C'est un palindrôme !");
	        } else {
	            System.out.println("Non, ce n'est pas un palindrôme.");
	        }*/
	}
}

