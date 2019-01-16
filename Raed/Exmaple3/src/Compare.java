import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		
		//EX1
		/*		
		int a = 4,b = 10;
		if (a < b) {
			System.out.println("A est la plus petit");
		}else {
			System.out.println("A est la plus grand");
		}
		
		*/
		
		
		
		//EX2
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
	
	
		System.out.println("enter your first numbr please: ");
		int input1 = scan1.nextInt();
		System.out.println("enter your seconde  numbr please: ");
		int input2 = scan1.nextInt();
		System.out.println("you have entered 2 numbers: "+input1+" and "+input2);
	 
		if(input1 > input2){
			System.out.println("your first number "+input1+" "+"is smaller than your seconde number "+input1);
			
		}
		else{
			System.out.println("your seconde number "+ input2 +" "+"is bigger than your first number "+input1);
		    
		}

		
		
		
		
		
		
		

		
		
		

	}

}
