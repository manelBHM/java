import java.util.Scanner;

public class Cine {
	Scanner sc = new Scanner(System.in);

	
    int billet1 = 5;
    int billet2 = 8;
    int billet3 = 8;
	int prixTotal=0;
	
	public void RunT() {
		
		int age1 = sc.nextInt();
		
		
		
		
	}
	
	
	public void Run() {
		    int age = sc.nextInt();
		
            if (age<=60 && age>=3) {
			
			System.out.println("Habitez vous a Montreuil ? 1 oui / 2 non");
			
			int x =sc.nextInt();
			
			switch (x) {
			
			case 1 : System.out.println("Le billet coute " + billet1 + " euro");
			break;
			
			case 2 : System.out.println("Le billet coute " + billet2 + " euro");
			}
		}
			
			else if (age<3) {
				
				System.out.println("Billet gratuit");
				
				
			}
		
			else if (age>60) {
				
				System.out.println("Le billet coute" + billet3 + " euro");
			}
		    
			else {
				System.out.println("Try again");
			}
		    
	}
	
  public void RunGroupe() {
	  
	  System.out.println("Combien de personnes êtes vous ?");
	  
	  int nbPersonne = sc.nextInt();
		
		for (int i =0; i<nbPersonne; i++) {
			Run();
			
		}
	  
  }
	
	
 public int returnPrix() {
	 
	 return;
 }
	
	

	

}
