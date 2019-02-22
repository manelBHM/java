package marketControle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Product;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		
		printWriter.print("<head>");
		printWriter.print("<link href='css/bootstrap.min.css' rel='stylesheet>'");
		printWriter.print("</head>");
		printWriter.print("<body style='background: #f4fcff;'>");
		printWriter.print("<div style='padding: 40px; background: #c8d6e5; margin-top: 20px; border-radius: 15px;'>");
		
		printWriter.println("<a href='index.jsp' class=btn='btn btn-info' role'button' style='font-size: 20px; color: #007bff;'> Home </a>"
				+ "<a href='http://localhost:8080/MyMarketWeb/addProduct.jsp' class=btn='btn btn-info' role'button' style='font-size: 20px; color: #007bff; margin-left: 10px;'> Add Product </a>");
		printWriter.println("<h1 style='text-decoration: underline;'>List Products</h1>");
		
		printWriter.print("<table border='1' width='100%'>");
		printWriter.print("<tr><th>ID</th><th>Name</th><th>Description</th><th>Price</th><th>Update</th></th><th>Delete</th>");

			List<Product> list;
			try {
				list = ProductDao.getList();
				for(Product pro:list) {
	
					printWriter.print("<tr><td>"+pro.getId()+"</td><td>"+pro.getName()
					+"</td><td>"+pro.getDescription()+"</td><td>"+pro.getPrice()+"$</td>"
					+ "<td><a href='UpdateServlet?id="+pro.getId()+"' style='color: #007bff;'> edit</a></td> "
					+ "<td><a href='DeleteServlet?id="+pro.getId()+ "' style='color: #007bff;'> delete</a></td/</tr>");
				
				}
		
				} catch (Exception e) {
					e.printStackTrace();
				}
		
		
		printWriter.print("</table>");
		printWriter.print("</div>");
        printWriter.print("</body>");
			

	}


}
