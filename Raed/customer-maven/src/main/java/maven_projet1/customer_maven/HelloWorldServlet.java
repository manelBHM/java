package maven_projet1.customer_maven;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setContentType("text/html");
		    if (request.getQueryString() == null)
		        displayForm(request);
		    else
		        displayBill(request, response);
		    
		    displayBill(req, resp);
		    
		    //////////////////
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
		    ////n va maintenant  se charger de  displayBill . On commence par utiliser la méthode que l'on vient de créer :
		    Map<String, String> params = splitParameters(req.getQueryString());
		    
		    /////n crée une variable de type  Customer  que l'on remplit avec les bons champs.
		    Customer customer = new Customer(params.get("fullname"), params.get("address"));
		    
		    ////////On procède de même pour une variable de type  Delivery .
		    Delivery delivery = null;
		    switch (params.get("deliveryMode")) {
		        case "direct" :
		            delivery = new DirectDelivery();
		            break;
		        case "express" :
		            delivery = new ExpressDelivery(params.get("deliveryInfo"));
		            break;
		        case "relay" :
		            delivery = new RelayDelivery(Integer.parseInt(params.get("deliveryInfo")));
		            break;
		        case "takeAway" :
		            delivery = new TakeAwayDelivery();
		            break;
		    }
		    
		////////On peut maintenant créer notre facture.
		    Bill bill = new Bill(customer, delivery);
		    
		    
		    ///On va récupérer chaque produit et sa quantité associée. Petit détail, en HTTP, quand les paramètres sont
		    //transmis, les caractères spéciaux sont transformés. Ainsi :
		    //le retour à la ligne devient  %0D%0A  ;
		    //: devient  %3A .
		    String[] productsParams = params.get("products").split("%0D%0A");
		    for (String productLine : productsParams) {
		        String[] productAndQuantity = productLine.split("%3A");
		        Product product = products.get(Integer.parseInt(productAndQuantity[0]));
		        Integer quantity = Integer.parseInt(productAndQuantity[1]);
		        bill.addProduct(product, quantity);
		    }
		    
		    
		    ///l reste à générer notre facture. Nous avons de nouveau créé un  Writer  dédié :
		    bill.generate(new Writer() {
		        @Override
		        public void start() {
		        }
		        @Override
		        public void writeLine(String line) {
		            try {
		                resp.getWriter().println("<br/>" + line);
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		        @Override
		            public void stop() {
		        }
		    });
		    ////////////////qui nous donne .................
		    private void displayBill(HttpServletRequest req, HttpServletResponse resp) {
		        Map<String, String> params = splitParameters(req.getQueryString());
		        Customer customer = new Customer(params.get("fullname"), params.get("address"));
		        Delivery delivery = null;
		        switch (params.get("deliveryMode")) {
		            case "direct" :
		                delivery = new DirectDelivery();
		                break;
		            case "express" :
		                delivery = new ExpressDelivery(params.get("deliveryInfo"));
		                break;
		            case "relay" :
		                delivery = new RelayDelivery(Integer.parseInt(params.get("deliveryInfo")));
		                break;
		            case "takeAway" :
		                delivery = new TakeAwayDelivery();
		                break;
		        }
		        Bill bill = new Bill(customer, delivery);
		        String[] productsParams = params.get("products").split("%0D%0A");
		        for (String productLine : productsParams) {
		            String[] productAndQuantity = productLine.split("%3A");
		            Product product = products.get(Integer.parseInt(productAndQuantity[0]));
		            Integer quantity = Integer.parseInt(productAndQuantity[1]);
		            bill.addProduct(product, quantity);
		        }
		        bill.generate(new Writer() {
		            @Override
		            public void start() {
		            }
		            @Override
		            public void writeLine(String line) {
		                try {
		                    resp.getWriter().println("<br/>" + line);
		                } catch (IOException e) {
		                    e.printStackTrace();
		                }
		            }
		            @Override
		            public void stop() {
		            }
		        });
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
