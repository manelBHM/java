package testClasses;

import java.util.List;
import java.util.Scanner;

import entites.apprenant;
import metier.dao.dao;

public class test {

	public static void main(String[] args) {
		dao data = new dao();
	    //data.Create(new apprenant("Jack", "Paul", "1981-04-12", 1));
	  //  data.Create(new apprenant("Adam", "François", "1993-02-07", 1));
	    System.out.println();
       //  data.Delete(22);
		
        Scanner sc = new Scanner(System.in);
       String input = "";
        while(!input.equals("exit")) {
        	System.out.println("what do you want to do ? D - Display all DB recored ou A - Add new record in DB ");
        	input = sc.nextLine();
        	switch(input) {
        	case"A":
            String nom= "";
        	String prenom= "";
        	while(nom.isEmpty() || prenom.isEmpty()) {
        		System.out.println("Enter the last name ");
        		nom = sc.nextLine();
        		System.out.println("Enter the first name ");
        		prenom = sc.nextLine();
        		apprenant ap = new apprenant();
        		ap.setNom(nom);
        		ap.setPrenom(prenom);
        		System.out.println("Added new record with success ! ");
        		data.Create(ap);
        	}
        	break;
        	case "D":
        	    System.out.println("All DB recored : ");
        List<apprenant> list = data.findAll();
        for (apprenant ap : list) {
        	System.out.println(ap);
			
		}
        break;
        default : System.out.println("I don't understad your choice !");
        break;
        	}
        }
        
		List<apprenant> studants = data.findByKeyWord("S");
		for (apprenant ap : studants) {
			System.out.println(ap);
		}

	}

}
