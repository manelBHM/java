import java.io.IOException;
import java.util.Scanner;
public class Guess {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch, answer = 'x';
		do {
		System.out.println("Devine � quelle lettre je pense");
		Scanner reader = new Scanner(System.in);
		ch = reader.next().charAt(0);
		do {
			ch = (char) System.in.read();
		}while (ch == '\n' | ch == '\r');
		if (ch == answer)
			System.out.println("GG WP !");
			else{
				System.out.println("D�sol� c'est plus ");
			if(ch < answer)
				System.out.println("Haut");
		else {System.out.println("Bas");
		
			System.out.println("essaye encore");}}}}}
			

		
	


