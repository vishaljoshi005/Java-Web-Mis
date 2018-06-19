package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnect {
	public static Connection getConnection() {
		Connection con =null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con =DriverManager.getConnection("jdbc:mysql://localhost:3306/informationmanagement","root","root");
		
		}catch (SQLException e) {
            System.out.println("Failed to create the database connection."); 
        }
     catch (ClassNotFoundException ex) {
        // log an exception. for example:
        System.out.println("Driver not found."); 
    }
    return con;
	}

}
