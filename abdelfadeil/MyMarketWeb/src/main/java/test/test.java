package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import boutiqueWriter.Writer;
import livraison.Delivery;
import livraison.DirectDelivery;
import livraison.ExpressDelivery;
import model.Computer;
import model.Product;
import model.Telephone;
import model.Television;
import services.Bill;
import users.Customer;

public class test {

	public static void main(String[] args) {
		// instanciation d'un client 
		Customer client = new Customer("Laurent Philipe", "Paris");
		Delivery livraison = new DirectDelivery();
		Bill pannier = new Bill(client, livraison);
		
		Product tele = new Television("Sammsung","TV HD 32'', 100 PQI", 700, 6);
		Product telepnoe = new Telephone("huawei p20", "Processeur Kirin 970 Mémoire vive 4 Go Écran 5,8 pouces", 850, 10);
		Product computer = new Computer("Lenovo Yoga 920 ", " Processeur Intel Core i5-8250U  Ecran 13.9 pouces, 1920 x 1080 pixels ", 680, 13,  8);
		
		pannier.addProduct(tele, 4);
		pannier.addProduct(computer, 4);
		pannier.addProduct(telepnoe, 4);
		System.out.println("*************** console **********************");
		pannier.generateConsole();
		
		System.out.println("*********** fichier text.txt **************************");

		pannier.generateFichier();
		
		
		
			
		
	}

}
