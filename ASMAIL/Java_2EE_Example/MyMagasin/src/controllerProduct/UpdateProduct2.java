package controllerProduct;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Product;

public class UpdateProduct2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateProduct2() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();

		String proId = request.getParameter("id");
		int id = Integer.parseInt(proId);

		String name = request.getParameter("name");
		String desc = request.getParameter("desc");
		String price = request.getParameter("price");

		Product pro = new Product();

		pro.setId(id);
		pro.setName(name);
		pro.setDescription(desc);
		pro.setPrice(Double.parseDouble(price));

		int num;
		try {
			num = ProductDao.update(pro);
			if (num > 0) {
				response.sendRedirect("DisplayProduct");
			} else {
				printWriter.println("<h2> Sorry not updated :( </h2>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
