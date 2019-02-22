package com.simplon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShopServelet
 */
public class ShopServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	List<Produit> listBaseProduit = new ArrayList<Produit>();//recupere la liste des produits de la base des données

	ArrayList<Produit> listProduit = new ArrayList<Produit>();//regupere la liste des produits que l'utilisateur à choisi
	
	public ShopServelet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
/*
		Produit p1 = new Television(12.30, "Trés beau", "Samsung", "4/3", "4K");
		Produit p2 = new Four(60.99, "Trés chaud", "Philips", 50, 900);
		Produit p3 = new Cafetiere(32.99, "Bon cafée", "Nespreso", 5, 2);

		listProduit.add(p1);
		listProduit.add(p2);
		listProduit.add(p3);
		*/
		
		Test_base tb = new Test_base();
		listBaseProduit = tb.getAllProduit();

	}


	@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		String allInfo = request.getQueryString();

		//-----------------definition du chemin
		if(allInfo==null) {
			StringBuilder listProduitBD = afficherList(listBaseProduit);
			request.setAttribute("listBase", listProduitBD);
			this.getServletContext().getRequestDispatcher("/viewCommande.jsp").forward(request, response);
			
		}else {
			//////////////////-----traitement pour l'affichage dans le formulaire-----------
			
			
		//	String listProduitBD = listBaseProduit;
			
			
		
			
			
			
			//request.setAttribute("myProduct", myList);
			
			//////////////////--------traitement pour l'affichage dans le view------------------
			
			
			
			
			
			
			
			

			//---------------ciblage des données--------
			request.setAttribute("allInf", allInfo);

			Map<String,String> allList = new HashMap<String, String>();//liste trier par cle et valeur de tous les produits
			Map<String, String> produitList = new HashMap<String, String>();//list des produits
			String[] allInfo1=allInfo.split("&");

			for(String a : allInfo1) {//affichage tab1
				System.out.println(a);
			}

			for(String b : allInfo1) {//met dans une yable coupé par "=" et met les deux parties dans un map
				String[] allInfo2 = b.split("=");
				String c = allInfo2[0]; 
				String v = allInfo2[1];
				allList.put(c, v);
			}

			for(Entry<String,String> ls : allList.entrySet()) {//isole les données produit de la liste entière
				System.out.println("cle = "+ls.getKey()+" valeur = "+ls.getValue());
				if(ls.getValue().equals("produit")) {
					produitList.put(ls.getKey(), ls.getValue());
				}
			}

			for(Entry<String, String> pl : produitList.entrySet()){

				System.out.println("cle pro = "+pl.getKey()+" valeur pro = "+pl.getValue());

			}

			//-------------------------------------------------------------------------------- 

			//------------Client

			String nom1 = request.getParameter("nom");
			String adresse1 = request.getParameter("adresse");

			//String produits = request.getParameter("listproduit");

			System.out.println(nom1+adresse1);

			Client c1 = new Client(nom1,adresse1);
			//----------------------------------------------------

			String donnesClient = c1.afficheClient();

			//-------------------livraison

			String choixLivraison = request.getParameter("choixLib");

			Livraison l1 = null;
			l1 = choixLib(choixLivraison);

			//---------------------------------------------------------------------


			//--------------------Facture
			Facture f1 =new Facture(c1,l1);


			//------------------Produit

			Produit p1 = null ;

			for(Entry<String,String> p : produitList.entrySet()) {

				Produit prod = listProduit.get(Integer.parseInt(p.getKey()));

				System.out.println("PROD"+prod);
				
				f1.ajouterProduit(prod, 2);
			}
			//--------------------------------------------------------------


			//f1.ajouterProduit(p2, 1);
			//f1.ajouterProduit(p3, 3);
			try {
				f1.afficheFacture();

				String facturetous=f1.afficheLaFacture();//String sur le quel on met toute la facture en String
				request.setAttribute("facture", facturetous);
			}catch(NombreProduitException e) {}


			String infoLib = l1.infoLivraison();

			request.setAttribute("livraison",infoLib);


			//		request.setAttribute("leNom",nom1);
			//		request.setAttribute("ladresse", adresse1);

			request.setAttribute("donneesClients", donnesClient);

			this.getServletContext().getRequestDispatcher("/viewAffiche.jsp").forward(request, response);
		}
		//-----------------definition du chemin----------------------------------------------------------

		//this.getServletContext().getRequestDispatcher("/viewCommande.jsp").forward(request, response);
	}







	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/viewAffiche.jsp").forward(request, response);

	}


	
	static public StringBuilder afficherList(List<Produit> base) {
		
		StringBuilder str = new StringBuilder(" ");
		
		int a = 1;
		
		for (Produit p : base) {
			str.append(a + " " +p.getNom()+" "+p.getPrix()+" "+p.getDescription()+" "+p.getMarque());
			a++;
		}
		
		return str;
	}





	static public Livraison choixLib(String choixLivraison1) {

		Livraison tonChoix=null;

		switch (choixLivraison1) {

		case "EX":

			tonChoix = new Express(1);
			//			System.out.println("Habitez vous a Paris ?" + "\n" + "OUI - 1" + "\n" + "NON - 2");

			//			Scanner lieu = new Scanner(System.in);
			//			int choixExpress = sc.nextInt();
			//
			//			if (choixExpress == 1) {
			//				l1 = new Express(1);
			//			} else if (choixExpress == 2) {
			//				l1 = new Express(2);
			//			} else {
			//				System.out.println("Votre commande n'est pas valide");
			//			}

			break;

		case "DO":
			tonChoix = new Domicile();
			break;

		case "RM":
			tonChoix = new RetirerMagasin();
			break;

		case "PR":

			System.out.println("Quel est le numéro de votre point relay : ");
			Scanner numRelay = new Scanner(System.in);
			int rel = numRelay.nextInt();
			tonChoix = new Relay(rel);


		default:
			System.out.println("votre choix n'existe pas");

		}

		return tonChoix;

	}

}