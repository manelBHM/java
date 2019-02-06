package marketControle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import livraison.Delivery;
import livraison.DirectDelivery;
import livraison.ExpressDelivery;
import livraison.RelayDelivery;
import livraison.TakAwayDelivery;
import model.*;
import services.Bill;
import users.Customer;
import boutiqueWriter.*;

/**
 * Servlet implementation class marketControlor
 */
public class marketControlor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Product produit;
	Product tele;
	Product computer;
	Product telephone;
	Bill bill;
	Customer customer;
	Delivery modlivre;
	FileWriter writer;
	static int id = 0;
	Map<Product, Integer> map = new HashMap<Product, Integer>();

	@Override
	public void init() throws ServletException {
		customer = new Customer();

	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public marketControlor() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = " ";
		String address = " ";
		request.setAttribute("name", name);
		request.setAttribute("address", address);
		String infoLivarison = " ";
        request.setAttribute("infoLivarison", infoLivarison);
		// String params = request.getQueryString();
		request.getRequestDispatcher("index.jsp").forward(request, response);	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// récupérer le nom (fullname) et l'adress du client
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String infos = "";
		request.setAttribute("infoLivarison", infos);
		// envoyer le nom et l'adresse à la page jsp
		request.setAttribute("name", name);
		request.setAttribute("address", address);
		
		// effectuer le nom et l'adresse du client
		customer.setFullname(name);
		customer.setAddress(address);
		
	// récupérer le mode de livaison du client
try {
	String modLiveration = request.getParameter("livration");

	switch (modLiveration) {
	case "option1":
		modlivre = new DirectDelivery();
		break;
	case "option2":
		modlivre = new ExpressDelivery(address);
		break;
	case "option3":
		modlivre = new RelayDelivery(this.produit.getId());
		break;
	case "option4":
		modlivre = new TakAwayDelivery();
		break;
	}
	// instancier le pannier du client en utilisant l'objet customer (client) et le mode de livaison et le map du client
	bill = new Bill(customer, modlivre);

    }catch(Exception e) {
	
    }
   //  request.setAttribute("liver", modlivre);
		
		// récupérer les choix du client en format text string
		String text = request.getParameter("listeProduit");

		
		// manipuler le text string pour avoir les produits et les quantité choisis
	       String [] myT  = text.split("&");
	       
	       List<String> p = new ArrayList<>();
			List<Integer> q = new ArrayList<>();
			String [] my;
	       for (int i = 0; i < myT.length; i++) {
	       String [] myt= myT[i].split(":");
	       	p.add(myt[0]);
	       	try {
	       	 int x= Integer.parseInt(myt[1]);
		       	q.add(x);
	       	}catch(Exception e) {
	       		
	       	}
	     
	      }

		
		for (int i = 0; i < p.size(); i++) {
			
			String leProduit = p.get(i);
			
			switch (leProduit) {
			case "computer":
				computer = new  Computer("Lenovo Yoga 920 ", " Processeur Intel Core i5-8250U  Ecran 13.9 pouces, 1920 x 1080 pixels ", 680, 13,  q.get(i));
				bill.addProduct(computer, q.get(i));
				break;
			case "telephone":
				telephone = new Telephone("huawei p20", "Processeur Kirin 970 Mémoire vive 4 Go Écran 5,8 pouces", 850, q.get(i));
				bill.addProduct(telephone, q.get(i));
				break;
			case "tele":
				tele = new Television("Sammsung","TV HD 32'', 100 PQI", 700, q.get(i));
				bill.addProduct(tele, q.get(i));
				break;
			}
		}
//		double to = bill.getTotal( bill.getProducts());
//		request.setAttribute("to", to);
		
try {
    String total = " Total "+ bill.getTotal() + "€";
           infos = total +"\n : "+modlivre.getInfo();

	request.setAttribute("infoLivarison", infos);
	
	Map<Product, Integer> allProducts	= bill.getProducts();

	request.setAttribute("allProducts",allProducts);
 }catch(Exception e) {
	
     }

	request.getRequestDispatcher("index.jsp").forward(request,response);
    }
	
}   



