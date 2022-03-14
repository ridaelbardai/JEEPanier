
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Cart;
import Model.Livre;

/**
 * Servlet implementation class ajouterArticle
 */
@WebServlet("/ajouterArticle")
public class ajouterArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ajouterArticle() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		List<Livre> liste = new ArrayList<Livre>();
		String livres[] = request.getParameterValues("Livre");
		if (livres != null) {
			for (int i = 0; i < livres.length; i++) {
				liste.add(new Livre(livres[i]));
			}
		}
		Cart c = new Cart();
		c.setListe(liste);
		request.setAttribute("cart",liste);
		request.getRequestDispatcher("Panier.jsp").forward(request, response);
		
	}

}
