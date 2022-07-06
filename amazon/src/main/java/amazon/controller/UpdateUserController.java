package amazon.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import amazon.Bean.UserBean;
import amazon.dao.UserDao;
@WebServlet
public class UpdateUserController extends HttpServlet{

	 @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          
		 int UserID = Integer.parseInt(request.getParameter("UserId"));
		 UserDao userDao =new UserDao();
		 UserBean user = userDao.getUserByUserID(UserID);
		 request.setAttribute("user", user);
		 request.getRequestDispatcher("UpdateUser.jsp");
		 
		 
		 
	}
}
