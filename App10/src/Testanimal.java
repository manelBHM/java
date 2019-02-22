import java.util.Scanner;

public class Testanimal {

	public static  void main(String[] args) {
		
		Animal a1= new Chat();
		Animal a2=new oiseau();
	    
		int choi =0 ;
		 Scanner in = new Scanner(System.in);
		 System.out .println("choisi un numéro");
		choi = in.nextInt();
		
		if (choi == 1) {
			a1.devine();
		}
		
		else {
			a2.devine();
		}

	}

}
