package marketControle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;

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

public class TestServlet extends HttpServlet {

	Delivery delivery;
	Product products;
	Bills bills;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);

		this.getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
	}
	
	
	
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
     	Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
     	Product tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
     	Product fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);
		
     	List<Product> listProduct = new ArrayList<Product>();
     	listProduct.add(cafe);
       	listProduct.add(tv);
       	listProduct.add(fridge);
     	
		
		
		
		//nama  and address 
		String fname = req.getParameter("name");
		String address = req.getParameter("address");
		
		Customer customer =new Customer(fname,address);
		
		req.setAttribute("name", fname);
		req.setAttribute("address", address);
		
		
		//adding delivery buttons 
		String city = req.getParameter("city");
		String deliv = req.getParameter("gridRadios");
		if("express".equals(deliv)) {
			delivery = new Express(city);
		}else if("domicile".equals(deliv)) {
			delivery = new Adomicile(city);
		}else if("point".equals(deliv)) {
			delivery = new PointRelais(city);
		}else {
			delivery = new Aretirer(city);
		}
		bills = new Bills(customer, delivery);
		//out livrasion
		req.setAttribute("city", city);
		double price = delivery.getPrice();
		req.setAttribute("price", price);
		//infor livraison
 
		
		//list poducts
		
		  Map<Product,Integer> map = new HashMap<Product, Integer>();
		  
		  List<String> p = new ArrayList<String>(); 
		  List<Integer> q = new	  ArrayList<Integer>();
		  
		  //String string = req.getParameter("area"); 
		/*
		 * String [] splitEspr = req.getQueryString().split("&");
		 * 
		 * HashMap <String, String> valeur = new HashMap <String, String>();
		 * 
		 * for (String element : splitEspr) { String [] splitEquals =
		 * element.split("=");
		 * 
		 * if(splitEquals.length == 2) { valeur.put(splitEquals[0], splitEquals[1]); }
		 * 
		 * } String[] tabl1 = valeur.get("area").split("%0D%0A");
		 */
		  req.setAttribute("var", req.getQueryString());
		  /*for(int i =0;i<tabl1.length;i++) { 
			  String[] tabl2 = tabl1[i].split(":");
		  
		  p.add(tabl2[0]);
		  
		  try { int k = Integer.parseInt(tabl2[i]);
		  
		  q.add(k);
		  
		  }catch(Exception e ){ e.getMessage(); }*/
		  
		  
		  
		  
		  
		/*
		 * }
		 * 
		 * for(int i =0;i<p.size();i++) { String prd = p.get(i); switch (prd) { case
		 * "tele": bills.addProducts(tv, q.get(i)); break; case "cafe":
		 * bills.addProducts(cafe, q.get(i)); //bills.addProducts(listProduct.get(0),
		 * quantity); //in case using the provided list break; case "fridge":
		 * bills.addProducts(fridge, q.get(i)); default:
		 * out.println("You have not picked up any value........"); break; } }
		 * 
		 * Map<Product ,Integer> ls = bills.getProducts();
		 * 
		 * req.setAttribute("listOfProducts", ls.size());
		 */
		 
		
		
		
		
 
 
		
		
		
		
		
		
		
		
		this.getServletContext().getRequestDispatcher("/out.jsp").forward(req, resp);
	}


	/*
	 * // anothe logic way to get paramete and show them
	 * 
	 * 
	 * String string = req.getParameter("area"); String[] tabl1 = string.split("&");
	 * 
	 * for(int i =0;i<tabl1.length;i++) { String[] tabl2 = tabl1[i].split(":");
	 * 
	 * for(int j =0;j <tabl2.length;j++) { String productName = tabl2[0]; String
	 * description = tabl2[1]; String priceprod = tabl2[2]; String quantity =
	 * tabl2[3]; products.setName(productName);
	 * products.setDescription(description);
	 * products.setPrice(Double.parseDouble(priceprod)); listProduct.get(index)
	 * map.put(products, Integer.parseInt(quantity)); } }
	 * 
	 */
	

}
