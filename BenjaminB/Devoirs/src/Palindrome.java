import java.util.*;
 
class Palindrome
{
   public static void main(String args[])
   {
      String original, reverse = ""; // Objects of String class
      Scanner in = new Scanner(System.in);
     
      System.out.println("Entrez le mot de votre choix et je vais voir si c'est un palindrome");
      original = in.nextLine();
     
      int length = original.length();
     
      for (int i = length - 1; i >= 0; i--)
         reverse = reverse + original.charAt(i);
         
      if (original.equals(reverse))
         System.out.println(original +" est effectivement un palindrome.");
      else
         System.out.println(original +" n'est absolument pas un palindrome !!!");
         
   }
} 