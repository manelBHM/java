package App_Magazan.Magazan;

import java.awt.im.InputMethodRequests;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.spi.orbutil.fsm.Input;

/**
 * Servlet implementation class TestMagazen
 */
@WebServlet("/TestMagazen")
public class TestMagazen extends HttpServlet  {
	private static final long serialVersionUID = 1L;
	
    public TestMagazen() {
        super();
    }
   
    
    @Override
	public void init() throws ServletException {
    	Product p1 = new Televesion ("(1) télévision : ", "hd", 599,"Samsong");
		 Product p2 = new Frigo("(2) frigo", "côte-à-côte", 600, "americain");
		
		
		
		 
	}
    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	
		
	
		
	if (request.getQueryString()==null) {
		
	this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		
		
	}
	else
	
		displayFacture(request);
		this.getServletContext().getRequestDispatcher("/index1.jsp").forward(request, response);
	

	}
	 
	
	public Map<String, String> splitParameters(String queryString) {
        String[] brutParams = queryString.split("&");
        Map<String, String> params = new HashMap<>();
        for (String brutParam : brutParams) {
            String[] keyAndValue = brutParam.split("=");
            if (keyAndValue.length == 2)
                params.put(keyAndValue[0], keyAndValue[1]);
        }
        return params;
    }
	

	
	public void displayFacture(HttpServletRequest request){
		 
		Map<String, String> params= splitParameters(request.getQueryString());
		String message = "---------------------------------------------------------";
		String name=params.get("nom");
		request.setAttribute("name",name);
		String adress =params.get("adresse");
		request.setAttribute("adress",adress);
		Client monClient =new Client(name,adress);
		
	//	request.setAttribute("message",message);
		
        String pro = params.get("listProduct");
       request.setAttribute("pro",pro);
       
       
        
       
        Product p1 = new Televesion ("(1) télévision : ", "hd", 599,"Samsong");
		 Product p2 = new Frigo("(2) frigo", "côte-à-côte", 600, "americain");
		 
		 Facture f = new Facture (monClient);
		
		 Map<Product, Integer> listeProduits = f.getProduct();
		
		

		 
		 
		 
		switch (params.get("listProduct")) {
		
		case "1":
			request.setAttribute("pro",p1.name+"\n"+p1.descripation+"\n"+p1.prise+"€");
			
			break;
			
		case "2":
			request.setAttribute("pro",p2.name+"\n"+p2.descripation+"\n"+p2.prise+"€");
			
			break;
			
		case "3":
			request.setAttribute("pro",p1+ "\n"+p2);
		}
	
		 
	
	
		 
		
	
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
