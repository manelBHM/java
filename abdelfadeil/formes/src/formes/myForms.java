package formes;
public class myForms {

	
	
	public static void cheminee() {
		for (int i = 0; i < 2; i++) {
			System.out.println();

		}
		for (int i = 0; i < 36; i++) {
			System.out.print(" ");

		}
		for (int i = 0; i < 4; i++) {

			System.out.print(" " + "≋");
		}
		System.out.println();

		for (int x = 0; x < 4; x++) {
			for (int i = 0; i < 36; i++) {
				System.out.print(" ");

			}
			System.out.print(" " + "≋");
			for (int y = 0; y < 4; y++) {
				System.out.print(" ");
			}
			System.out.print(" " + "≋");
			System.out.println();
		}
		
	}
	
	public static void ligneHautBas() {
		for (int i = 0; i < 4; i++) {
			System.out.print(" ");

		}
		for (int i = 0; i < 20; i++) {

			System.out.print(" " + "✡");
		}
		System.out.println();

	}
	
	public static void hautMur() {
		for (int x = 0; x < 8; x++) {
			for (int i = 0; i < 4; i++) {
				System.out.print(" ");

			}
			System.out.print(" " + "✡");
			
			for (int y = 0; y < 36; y++) {
				System.out.print(" ");
			}
			
			System.out.print(" " + "✡");
			System.out.println();
			
		}
	}
	
	public static void ligneHautePorte() {
		// ici comance la porte 
		for (int i = 0; i < 4; i++) {
			System.out.print(" ");
			
		}

		// première ligne de la porte
		System.out.print(" "+"✡");

		for (int x = 0; x < 15; x++) {
			
			System.out.print(" ");
			
		}
			for (int y = 0; y < 8; y++) {
				System.out.print("♦");
			}
			
			for (int y = 0; y < 13; y++) {
				System.out.print(" ");
			}
			System.out.print(" "+"✡");
			System.out.println();
			//fin de première ligne de la porte
	}
	
	public static void premierePartiFentre() {
		// première ligne de la fenêtre
					for (int y = 0; y < 4; y++) {
						System.out.print(" ");
					}
					
					System.out.print(" " + "✡");
					
					for (int i = 0; i < 5; i++) {
						System.out.print(" ");
					}
					for (int i = 0; i < 5; i++) {
						System.out.print("❁");
					}
					
					for (int i = 0; i < 5; i++) {
						System.out.print(" ");
					}
					System.out.print("♦");
					for (int i = 0; i < 6; i++) {
						System.out.print(" ");
					}
					System.out.print("♦");
					
		         //fenêtre 2
					
					for (int i = 0; i < 5; i++) {
						System.out.print(" ");
					}
					
					for (int i = 0; i < 5; i++) {
						System.out.print("❁");
					}
					
					for (int i = 0; i < 4; i++) {
						System.out.print(" ");
					}
					System.out.print("✡");
				    System.out.println();
	}
	public static void partiPortFentre() {
		
			for (int i = 0; i < 3; i++) {
				for (int y = 0; y < 4; y++) {
	 				System.out.print(" ");
	 			}
	 			
	 			System.out.print(" " + "✡");
	 			
	 			for (int j = 0; j < 5; j++) {
	 				System.out.print(" ");
	 			}
					System.out.print("❁");

	 			for (int x = 0; x < 3; x++) {
	 				System.out.print(" ");
	 			}
					System.out.print("❁");

	 			for (int y = 0; y < 5; y++) {
	 				System.out.print(" ");
	 			}
	 			System.out.print("♦");
	 			for (int n = 0; n < 6; n++) {
	 				System.out.print(" ");
	 			}
	 			System.out.print("♦");
	 			
	          //fenêtre 2
	 			
	 			for (int m = 0; m < 5; m++) {
	 				System.out.print(" ");
	 			}
					System.out.print("❁");
	 			for (int b = 0; b < 3; b++) {
	 				System.out.print(" ");
	 			}
					System.out.print("❁");

	 			for (int v = 0; v < 4; v++) {
	 				System.out.print(" ");
	 			}
	 			System.out.print("✡");
	 		    System.out.println();
	 			
	}
	}
	
	public static void partiBasPorte() {
		for (int x = 0; x < 4; x++) {
			
			for (int y = 0; y < 4; y++) {
				System.out.print(" ");
			}
			
			System.out.print(" " + "✡");
			
			for (int i = 0; i < 15; i++) {
				System.out.print(" ");
			}
			System.out.print("♦");
			for (int i = 0; i < 6; i++) {
				System.out.print(" ");
			}
			System.out.print("♦");
			

			
			for (int i = 0; i < 14; i++) {
				System.out.print(" ");
			}
			System.out.print("✡");
		    System.out.println();
			
			
			
			
		}
	}
	
	public static void Chambre() {

		 cheminee();
//		la chambre 
		 ligneHautBas();
		 hautMur();
		// ici comance la porte 
		 ligneHautePorte();
		
			// la fenêtre 
		 premierePartiFentre();
       //    partiPorteFenetre();
		 partiPortFentre();
			
	
		 // dernière ligne de la fenêtre
		 premierePartiFentre();
		 		
			// fin fenêtre
		 		    
		 partiBasPorte();
			// fin de la chmbre
			 ligneHautBas();
	}

	public static void main(String[] args) {
		Chambre();
	}

}
