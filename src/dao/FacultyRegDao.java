package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.FacultyBean;

public class FacultyRegDao {
	

	public static boolean facultyRegistration(FacultyBean user) {
		boolean status = false;
		int value = 0;
		
		String createTable = "CREATE TABLE IF NOT EXISTS `faculty`(" + 
				"  `id` INT NOT NULL AUTO_INCREMENT," + 
				"  `title` VARCHAR(10) NULL," + 
				"  `name` VARCHAR(45) NULL," + 
				"  `employee_code` VARCHAR(15) NULL," + 
				"  `subject` VARCHAR(15) NULL," + 
				"  `official_address` VARCHAR(150) NULL," + 
				"  `home_address` VARCHAR(150) NULL," + 
				"  `phone` VARCHAR(45) NULL," + 
				"  `pancard` VARCHAR(45) NULL," + 
				"  `mobile` VARCHAR(45) NULL," + 
				"  `bank` VARCHAR(70) NULL," + 
				"  `branch` VARCHAR(50) NULL," + 
				"  `ifsc` VARCHAR(45) NULL," + 
				"  `account_no` BIGINT(19) NULL," + 
				"  `designation` VARCHAR(40) NULL," + 
				"  `type` VARCHAR(45) NULL," + 
				"  PRIMARY KEY (`id`));" ;

		String query = "insert into faculty(title,name,employee_code, subject, official_address, home_address, phone, pancard, mobile,"
				+ "bank , branch, ifsc, account_no, designation, type) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			Connection con = SqlConnect.getConnection();
			java.sql.Statement table = con.createStatement();
			table.execute(createTable);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, user.getTitle());
			ps.setString(2, user.getFacultyName());
			ps.setString(3, user.getEmployeeCode()); 
			ps.setString(4, user.getSubject());
			ps.setString(5, user.getOfficialAddress());
			ps.setString(6, user.getHomeAddress());
			ps.setString(7, user.getPhone());
			ps.setString(8, user.getPancard());
			ps.setString(9, user.getMobile());
			ps.setString(10, user.getBankName());
			ps.setString(11, user.getBranchName());
			ps.setString(12, user.getIfsc());
			ps.setLong(13, user.getAccount());
			ps.setString(14, user.getDesignation());
			ps.setString(15, user.getFacultyType());
			value = ps.executeUpdate();
			System.out.println(value);
			if (value == 1) {
				status = true;
			} else {
				status = false;
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("Error while inserting the faculty data" + e);
		}
		return status;

	}

}
