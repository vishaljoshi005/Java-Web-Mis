package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class NewUserRegDao {
	
	public static boolean registration(String un, String pw) {
		boolean status=false;
		int value=0;
		String createTable = "CREATE TABLE IF NOT EXISTS `users` (" + 
				"  `id` INT NOT NULL AUTO_INCREMENT," + 
				"  `username` VARCHAR(45) NULL," + 
				"  `password` VARCHAR(45) NULL," + 
				"  UNIQUE INDEX `username_UNIQUE` (`username` ASC)," + 
				"  PRIMARY KEY (`id`));";
		String query = "insert into users(username, password) values (?,?)";
		try {
			Connection con= SqlConnect.getConnection();
			java.sql.Statement table =con.createStatement();
			table.execute(createTable);
			PreparedStatement ps = con.prepareStatement(query);
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
