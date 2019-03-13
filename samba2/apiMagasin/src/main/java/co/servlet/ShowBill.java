package co.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.apiMagasin.Bill;
import co.apiMagasin.Client;
import co.apiMagasin.Delivery;
import co.apiMagasin.DirectDelivey;
import co.apiMagasin.ExpressDelivery;
import co.apiMagasin.Produit;
import co.apiMagasin.RelayDelivery;
import co.apiMagasin.TakeAwayDelivery;
import co.apiMagasin.Writer;

/**
 * Servlet implementation class ShowBill
 */
// @WebServlet("/ShowBill")
public class ShowBill extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowBill() {
		// TODO Auto-generated constructor stub
	}

	List<Produit> produit = new ArrayList<Produit>();

	@Override
	public void init() throws ServletException {
		// Produit tv = new Television("Sony ", " TV xp-340 LED", 49, "Pouce",
		// 799.90);
		// Produit fg = new Frigo("Samsung 1042 F", "Réfrigérateur samsung 130L
		// - Classe A+ - blanc", 189, false, 699.00);
		// Produit four = new Four("Phillips Four", "Phillips-457M Puissance :
		// ", 3000, 268.99);
		// produit.add(tv);
		// produit.add(fg);
		// produit.add(four);

	}

	private void displayForm(HttpServletResponse response) throws Exception {
		for (int i = 0; i < produit.size(); i++) {
			Produit produits = produit.get(i);
			response.getWriter().println("<b>" + i + "-" + produits.toString() + "</b>");
		}
	}

	public Map<String, String> splitParameter(String queryString) {
		String[] paramList = queryString.split("&");
		Map<String, String> params = new HashMap<String, String>();
		for (String paramLists : paramList) {
			String[] keyAndValue = paramLists.split("=");
			params.put(keyAndValue[0], keyAndValue[1]);
		}
		return params;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String champ = request.getQueryString();

		if (champ == null) {
			this.getServletContext().getRequestDispatcher("/deliverForm.jsp").forward(request, response);
			try {
				displayForm(response);
			} catch (Exception e) {

				e.printStackTrace();
			}

		} else {
			// displayBill();
			// HashMap<String, String> list = new HashMap<String, String>();
			// String[] idChamp = champ.split("&");
			// for (String cham : idChamp) {
			// String[] run = cham.split("=");
			// list.put(run[0], run[1]);
			// }
			displayBill(request, response);
			request.setAttribute("champ", champ);

			this.getServletContext().getRequestDispatcher("/outFrom.jsp").forward(request, response);

			// request.setAttribute("champ", displayBill(request, response));

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	private void displayBill(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> params = splitParameter(request.getQueryString());
		Client client = new Client(params.get("fullName"), params.get("address"));
		Delivery deliver = null;

		switch (params.get("dliveryMode")) {
		case " direct":
			deliver = new DirectDelivey();
			break;
		case "express":
			deliver = new ExpressDelivery(params.get("deliverInfo"));
			break;
		case "relay":
			deliver = new RelayDelivery(Integer.parseInt(params.get("deliverInfo")));
			break;
		case "takeaway":
			deliver = new TakeAwayDelivery();
			break;
		}
		Bill bill = new Bill(client, deliver);
		String[] produitParam = params.get("produits").split("&");
		for (String prodParam : produitParam) {
			String[] produitNumber = prodParam.split("=");
			Produit produits = produit.get(Integer.parseInt(produitNumber[0]));
			Integer quantity = Integer.parseInt(produitNumber[1]);
			bill.addProduct(produits, quantity);
		}

		bill.generate(new Writer() {

			public void start() {
			}

			public void writeLine(String line) {
				try {
					response.getWriter().println("<br/>" + line);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			public void stop() {

			}

			@Override
			public void template() {

			}

		});
	}
}
