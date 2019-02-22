package co.simplon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PharmacieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE ="/Facture.jsp" ;
	ArrayList<Produit> listPanier = new ArrayList<Produit>();
	
	ArrayList<Produit> liste = new ArrayList<Produit>();
	StringBuilder str=null;
	StringBuilder afficherListe;

	
    public PharmacieServlet() {
       
    }
    
    public void init() throws ServletException{
    	
    	Produit doliprane = new Produit("Doliprane", 4.0);
    	Produit dafalgan = new Produit("Dafalgan", 3.0);
    	Produit spasfon = new Produit("Spasfon", 3.0);
    	Produit siro = new Produit("Siro", 6.0);
    	Produit osilo = new Produit("Osilo", 5.0);
    	Produit coludol = new Produit("Coludol", 5.0);
    	
    	liste.add(doliprane);
    	liste.add(dafalgan);
    	liste.add(spasfon);
    	liste.add(siro);
    	liste.add(osilo);
    	liste.add(coludol);
    }
    
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		if (request.getQueryString() == null) {
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
			String prenom = valeur.get("prenom").replace('+', ' ');
		
			
			Client client = new Client(nom, prenom);
			Facture facture = new Facture(client);

			
			for (Produit ele:listPanier) {
				facture.addProduit(ele, 1);
			}
          Map<Produit, Integer> finalfacture = facture.getProduit();
			
			StringBuilder afficher = facture.afficherFacture(finalfacture);
			request.setAttribute("afficher", afficher);
	               
			StringBuilder nomPro = affichePanier(listPanier);
		    request.setAttribute("listduPanier", nomPro);
		
		
			this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
		}
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String button = request.getParameter("produit");
	int button1 = Integer.parseInt(button);
	listPanier=remplirPanier(liste,button1);

	StringBuilder nomPro = affichePanier(listPanier);
    request.setAttribute("listduPanier", nomPro);
  
    str=affichePanier(listPanier);
   request.setAttribute("listduPanier", str );
    System.out.println(listPanier);
    
    this.getServletContext().getRequestDispatcher("/paner.jsp").forward(request, response);
		
	}
      public ArrayList<Produit>remplirPanier(ArrayList<Produit> list1,int index) {
        
	listPanier.add(list1.get(index));
        
        System.out.println("il passe par la mehode remplirPanier");
      
        return listPanier ;
    }
      public StringBuilder affichePanier(ArrayList<Produit>listPanierPro) {
    	   str = new StringBuilder("");
          str.append("               Votre Panier           ").append("<br>");
          for(Produit ls : listPanier)
          {
              str.append(ls.getNom()+" "+ls.getPrix()+"€").append("<br>");
          }
          
          return str;
      }

}

