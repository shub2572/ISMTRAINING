package amazon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import amazon.Bean.CartProductBean;
import amazon.util.DbConnection;

public class OrderDao {

	public void placeOrder(int userId) {
		CartDao cartDao = new CartDao();
		ArrayList<CartProductBean> carts = cartDao.getCartItems(userId);

		int total = 0;
		for (CartProductBean cartProductBean : carts) {
			total = total + cartProductBean.getPrice();
		}
		
		
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into orders (userid,amount,orderstatus,paymentmode,paymentstatus) values (?,?,?,?,?) \",\r\n"
					+ "					Statement.RETURN_GENERATED_KEYS");
			pstmt.setInt(1, userId);
			pstmt.setInt(2, total);
			pstmt.setString(3, "placed");
			pstmt.setString(4, "COD");
			pstmt.setString(5, "pending");
		
			  pstmt.executeUpdate();

		  ResultSet rs = pstmt.getGeneratedKeys();
		  rs.next();
			int orderId = rs.getInt("orderid");
			System.out.println("orderid ==> " + orderId);   
		  
		}
		catch(Exception e) {
			
			System.out.println("SMW in OrderDao :: in placeOrder");
			e.printStackTrace();
		}
		
	}
	
	

}
