package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	public static boolean validate (String name, String password) {
		boolean status=false;
		try {
			Connection con= SqlConnect.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from users where username=? and password=?");
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			status= rs.next();
			con.close();
		} catch(SQLException e) {
			System.out.println("Error while checking the username and password"+e);
		}
		return status;
	}

}
