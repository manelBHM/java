import java.util.Scanner;

public class Guess {

public static void main(String[] args) {
 // TODO Auto-generated method stub
 
 //***************************Mon code***************************
 
 System.out.println("Je pense � une letrre devine la quelle.");
 //System.out.println("Entrez une lettre : ");
 
 Scanner sc = new Scanner(System.in);
 char reponse;// il faut initialiser une reponse avant pour que dans la boucle il puisse exister
 
 do{ 
  
  do { 
   
  System.out.println("Entrez une lettre : ");
   
   reponse =sc.nextLine().charAt(0);
   
  }while(reponse == '\n' || reponse == '\r' || reponse==' ');//
     
  if (reponse < 'N') {
   
   System.out.println("La lettre est apr�s");
   //System.out.println("Retentez votre chance : "); 
   
  }
  else if(reponse > 'N') {
   
   System.out.println("La lettre est avant");
   //System.out.println("Retentez votre chance : ");
   
  }
  
  else {
   System.out.println("Trouv� !!! ");   
  }
    
 } while (reponse != 'N');
 
 System.out.println("Bye"); 
 
 //*************************Corrig�*********************
 
 /*
  * char ch, answer = 'K';
  * 
  * do{
  * System.out.println("I'm thinking of a number between A and Z.")
  * System.out.println("Can you guess it: ");
  * Scanner sc = 
       */

}
}