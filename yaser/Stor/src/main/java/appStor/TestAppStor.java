package appStor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class TestAppStor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  Liveresion Liveresion = null;
	private double total = 0;
    List<Product> ListPro =new ArrayList<Product>(); 

	
	     
	@Override
	public void init() throws ServletException {
		/*  Product pr1 = new Televesion("(1) Televesion", "samsong", "hd", 550);
	        Product pr2 =  new Frigo("(2) frigo", "LG", "côte-à-côte", 700);
	        Product pr3 = new Fure("(3) four", "php", "noir", 400);
	        
	      ListPro.add(pr1);
	      ListPro.add(pr2);
	      ListPro.add(pr3);*/

			ListPro= new BassDeDo().getAll();
	
	      
	       
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getQueryString()==null) {
			
			this.getServletContext().getRequestDispatcher("/index1.jsp").forward(request, response);
				
				
			}
			else
			
				displayFacture(request, response);
				this.getServletContext().getRequestDispatcher("/index2.jsp").forward(request, response);
			
			
			}
			 
		
	public Map<String, String> splitParameters(String queryString) {
        String[] brutParams = queryString.split("&");
 
        Map<String, String> params = new HashMap<String, String>();
       
        for (String brutParam : brutParams) {
            String[] keyAndValue = brutParam.split("=");
     
            if (keyAndValue.length == 2)
                params.put(keyAndValue[0], keyAndValue[1]);
    
        }
        return params;
        
    }
	

	
	public void displayFacture(HttpServletRequest request, HttpServletResponse response){
		Map<Product, Integer> MapProduct = new HashMap<Product, Integer>();
		 
		Map<String, String> params= splitParameters(request.getQueryString());
	
	
		String name=params.get("nom");
		request.setAttribute("name",name);
		String adress =params.get("adresse");
		request.setAttribute("adress",adress);
		Client monClient =new Client(name,adress);
		
		
		 String liv  = params.get("Liveresion");
	        request.setAttribute("Liveresion",liv);
	 
	  
		
			
			switch (params.get("Liveresion")) {
			
			case "Adomicil":
				 Liveresion = new Adomicil();
				request.setAttribute("Liv",Liveresion.getPrise());
				
				;
				
				break;
				
			case "TakeAwayDelivery":
				 Liveresion = new TakeAwayDelivery();
				request.setAttribute("Liv",Liveresion.getPrise());
		
				
				break;
				
			case "ExpressDelivery":
				Liveresion = new ExpressDelivery();
				request.setAttribute("Liv",Liveresion.getPrise());
				
				
			}
			
			
			
		Factuer factuer = new Factuer(monClient, Liveresion);
        String[] pro = params.get("listProduct").split("%0D%0A");
      
         
        for(String element : pro){
       
        	String[] produitQuantite = element.split("%3A");
        	Product produit = ListPro.get(Integer.parseInt(produitQuantite[0]) - 1);
        	Integer quantite = Integer.parseInt(produitQuantite[1]);
        	factuer.addProduct(produit, quantite);
          
        }
        Map<Product,Integer> listProduct =factuer.getProduct();
        StringBuilder resum=factuer.resumePanier2(listProduct);
       
       request.setAttribute("resum", resum);
               

	}   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
