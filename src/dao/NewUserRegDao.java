package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class NewUserRegDao {
	
	public static boolean registration(String un, String pw) {
		boolean status=false;
		int value=0;
		try {
			Connection con= SqlConnect.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into users(username, password) values (?,?)");
			ps.setString(1, un);
			ps.setString(2, pw);
			value = ps.executeUpdate();
			System.out.println(value);
			if(value==1) {
				status= true;	
			}else {
			status= false;
			}
			con.close();
		} catch(SQLException e) {
			System.out.println("Error while inserting the username and password"+e);
		}
		return status;
		
	}
}
