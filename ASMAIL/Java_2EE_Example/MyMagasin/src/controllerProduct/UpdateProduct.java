package controllerProduct;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Product;

public class UpdateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			response.setContentType("text/html");
			PrintWriter printWriter = response.getWriter();
			printWriter.println("<h2> Update Product </h2>");

			String proID = request.getParameter("id");
			int id = Integer.parseInt(proID);

			Product pro = ProductDao.getById(id);

			printWriter.print("<head>");
			printWriter.print("</head>");

			printWriter.print("<body style='padding: 40px; background: aliceblue; text-align: center;'>");
			printWriter.print("<div>");
			printWriter.print(
					"<form style='display: inline-grid; background: #c8d6e5; padding: 30px;' action='UpdateProduct2' method='post' style='display:inline-grid;'>");
			printWriter.print(
					"<input style='width: 400px; margin-bottom: 10px; padding: 10px;' type'hidden' name='id' value='"
							+ pro.getId() + "'/>");
			printWriter.print(
					"<input style='width: 400px; margin-bottom: 10px; padding: 10px;' type'text' name='name' value='"
							+ pro.getName() + "'/>");
			printWriter.print(
					"<input style='width: 400px; margin-bottom: 10px; padding: 10px;' type'text' name='desc' value='"
							+ pro.getDescription() + "'/>");
			printWriter.print(
					"<input style='width: 400px; margin-bottom: 10px; padding: 10px;' type'text' name='price' value='"
							+ pro.getPrice() + "'/>");
			printWriter.print(
					"<button style='width: 200px; margin-bottom: 10px; padding: 10px;' submit'> Update </button>");
			printWriter.print("</from>");
			printWriter.print("</div>");
			printWriter.print("</body>");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
