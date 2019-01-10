import java.util.Scanner;
public class Help {

	public static void main(String[] args) {
		// TODO Auto-generated method
		System.out.println("Help on :\n"+"1. if \n"+"2. switch \n"+"3. for \n"+"4. while \n"+"5. do while");
		Scanner scan1 = new Scanner(System.in);
		int help = scan1.nextInt();
		switch(help) {
		case 1 : 
			System.out.println("if(condition){\n"+"methode \n"+"} \n"+"else { \n"+"default result \n"+"}");
			break;
		case 2 : 
			System.out.println("switch(objet){\n"+"case 1 :\n"+"methode1\n"+"break;\n"+"case n :\n"+"methoden\n"+"break;\n"+"default :\n"+"methode par défaut\n"+"break;\n"+"}");
			break;
		case 3 : 
			System.out.println("for(index;condition;itération){\n"+"methode répétr jusqu'a ce que la condition soit remplie;\n"+"}");
			break;
		case 4 : 
			System.out.println("while(condition){\n"+"methode à répéter jusqu'a ce que la condition soit remplie (attention ne pas oublier le break si elle ne se remplis pas d'elle meme);\n"+"}");
			break;
		case 5 : 
			System.out.println("do {\n"+"while(condition){\n"+"methode à répéter jusqu'a ce que la condition soit remplie (attention ne pas oublier le break si elle ne se remplis pas d'elle meme);\n"+"}"+"}");
			break;
		}
	}

}
