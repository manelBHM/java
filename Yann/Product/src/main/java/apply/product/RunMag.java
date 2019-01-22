package apply.product;

public class RunMag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client c1 = new Client ("Stanley", "13 rue de l'universtion 93160, Noisy le Grand");
		Client c2 = new Client ("Lucky", "55 rue de vincenne, Montreuil");
		
		Four f1 = new Four("Four", "FOUR COMPACT, noir", 1200, "multi-fonction");
		Télévision t1 = new Télévision("Télévision", "Sony, waterproof kdk", 4000, 56, "Plasma");
		Refrigerateur r1 = new Refrigerateur("Refrigerateur", "Blanc cassé", 800);
		Télévision t2 = new Télévision("Télévision", "Samsung, waterproof 5G", 6000, 86, "Ecran Plasma");
		Refrigerateur r2 = new Refrigerateur("Frigo", "Noir", 1000);
		
		Bill facture1= new Bill(c1);
		
		Bill facture2= new Bill(c2);

		facture1.addProduct(r1, 1);
		facture1.addProduct(t1, 1); 
		
		facture2.addProduct(t2, 1);
        facture2.addProduct(r2, 2);

		

		System.out.println("Achats et Facture du Client: " + facture1.getClient().getFullname());
		System.out.println("");
		facture1.getProducts();
		facture1.calculTotal();
		System.out.println("");
		System.out.println(facture1.afficherFacture());
		System.out.println(" -------------- ");
		
		System.out.println("");
		System.out.println("Achats et Facture du Client " + facture2.getClient().getFullname());
		System.out.println("");
		facture2.getProducts();
		facture2.calculTotal();
		System.out.println("");
		System.out.println(facture2.afficherFacture());
		System.out.println(" -------------- ");

	
	}

}
