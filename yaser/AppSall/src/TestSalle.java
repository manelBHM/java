import java.util.ArrayList;
import java.util.Scanner;

public class TestSalle {

	public static void main(String[] args) {
		
		SalleService ss = new SalleService();
		 
		ss.create(new Salle ("A","Salle 1"));
		ss.create(new Salle ("B", "Salle 2"));
		ss.create(new Salle ("C", "Salle 3"));
		ss.create(new Salle ("D", "Salle 4"));
		
		System.out.println("la Liste des salles");
		
		for (Salle s : ss.findAll())
			System.out .println("\t"+ s);
		
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("supprimer las salle avec id = 1");
		ss.delete(ss.findById(1));
		
		sc.nextLine();
		
			System.out.println("modifer la salle avec id = 2");
			
			
			 Salle salle = ss.findById(2);
			 
			 sc.nextLine();
			 
			 System.out .println(" la salle modifie"+ salle);
			 
			
			 
			 System.out .println("donner la vouveau code :");
			 salle.setCode(sc.nextLine());
			 
			 System.out .println("donner la vouveau libelle :");
			 salle.setLibelle(sc.nextLine());
			 ss.update(salle);
			 
				System.out.println("La liste des salles après les mises à jour :");
				for (Salle s : ss.findAll())
					System.out.println("\t" + s);
		 
	
			 
			 
			 
			 
			 
			 
			 
			 

		
		}
	}

	

