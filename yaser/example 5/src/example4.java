import java.io.InputStream;
import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println(" quell est votr note ? " );
		
		int input = scan.nextInt();
		
		while (input<=10) {
			System.out.println();
		}
		
		switch ( input ) {
		
		case  10 :
		 System.out.println("  a travailler   " );
		 
		 break;
		 
		case 11 : case  12  :
			System.out.println("  passable  " );
		
		 break;
			 
		case 13 : case 14 :
		System.out.println("  assez bien   " );
		
		break;
		
		
		case 15 : case  16:
		System.out.println("  bien   " );	
		
		break;
		
		case 17 : case 18 : case 19 : case 20:
		System.out.println("   tres bien   "  );	
			
		break;
		
		default:
		System.out.println(" error " );		
		
		}
	
		
		
		
		
		

	

	
	}

}

