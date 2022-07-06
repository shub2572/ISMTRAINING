package amazon.mssql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
		  // Create a variable for the connection string. 
    	String connectionUrl =
		  "jdbc:sqlserver://localhost:1433;databaseName=amazon;user=sa;password=root;encrypt=true;trustServerCertificate=true";
    	
		  
		  try { Connection con = DriverManager.getConnection(connectionUrl);
				  Statement stmt = con.createStatement(); 
		  
		  System.out.println("MSSQL Db Connected.....");
		  
		  }  
		  
		  // Handle any errors that may have occurred. 
		  catch (SQLException e) {
		  e.printStackTrace(); }
		 
		
    }
}