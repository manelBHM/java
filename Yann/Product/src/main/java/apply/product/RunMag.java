package apply.product;

public class RunMag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c1 = new Client("Stanley", "55 rue de vincenne", 93160);
		Client c2 = new Client("Mahf", "12 rue de Paris", 75015);


		Télévision t1 = new Télévision("Télévision", "Samsung HD, Noir", 200, 57, "plasma");
		Four f1 = new Four("Four", "Compact Stable, Gris", 150, "Multi-Fonction");
		Refrigerateur r1 = new Refrigerateur("Réfrigerateur", "Whirlpool, 80l, 1m, noir", 360);

		Four f2 = new Four("Four", "High One, Blanc", 263, "Compact-Multi-Fonction");
		Refrigerateur r2 = new Refrigerateur("Réfrigerateur", "Compact, 120l, 130cm, blanc", 100);
		Télévision t2 = new Télévision("Télévision", "KDK HD waterproof, Sony, Noir", 500, 57, "Plat");

		ExpressDelivery e = new ExpressDelivery("55 rue de vincenne", 93160);
		RelayDelivery r = new RelayDelivery(44);

		Bill facture1 = new Bill(c1, r);

		System.out.println("Client n° 1 ==> Commande avec Livraison Express\n");


		facture1.addProduct(t1, 2);

		facture1.addProduct(f1, 1);

		facture1.addProduct(r1, 1);

		facture1.getProducts();

		facture1.calculTotal();

		System.out.println("-------------");
		System.out.println("Facture a l'attention de " + facture1.getClient().getFullname()+"\n");
		System.out.println(facture1.getDelivery()+"\n");
		System.out.println(facture1);
		System.out.println("-------------");

		Writer fichier1 = new FileWriter("Mafacture1.txt\n");
		facture1.generate(fichier1);

		System.out.println("");



		System.out.println("Client n° 2 ==> Commande sans Livraison\n");

		Bill facture2= new Bill(c2);

		facture2.addProduct(r2, 2);

		facture2.addProduct(t2, 1);

		facture2.addProduct(f2, 2);

		facture2.getProducts();

		facture2.calculTotal();

		System.out.println("---------------------\n");
		System.out.println("Facture a l'attention de " + facture2.getClient().getFullname()+"\n");
		System.out.println(facture2);
		System.out.println("\n-----------------------");

		Writer fichier2 = new FileWriter("Mafacture2.txt");
		facture2.generateNoDelivery(fichier2);

	}

}
