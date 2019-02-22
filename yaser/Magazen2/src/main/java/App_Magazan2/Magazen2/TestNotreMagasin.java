package App_Magazan2.Magazen2;

public class TestNotreMagasin {

	public static void main(String[] args) {
		
		Client c1 = new Client("Neyer","30 rue Champs Elysées");
		c1.afficheClient();
		
		Produit p1 = new Four(230.99,20.2,70);
		Produit p2 = new Television(120.99, "LCD","4/3");
		Produit p3 = new Microonde(29.99,900,true);
		
		p1.afficheProduit();
		p2.afficheProduit();
		p3.afficheProduit();
		
		
		Facture f1 = new Facture(c1);
		f1.ajouterProduit(p1, 1);
		f1.ajouterProduit(p3, 2);
		
		
		System.out.println(f1.total());
		
		f1.afficheFacture();
	}
	}


