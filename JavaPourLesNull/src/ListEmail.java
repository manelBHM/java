import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ListEmail {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("email.txt"));
		PrintStream print = new PrintStream("username.txt");
		char symbol;

		while (sc.hasNext()) {

			symbol = sc.nextLine().charAt(0);

			while (symbol != '@') {
				print.print(symbol);
				symbol = sc.nextLine().charAt(0);
			}

			print.println();
		}

		sc.close();
		print.close();

	}

}
