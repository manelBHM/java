import java.util.Scanner;

public class HelpOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String IF = "if(condition)"+'\n'+"{"+ '\n'  + " Statement " + '\n'+ "}"+ '\n'+ "else" + '\n' + "Statement";
		String SWITCH = "switch (Variable)\n" + "\n" + "{\n" + "\n" + " case 1:\n" + "\n" + "Action 1;\n" + "\n" + "break; \n"+"\n" +" case 2:\n" + "\n" + "{ Action 2 };\n" + "\n" + "break; \n" + "\n" + " default:\n" + "\n" + " Action default; \n" + "\n" + "}";
		String FOR = "for ( initialisation; condition; itération) { Instructions }";
		String WHILE  = "while (Condition)\n" + "\n" + "{\n" + "\n" + " Instructions à répéter\n" + "\n" + "}";
		String DOWHILE = "do{\n" + "\n" + "Instructions\n" + "\n" + "}while(condition de sortir);";

	
		
	System.out.println("Help System:");
	System.out.println("1.if");
	System.out.println("2.switch");
	System.out.println("3.for");
	System.out.println("4.while");
	System.out.println("5.do while");
	System.out.println("Choose one:");
	
	
	
Scanner scan = new Scanner(System.in);
int help;

	do {
		help = scan.nextInt();
		
		switch (help)
		{
		case 1:
			System.out.println("The if:"+ '\n');
			System.out.println(IF +'\n');
			System.out.println("For exit press 12345 or continue with the help system"+'\n');
		    break;
		    
		case 2:
			
			System.out.println("The switch:"+ '\n');
			System.out.println(SWITCH+'\n');
			System.out.println("For exit press 12345 or continue with the help system"+'\n');
		    break;
		    
		case 3:
			System.out.println("The for:"+ '\n');
			System.out.println(FOR+'\n');
			System.out.println("For exit press 12345 or continue with the help system"+'\n');
		    break;
		    
		case 4:
			System.out.println("The while:"+ '\n');
			System.out.println(WHILE+'\n');
			System.out.println("For exit press 12345 or continue with the help system"+'\n');
		    break;
		    
		case 5:
			System.out.println("The do while:"+ '\n');
			System.out.println(DOWHILE+'\n');
			System.out.println("For exit press 12345 or continue with the help system"+'\n');
		    break;
		    
		case 12345:
			System.out.println("Exit System");
			
			break;
		    
	    default:
	    	
            System.out.println("Vous n'avez rien choisis");
	    	
	    	break;
				  	 
		}

	
	}while(help!=12345);
	

	
	
	
	
	
	
	
	
	
//	System.out.println("Vous n'avez Rien Choisis");
		
	/*	switch (help)
		{
		case 1:
			System.out.println("The if:"+ '\n'+ IF);
		    break;
		    
		case 2:
			
			System.out.println("The switch:"+ '\n'+ SWITCH);
		    break;
		    
		case 3:
			System.out.println("The for:"+ '\n'+ FOR);
		    break;
		    
		case 4:
			System.out.println("The while:"+ '\n'+ WHILE);
		    break;
		    
		case 5:
			System.out.println("The do while:"+ '\n'+ DOWHILE);
		    break;
		      
	    default:

				  System.out.println("Vous n'avez Rien Choisis");
		}
		
		
				ships = scan.nextInt();
		  if(ships==1) {System.out.println("The if:"+ '\n'+ IF);}
		  else if(ships==2){System.out.println("The switch:"+ '\n'+ SWITCH);}
		  else if(ships==3) {System.out.println("The for:"+ '\n'+ FOR);}
		  else if(ships==4){System.out.println("The while:"+ '\n'+ WHILE);}
		  else if(ships==5){System.out.println("The do while:"+ '\n'+ DOWHILE);}
		 //else System.out.println("Vous n'avez Rien Choisis");
		*/
		
	
		
	}

}
