package magazin.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xml.internal.security.Init;

import classes.demo.Adomicile;
import classes.demo.Bills;
import classes.demo.Customer;
import classes.demo.Delivery;
import classes.demo.Express;
import classes.demo.Fridge;
import classes.demo.PointRelais;
import classes.demo.Product;
import classes.demo.Television;
import comdao.JdbcDAOImp;
 

/**
 * Servlet implementation class MagazinServlet
 */
public class MagazinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	java.util.List<Product> list = new ArrayList<Product>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	
    public MagazinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
 
    
    
    
    @Override
    public void init() throws ServletException {
    	
    	
		//Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
     	//Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
     	//Product fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);
     	//list.add(cafe);
     	//list.add(tv);
     	//list.add(fridge);
    	
    	
    	//retrieting my data from sql server
    	
    	list = new JdbcDAOImp().getAll();
    	
    	
    	
 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();

		
		Product product;
 


		
		
		String url = request.getQueryString();
		
		if(url==null) {
			this.getServletContext().getRequestDispatcher("/WEB-INF/input2.jsp").forward(request, response);
		}else {
			
			String[] chain1 = url.split("&");
			Map<String,String> map = new HashMap<String,String>();
			
			for(String elements:chain1) {
				String[] chain2 = elements.split("=");
				if(chain2.length==2) {
					map.put(chain2[0], chain2[1]);
				}
				
			
			}
			
			
			
			String name = map.get("name");
			String address = map.get("address");
			Customer customer = new Customer(name,address);
			
			Delivery delivery=null;
			String livraison = map.get("gridRadios");
			switch(livraison) {
			case "domicile":
				delivery = new Adomicile("Paris");
				break;
			case "express":
				delivery = new Express("Lyon");
				break;
			case "relais":
				delivery = new PointRelais("Montreuil");
				break;
			//default:
				//out.println("you have not selected your delivery option ... ");
				//break;
			
			}
			
			Bills bill= new Bills(customer,delivery);
			

			
			String[] proList = map.get("area").split("%0D%0A");
 
			for(String elements:proList) {
				String[] ls = elements.split("%3A");
					Product p = list.get(Integer.parseInt(ls[0]));
	//				System.out.println(p);
					Integer q = Integer.parseInt(ls[1]);
					bill.addProducts(p, q);
			}
			
			Map<Product,Integer> pro = bill.getProducts();
			
			StringBuffer show = bill.showProducts(pro);
			
			request.setAttribute("show", show);
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/output.jsp").forward(request, response);
		
			
		}
 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		

	}

}
