package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.AlumniBean;
import dao.SqlConnect;

public class AlumniRegDao {

	public static boolean alumniRegistration(AlumniBean user) {
		boolean status = false;
		int value = 0;
		
		// ID is in capital letters
		String createTable = "CREATE TABLE IF NOT EXISTS `alumni` (" + "`ID` INT NOT NULL AUTO_INCREMENT,"
				+ "`name` VARCHAR(50) NULL," + "`gender` VARCHAR(7) NULL," + "`dob` DATE NULL," + "`batch` INT NULL,"
				+ "`email` VARCHAR(50) NULL," + "`contact` VARCHAR(15) NULL," + "`branch` VARCHAR(50) NULL,"
				+ "`occupation` VARCHAR(50) NULL," + "`location` VARCHAR(50) NULL," + "PRIMARY KEY (`ID`));";

		String query = "insert into alumni(name, gender, dob, batch, email, contact, branch, occupation, location) values (?,?,?,?,?,?,?,?,?)";
		try {
			Connection con = SqlConnect.getConnection();
			java.sql.Statement table = con.createStatement();
			table.execute(createTable);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, user.getName());
			ps.setString(2, user.getGender());
			ps.setDate(3, user.getDob()); // Date is already converted into sql format in  the bean class
			ps.setString(4, user.getBatch());
			ps.setString(5, user.getEmail());
			ps.setString(6, user.getContact());
			ps.setString(7, user.getBranch());
			ps.setString(8, user.getOccupation());
			ps.setString(9, user.getLocation());
			value = ps.executeUpdate();
			System.out.println(value);
			if (value == 1) {
				status = true;
			} else {
				status = false;
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("Error while inserting the alumni data" + e);
		}
		return status;

	}

}
