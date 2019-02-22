package co.simplon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PharmacieServlet
 */
//Source : www.exelib.net

public class PharmacieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE ="/Facture.jsp";
	
	ArrayList<Produit> liste = new ArrayList<Produit>();
	
	ArrayList<Produit> listPanier = new ArrayList<Produit>();
	StringBuilder str=null;
	
	StringBuilder afficherListe;
	/*ProduitDAO produitdao = new ProduitDAO();*/

	
    public PharmacieServlet() {
        // TODO Auto-generated constructor stub
    }
    
    public void init() throws ServletException{
    	
    	Produit doliprane = new Produit("Doliprane", 4.0);
    	Produit dafalgan = new Produit("Dafalgan", 3.0);
    	Produit spasfon = new Produit("Spasfon", 3.0);
    	Produit siro = new Produit("Sirop", 6.0);
    	Produit osilo = new Produit("Oscillo", 5.0);
    	Produit coludol = new Produit("Colludol", 5.0);
    	
    	liste.add(doliprane);
		liste.add(dafalgan);
		liste.add(spasfon);
		liste.add(siro);
		liste.add(osilo);
		liste.add(coludol);
		
    	/*liste = new ProduitDAO().getAll();*/
    }
    
  /*  public StringBuilder afficherListe(ArrayList<Produit> liste) {
    	
    	int i =1;
    	for(Produit element : this.liste) {
    		
    		str.append(i + "- " + " " + element.getNom() + " " + element.getPrix() + " euros <br>");
    		i++;
    	}

    		System.out.println("");
    		return str;
}*/
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		if (request.getQueryString() == null) {
			
			/*StringBuilder afficherProduit = afficherListe(liste);
			request.setAttribute("afficherProduit", afficherProduit);*/
			
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
			
			/*String nom = valeur.get("nom").replace('+', ' ');
			String prenom = valeur.get("prenom").replace('+', ' ');
			
			Client client = new Client(nom, prenom);
			Facture facture = new Facture(client);
			String [] splitEnter = valeur.get("produits").split("%0D%0A");
			
			for(String element : splitEnter) {
				String [] ListeProduit = element.split("%3A");
			
			Produit produit = liste.get(Integer.parseInt(ListeProduit[0])-1);
			Integer quantite = Integer.parseInt(ListeProduit[1]);
			facture.addProduit(produit, quantite);
			}
			*/
			
			String nom = valeur.get("nom").replace('+', ' ');
            String prenom = valeur.get("prenom").replace('+', ' ');
        
            
            Client client = new Client(nom, prenom);
            Facture facture = new Facture(client);
            /*String [] splitEnter = valeur.get("produit").split("%0D%0A");
          
            
            for(String element : splitEnter) {
                String [] ListeProduit = element.split("%3A");
                
                Produit produit = liste.get(Integer.parseInt(ListeProduit[0]) -1);
                Integer quantite = Integer.parseInt(ListeProduit[1]);
                facture.addProduit(produit, quantite);
              
            }*/
            for (Produit ele:listPanier) {
                facture.addProduit(ele, 1);
            }
			Map<Produit, Integer> finalfacture = facture.getProduit();
			
			StringBuilder afficher = facture.afficherFacture(finalfacture);
			request.setAttribute("afficher", afficher);
			StringBuilder nomPro = affichePanier(listPanier);//affichage
	        request.setAttribute("listduPanier", nomPro);
	        
			this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
		}
}
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String button = request.getParameter("produit");       
        int button1 = Integer.parseInt(button);
        
        /*for(int i=0; i<listPanier.size(); i++) {
        	if("value" == "1") {
        		
        	}
        }*/
        
        
        listPanier=remplirPanier(liste,button1);
        /*Produit produit1 = listPanier.get(0);*/
        /*String nomPro = produit1.toString();*/
        
        
        /*request.setAttribute("listduPanier", nomPro);*/
        StringBuilder nomPro = affichePanier(listPanier);//affichage
        request.setAttribute("listduPanier", nomPro);
        
        this.getServletContext().getRequestDispatcher("/Panier.jsp").forward(request, response);
	}

		public ArrayList<Produit>remplirPanier(ArrayList<Produit> list1,int index) {
        
           
        listPanier.add(list1.get(index));
                
        return listPanier;
    }
		
		public StringBuilder affichePanier(ArrayList<Produit>listPanierPro) {
			str = new StringBuilder("");
            //str.append("               Votre Panier           ").append("<br><br>");
            for(Produit ls : listPanierPro){
                str.append(ls.getNom()+" "+ls.getPrix()+"€").append("<br>");
            }
            
            return str;
        }

}
