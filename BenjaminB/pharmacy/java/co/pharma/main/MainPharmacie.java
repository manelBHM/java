package co.pharma.main;

import java.sql.SQLException;
import java.util.Scanner;

import co.pharma.dao.ProduitDAO;

public class MainPharmacie {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		boolean rester = true;
		
		ProduitDAO pdao = new ProduitDAO();
		pdao.getAll();
		
	}

}
