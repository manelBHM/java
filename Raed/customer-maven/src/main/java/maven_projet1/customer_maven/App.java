package maven_projet1.customer_maven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// System.out.println( "Hello World!" );
		
		Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
		Television tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
		Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);

		Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");

		Bill bill = new Bill(customer);
		bill.addProduct(cafe, 1);
		bill.addProduct(tv, 1);
		bill.addProduct(fridge, 1);

		 //bill.generate(new FileWriter("facture_leblanc"));
		
		try {
	        bill.generate(new FileWriter("facture_leblanc"));
	    } catch (NoProductInBillException e) {
	        System.err.println("Pas de produit dans la facture");
	    }
	}
}
