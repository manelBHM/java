package exple7;

public class Ville {

	
		private String nom;
		protected int nbreH;
		public Ville(String leNom) {
		nom = leNom.toUpperCase();
		nbreH = -1;
		}
	public Ville (String leNom, int leNbreH) {
		nom = leNom.toUpperCase();
		if(leNbreH<0) {
			System.out.println("Un nombre d'habitants doit être positif.");
}
		
	else {
		nbreH = leNbreH;
}}
		public String getNom() { 
		return nom; 
}
		public int getNbreH() { 
		return nbreH; 
}
		public void setNbreH(int nvNbreH) { 
		if(nvNbreH<0)
		System.out.println("Un nomre d'habitants doit être positif. La modification n'a pas été prise en compte");
		else nbreH = nvNbreH; 
}
		public String presenteToi() { 
		String presente = "Ville" + nom + "nombre d'habitants";
		if(nbreH == -1)
			presente = presente + "inconnu";
		else
			presente = presente + "=" + nbreH;
		return presente;
}
}
