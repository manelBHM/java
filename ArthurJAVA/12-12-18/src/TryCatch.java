
public class TryCatch {
	
	 public static void main(String args[]) {
		 
		 int a =10;
		 int b =0;
		 
		 try {
         System.out.println(a/b);
		 }
		 
		 // CLASS CATCH POUR UNE ERREUR GENERIQUE OU NE CONNAIT PAS LA CLASSE QUI VA CATCH
		 
		 
		 catch (ClassCastException e) {
			
		 
			 
			 e.printStackTrace();
		 }
		 
		 
		 
		 //FIUNALLY CAS PAR DEFAUT QUOI QUIL ARRIVE
		 
	     finally {
	    	 System.out.println("action faite systematiquement");
	     }
		 
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
	 }
		

}
