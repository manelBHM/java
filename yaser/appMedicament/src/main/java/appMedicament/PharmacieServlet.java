package appMedicament;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PharmacieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE ="/Facture.jsp";
	
	ArrayList<Produit> liste = new ArrayList<Produit>();
	
	StringBuilder afficherListe;
	ProduitDAO produitdao = new ProduitDAO();
	StringBuilder str = new StringBuilder();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PharmacieServlet() {
        // TODO Auto-generated constructor stub
    }
    
    public void init() throws ServletException{
    	
    	Produit doliprane = new Produit("Doliprane", 4.0);
    	Produit dafalgan = new Produit("Dafalgan", 3.0);
    	Produit spasfon = new Produit("Spasfon", 3.0);
    	Produit siro = new Produit("Siro", 6.0);
    	Produit osilo = new Produit("Osilo", 5.0);
    	Produit coludol = new Produit("Coludol", 5.0);
    	
    	liste = new ProduitDAO().getAll();
    }
    
    public StringBuilder afficherListe(ArrayList<Produit> liste) {
    	
    	int i =1;
    	for(Produit element : this.liste) {
    		
    		str.append(i + "- " + " " + element.getNom() + " " + element.getPrix() + " euros <br>");
    		i++;
    	}

    		System.out.println("");
    		return str;
}
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		if (request.getQueryString() == null) {
			
			StringBuilder afficherProduit = afficherListe(liste);
			request.setAttribute("afficherProduit", afficherProduit);
			
			this.getServletContext().getRequestDispatcher("/Acceuil.jsp").forward(request, response);
			
		}else {
			
			String info = request.getQueryString();
			String [] splitEsp = info.split("&");
			
			Map<String, String> valeur = new HashMap<String, String>();
			
			for (String element : splitEsp) {
				String [] splitEquals = element.split("=");
				
				if (splitEquals.length == 2) {
					valeur.put(splitEquals[0], splitEquals[1]);
				}
			}
			
			String nom = valeur.get("nom").replace('+', ' ');
			String prenom = valeur.get("nom").replace('+', ' ');
			
			Client client = new Client(nom, prenom);
			Facture facture = new Facture(client);
			String [] splitEnter = valeur.get("produits").split("%0D%0A");
			
			for(String element : splitEnter) {
				String [] ListeProduit = element.split("%3A");
			
			Produit produit = liste.get(Integer.parseInt(ListeProduit[0]));
			Integer quantite = Integer.parseInt(ListeProduit[1]);
			facture.addProduit(produit, quantite);
			}
			
			Map<Produit, Integer> finalfacture = facture.getProduit();
			
			StringBuilder afficher = facture.afficherFacture(finalfacture);
			request.setAttribute("afficher", afficher);
		
			this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
		}
}
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}