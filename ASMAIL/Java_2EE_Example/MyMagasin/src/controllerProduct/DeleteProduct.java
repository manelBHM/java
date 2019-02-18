package controllerProduct;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;

public class DeleteProduct extends HttpServlet {

	private static final long serialVersionUID = 1L;

    public DeleteProduct() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String proId = request.getParameter("id");
		int id = Integer.parseInt(proId);
		
		ProductDao.delete(id);
		response.sendRedirect("ProductServlet");
	}
}
