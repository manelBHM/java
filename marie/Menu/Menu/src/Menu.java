import java.util.Scanner;
public class Menu {
Scanner sc = new Scanner(System.in);

	int nbMenus;
	
	public int nbMenus() {
		System.out.println("Combien souhaitez vous de menu ?");
		int nbMenus = -1;

	do {
		nbMenus = sc.nextInt();
	}
	while (nbMenus<0);
		return nbMenus;
	}
	
	int choixMenu;
	
	public void choixMenu() {
		System.out.println("Quel menu souhaitz vous");
		
		if(choixMenu==1) {
			System.out.println("Vous avez choisie le menu Poulet");
		}
		else if(choixMenu==2) {
			System.out.println("Vous avez choisie le menu Boeuf");
		}
		else if(choixMenu==3) {
			System.out.println("Vous avez choisie le menu Vegetarien");
		}
		else {
			System.out.println("Votre choix n'est pas valide");
		}
	}
	
	public void afficherMenu() {
		System.out.println("Quel menu souhaitez vous");
		System.out.println("1- Poulet");
		System.out.println("2- Boeuf");
		System.out.println("3- Vegetarien");
	}
	
	public void afficherSide() {
		System.out.println("Quel accompagnements souhaitez vous");
		System.out.println("1- Legumes frais");
		System.out.println("2- Fites");
		System.out.println("3- Riz");
	}
	
	public void afficherVegetarien() {
		System.out.println("Voulez vous un peu de riz ?");
		System.out.println("1- Riz");
		System.out.println("2- Pas Riz");
	}
	
	public void afficherDrink() {
		System.out.println("Souhaitez vous une boisson");
		System.out.println("1- Eau plate");
		System.out.println("2- Eau gazeuse");
		System.out.println("3- Soda");
	}
	
	public int askMenu() {
		afficherMenu();
		int askMenu=sc.nextInt();
		return askMenu;
		
	}
	
	public int askDrink() {
		afficherDrink();
		int askDrink=sc.nextInt();
		return askDrink;
	}
	
	public int askSide(int menu) {
		switch(menu) {
		case 1:
			afficherSide();
			break;
		case 2:
			afficherSide();
			break;
		case 3:
			afficherVegetarien();
			break;
}
		int askSide = sc.nextInt();
		return askSide;
	}
	
	public void runMenu() {
		int menu = askMenu();
		int drink = 0;
		int side = 0;
		switch(menu) {
		case 1:
			side = askSide(1);
			drink = askDrink();
			break;
		case 2:
			side = askSide(2);
			break;
		case 3:
			side = askSide(3);
			drink = askDrink();
			break;
		}
		
	 confirmerCommande(menu, side, drink);
		// TODO Auto-generated method stub
	}	
	
	
	public void RunMenus() {
		int nbr = nbMenus();
		
		for(int i=0;i<nbr;i++) {
			runMenu();
	}
	
	}
	
	public void confirmerCommande(int choix, int side, int drink) {
		System.out.println("Vous avez choisie comme menu" + choix);
		System.out.println("Vous avez choisie comme accompagnement" + side);
		System.out.println("Vous avez choisie comme boisson" + drink);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}