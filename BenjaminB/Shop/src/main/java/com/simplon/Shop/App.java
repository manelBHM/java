package com.simplon.Shop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    Product alienWare = new Computer("Alien ware", "PC for gamer", 1250, "GTX 1080");
    Customer client1 = new Customer("Benjamin Bourdeleau", "8 rue chateauneuf");
    Bill facture = new Bill(client1);
    
    facture.generate(new FileWriter("test.txt"));
    }

}
