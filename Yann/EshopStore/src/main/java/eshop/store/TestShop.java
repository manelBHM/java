package eshop.store;

public class TestShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer("Stanley", "54 rue Beliard", 75018);
		
		Product f1 = new Frigo("Frigo", "Whirpool, 1m10, Blanc", 300);
		Product m1 =  new MicroOnde("Micro Onde", "High One, Blanc", 70);
		Product cf1 = new Cafetiere("Cafetière", "Senseo, 2 litres, Noir Blanc", 50);
		Product t1 = new Tele("Télévision", "Samsung, 150 pouces, Ecran Plasma", 800);
		
		Delivery express  = new ExpressDelivery("Stanley", "54 rue Beliard", 75018);
		Delivery relay = new RelayDelivery(12);
		Delivery home = new HomeDelivery();
		
		
		Bill bill1 = new Bill(c1, express);
		
		bill1.addProducts(t1, 1);
		bill1.addProducts(m1, 2);
		bill1.addProducts(f1, 1);
		
		bill1.getProducts();
		
		bill1.calcuTotal(bill1);
		System.out.println("----------------");
		System.out.println(bill1.getDelivery());
		System.out.println(bill1);
		
		Writer generateBill = new FileWriter("Bill.txt");
		bill1.generateBill(generateBill);
		
	}

}
