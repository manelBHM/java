package exemple6;

public class RunApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Animal a1 = new Animal("oiseau", 2); // creation animal
        a1.parler(); // appel d'une méthode d'instance
        
        Animal a2 = new Animal("chat", 4); // creation animal
        a2.parler(); // appel d'une méthode d'instance
        
        Animal a3 = new Animal("seigle", 2); // creation animal
        a3.parler(); // appel d'une méthode d'instance
        
        Animal a4 = new Animal("chevre", 4); // creation animal
        a4.parler(); // appel d'une méthode d'instance
        
        Animal a5 = new Animal("poisson", 0); // creation animal
        a5.parler(); // appel d'une méthode d'instance
        
        Animal a6 = new Animal("vache", 4); // creation animal
        a6.parler(); // appel d'une méthode d'instance
        
        Animal a7 = new Animal("cheval", 4); // creation animal
        a7.parler(); // appel d'une méthode d'instance
        
        Animal a8 = new Animal("pirroquet", 2); // creation animal
        a8.parler(); // appel d'une méthode d'instance
        
        
        Animal.afficheNbreAnimaux(); // appel d'une méthode de class
        
        
	}

}
