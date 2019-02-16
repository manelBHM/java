public class InfoPromo {
	
	
	
	// Défini les propriétés de la classe.
	private static int totalApprenant = 0;
	private static String tableau;
	
	
	// Défini les propriétés de l'objet;
	protected  String nom;
	protected int age;
	protected String nomPromo;
	protected String adressePromo;
	String formation;
	
	
	// Constructeur
	public InfoPromo (String nom, int age, String adressePromo, String nomPromo, String formation) {
		
		super(); // appel du constructeur parent
		this.nom= nom;
		this.age= age;
		this.adressePromo= adressePromo;
		this.nomPromo= nomPromo;
		this.formation= formation;
		totalApprenant++;
		String tableau=  this.nom;
		
		// Fin Constructeur
	}
	
	// Création d'une Méthode 
	
	private String informationApprenant() {
		
		return "Je suis " + this.nom + " j'ai " +  this.age; 
	}
	
	
	
	// Méthode
	
	private String informationPromo() {
		
		return "Je fais partie de la Promo " + this.nomPromo + " de " + this.adressePromo + '\n' +"de la Formation " + this.formation;
	}
	
	
	// une autre Méthode 
	
	private static void displayNmbreApprenant() {
		
		System.out.print("Le nombre total des apprenants est : " + totalApprenant);
	}
	
	
	
	// methode
	
	
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InfoPromo yann = new InfoPromo("Yann", 23, "Montreuil", "DevJava", "Developpeur FullStack Java");
		
		InfoPromo ships = new InfoPromo("Mahfuj", 28, "Montreuil", "DevJava", "Developpeur FullStack Java");
		
		InfoPromo lucky = new InfoPromo("Stanley", 26, "Montreuil", "DevJava", "Developpeur FullStack Java");
		
  //String nom, int age, String adressePromo, int nomPromo, String formation
		
		
		System.out.println(yann.informationApprenant());
		System.out.println(yann.informationPromo()+'\n');
	
		
		System.out.println(ships.informationApprenant());
		System.out.println(ships.informationPromo()+'\n');
		
		System.out.println(lucky.informationApprenant());
		System.out.println(lucky.informationPromo()+'\n');
	    InfoPromo.displayNmbreApprenant();
	    //InfoPromo.displayNomApprenant();
	    
	
	}

}

