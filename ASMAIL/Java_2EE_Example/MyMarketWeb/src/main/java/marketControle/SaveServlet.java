package marketControle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Product;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		
		String name = request.getParameter("name");
		String desc = request.getParameter("desc");
		String price = request.getParameter("price");
		double priceD = Double.parseDouble(price);
		
		Product pro = new Product();
		
		pro.setName(name);
		pro.setDescription(desc);
		pro.setPrice(priceD);
		
		int num =ProductDao.save(pro);
		if (num > 0) {
			//printWriter.println("<h2> Saved Successfully! </h2>");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
		else {
			printWriter.println("<h2> Sorry not saved :( </h2>");
}

	}

}
