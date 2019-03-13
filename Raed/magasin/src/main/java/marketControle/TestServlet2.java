package marketControle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.demo.Adomicile;
import maven_projet1.mvn_test1.Aretirer;
import maven_projet1.mvn_test1.Bills;
import maven_projet1.mvn_test1.Customer;
import maven_projet1.mvn_test1.Delivery;
import maven_projet1.mvn_test1.Express;
import maven_projet1.mvn_test1.Fridge;
import maven_projet1.mvn_test1.PointRelais;
import maven_projet1.mvn_test1.Product;
import maven_projet1.mvn_test1.Television;

/**
 * Servlet implementation class TestServlet2
 */
public class TestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
     	Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
     	Product fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);
		
     	List<Product> listProduct = new ArrayList<Product>();
     	
     	listProduct.add(cafe);
       	listProduct.add(tv);
       	listProduct.add(fridge);
		
		Bills bill;
		Customer customer;
		Delivery delivery = null;
		Product product;
		
		String originalString = request.getQueryString();
		
		if(originalString==null) {
			
			
			
			this.getServletContext().getRequestDispatcher("/input2.jsp").forward(request, response);
		}else {
			
			
			
			String[] chain1 = originalString.split("&");
			
			Map<String,String> map = new HashMap<String,String>();
			
			for(String st:chain1) {
				String[] chain2 = st.split("=");
				map.put(chain2[0], chain2[1]);
			}
			
			String name= map.get("name");
			String address = map.get("address");
			String city = map.get("city");
			customer = new Customer(name,address);

			
			
			String livraison = map.get("gridRadios");
			switch(livraison) {
			case "express":
				delivery = new Express("Paris");
				//delivery.getInfo();
				break;
			case "domicile":
				delivery = new Adomicile("Khartoum");
				//delivery.getInfo();
				break;
			case "point":
				delivery = new PointRelais("ils de France");
				//delivery.getInfo();
				break;
			case "retirer":
				delivery = new Aretirer("Mayo");
				//delivery.getInfo();
				break;
			default:
				out.println("You have not chosen your delivery option !!");
			
			}
			
			bill = new Bills(customer,delivery);
			String chain3 = map.get("area");
			String[] chain4 = chain3.split("%0D%0A");
			
			for(String s :chain4) {
				String[] chain5 = s.split("%3A");
				Product pr = listProduct.get(Integer.parseInt(chain5[0])-1);
				Integer quan = Integer.parseInt(chain5[1]);
				bill.addProducts(pr, quan);
			}
			
			
			Map<Product,Integer> listprods = bill.getProducts();
			StringBuffer allLists = bill.showProducts(listprods);
		
			//out
 
			request.setAttribute("lspro",allLists);
			
			
			
			
			
			
			
			
		}
		
		

		
		
		
		
		

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		this.getServletContext().getRequestDispatcher("/outTest2.jsp").forward(request, response);
	}

}
