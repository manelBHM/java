package app2;
import java.util.Scanner;
public class Segment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 44;
		int min = -35;

		int result = max-min;
		
		System.out.println("La longueur du segment [-35, 44]: " + result);
	
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		if(i>=min && i<=max) {
			System.out.println(i + " Appartien au segment [-35, 44]");
		}
		
		else {
			System.out.println(i + " N'appartien pas au segment [-35, 44]");
		}
		
		
	}

	
	}


