import java.util.Scanner;

public class Palindrome {
	
	  
	public static void main(String[] args) {
		
		    	
		String original, reverse = ""; 
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter a string to check if it is a palindrome");
	      original = in.nextLine();
	     
	      int length = original.length();
	     
	      for (int i = length - 1; i >= 0; i--)
	         reverse = reverse + original.charAt(i);
	         
	      if (original.equals(reverse))
	         System.out.println(   original + " " + "est palindrome." + " " + "  et le calcule  de caractères : " + original.length());
	      else
	         System.out.println(original + " " + "il n'est pas  palindrome."+ " " + "  et le calcule  de caractères : " + original.length());
	         
	
		
			
		}

	}    
	

	    

