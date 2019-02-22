package segment;

import java.util.Scanner;

public class TestSegment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner saisie = new Scanner(System.in);
		
		int point;
		
		Segment x = new Segment(10, 63);
		
		System.out.println("Saisissez un nombre :-) ");
	 
		         
		
	        	point = saisie.nextInt();
		
	
		        if (x.appartient(point))
		        {
			    System.out.println("la longueur du " + x.toString() + " : " + x.longueur());
				System.out.println(point + " appartient au " + x.toString());
				}
		        
		        else 
		        {
		        	System.out.println("la longueur du " + x.toString() + " : " + x.longueur());
		        	System.out.println(point + " n'appartient pas au " + x.toString());
		        }
		

	}

}
