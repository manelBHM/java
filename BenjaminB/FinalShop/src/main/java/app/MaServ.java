package co.simplon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaServ
 */
public class MaServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	List<Produit> listeProd = new ArrayList();

	public MaServ() {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		
		if(request.getQueryString() == null) {
			request.setAttribute("liste", listeProd);
			
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

			
		}
		
		else {
			Domicile dom = new Domicile();
            Express exp = new Express();
            Relay relay = new Relay();
            Takeway take = new Takeway();
			String chaine = request.getQueryString();
			Map<String, String> queryMap = getQueryMap(chaine);	
			
			Client client = new Client(queryMap.get("fullname"), queryMap.get("adress"), Integer.parseInt(queryMap.get("ID")));
            
			if( queryMap.get("dom") != null){
				Facture facture = new Facture(client, dom);
				}
			else if (queryMap.get("express") != null) {
				Facture facture = new Facture(client, exp);
			}
			else if (queryMap.get("relay") != null) {
				Facture facture = new Facture(client, relay);
			}
			else if (queryMap.get("takeway") != null) {
				Facture facture = new Facture(client, take);
			}
			
			
			
			
			
			
			
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/output.jsp").forward(request, response);

			
		}
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void init() {

		Produit tele1 = new Television("Samsung UE56612 ", 399, "super TV bro", "Samsung", 100, "LCD");
		Produit tele2 = new Television("Philips HD34567", 499, "Supet TV too", "Philips", 130, "LED");
		Produit frigo1 = new Frigo("BEKOWsssSsUUPER FReeZ", 599, "Froid comme ta mere", "BEKO", 40, true);
		listeProd.add(tele2);
		listeProd.add(tele1);
		listeProd.add(frigo1);
		
		
	}
	public  Map<String, String> getQueryMap(String query)  
	 {  
	     String[] params = query.split("&");  
	     Map<String, String> map = new HashMap<String, String>();  
	     for (String param : params)  
	     {  
	         String name = param.split("=")[0];  
	         String value = param.split("=")[1];  
	         map.put(name, value);  
	     }  
	     return map;  
	 }  

	public Map<Produit, Integer> getProdInQuery(String query) {
		
		String[] prod = query.split(":");
		
		
		return null;
		
	}
}
