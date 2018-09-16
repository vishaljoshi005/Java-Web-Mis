package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.StudentBean;

public class StudentRegDao {
	public static boolean studentRegistration(StudentBean user) {
		boolean status = false;
		int value = 0;

		// ID is in capital letters
		String createTable = "CREATE TABLE IF NOT EXISTS `student` (" + "`id` INT NOT NULL AUTO_INCREMENT,"
				+ "`firstname` VARCHAR(45) NULL," + "`lastname` VARCHAR(45) NULL," + "`gender` VARCHAR(45) NULL,"
				+ "`fathername` VARCHAR(45) NULL," + "`mothername` VARCHAR(45) NULL," + "`dob` DATE NULL,"
				+ "`admissionyear` VARCHAR(45) NULL," + "`email` VARCHAR(45) NULL," + "`contact` VARCHAR(45) NULL,"
				+ "`address` VARCHAR(100) NULL," + "PRIMARY KEY (`id`));";

		String query = "insert into student(firstname,lastname, gender,fathername,mothername, dob, admissionyear, email, contact, address) values (?,?,?,?,?,?,?,?,?,?)";
		try {
			Connection con = SqlConnect.getConnection();
			java.sql.Statement table = con.createStatement();
			table.execute(createTable);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setString(3, user.getGender());
			ps.setString(4, user.getFatherName()); // Date is already converted into sql format in the bean class
			ps.setString(5, user.getMotherName());
			ps.setDate(6, user.getDob());
			ps.setString(7, user.getAdmissionYear());
			ps.setString(8, user.getEmail());
			ps.setString(9, user.getContact());
			ps.setString(10, user.getAddress());
			value = ps.executeUpdate();
			System.out.println(value);
			if (value == 1) {
				status = true;
			} else {
				status = false;
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("Error while inserting the Student data" + e);
		}
		return status;

	}

}
