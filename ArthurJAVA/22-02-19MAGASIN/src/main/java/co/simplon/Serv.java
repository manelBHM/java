package co.simplon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

/**
 * Servlet implementation class Serv
 */
@WebServlet("/Serv")
public class Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Produit> listeProduit = new ArrayList<>();
    /**
     * Default constructor. 
     */
    public Serv() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		/*
		
		
		String chaine = request.getQueryString();
		request.setAttribute("query", chaine);

		
		Map<String, String> queryMap = getQueryMap(chaine);	
		
		Client client = new Client(queryMap.get("fullname"), queryMap.get("adress"));
		
		
		
		
		String choix = queryMap.get("choixproduit");
		
		String[] choix2 = choix.split(":");

		Map<Integer, Integer> mapInt = new HashMap<Integer, Integer>();
		
		for(int i : choix2) {
			
		}
		
		
		
		
		
		for (Entry<String, String> entry : queryMap.entrySet()) {
			String param = entry.getKey();
			String value = entry.getValue();   
		}
		
		
		*/
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/post.jsp").forward(request, response);
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		/*  Television samsung = new Television("Samsung", "tele de ouf", 500, 130, "LED");
		Television lg = new Television("LG", "Super teloche", 300, 90, "LCD");
	    Fridge frigo = new Fridge("superfrigo", "il fait froid", 500, 120, true);
	    
		
		listeProduit.add(frigo);
		listeProduit.add(lg);
		listeProduit.add(samsung);
		
		*/
		
		ProductDAO p = new ProductDAO();
		listeProduit = p.getProduit();
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
		
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
         
        
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
        
		
		
		
		
		
		
		
		
		//this.getServletContext().getRequestDispatcher("/WEB-INF/post.jsp").forward(request, response);

	
	
	}

}
