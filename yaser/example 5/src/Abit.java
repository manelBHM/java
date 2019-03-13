
import java.util.Scanner;

public class Abit {

	public static void main(String[] args){
	/*
		char ch, answer = 'k';
	do {
		
	System.out.println("i'm thinking of a letter between A and Z ");
	System.out.println("can you guess it");	
	Scanner sc = new Scanner(System.in);
	
	do {
		ch=sc.next().charAt(0);
		
	}
	while (ch == '\n' | ch == '\r');
	
	if (ch == answer) {
		System.out.println("right");
	}
	
	
	else {
		System.out.println("sorry");
	}
	if (ch < answer)
		System.out.println(" too low");
	else System.out.println("too high");
	
	System.out.println("try agin");
	}
	
	while (answer != ch);
	
		}

}
	*/
		
		
		char ch, answer = 'k';
		
		do {
			System.out.println("i'm thinking of a letter between A and Z can you guess it");
				Scanner sc = new Scanner(System.in);
		do
		{
			ch=sc.next().charAt(0);}
		
		 
		while (ch == '\n' | ch == '\r');
		
		if ( ch == answer) {
			System.out.println("right");
			}
		else if ( ch < answer) {
			System.out.println("too low");
		}

		else {
			System.out.println("too high");
		}
		
		
		
		
	}
		while (answer != ch);
		
	}

	}