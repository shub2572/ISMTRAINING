 
package amazon.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import amazon.dao.OrderDao;


public class CheckoutController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

	  HttpSession session = request.getSession();
	  int userId = (Integer) session.getAttribute("userId");

	  
	   OrderDao orderDao = new OrderDao();
	   orderDao.placeOrder(userId);
			   
	}

}
