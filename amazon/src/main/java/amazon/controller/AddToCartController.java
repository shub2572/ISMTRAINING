package amazon.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import amazon.Bean.CartBean;
import amazon.dao.CartDao;
@WebServlet("/AddToCartController")
public class AddToCartController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
int productId = Integer.parseInt(request.getParameter("productId"));
		
		HttpSession session = request.getSession(); 
		int userId = (Integer)session.getAttribute("userId");

		
		CartBean cart = new CartBean();
		cart.setProductId(productId);
		cart.setUserId(userId);
		
		CartDao cartDao = new CartDao();
		cartDao.addToCart(cart);
		
		response.sendRedirect("ListProductController");
	}
	
}