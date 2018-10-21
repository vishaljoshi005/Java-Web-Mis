package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.StudentFeeBean;

public class AddFeeDao {
	
	
	public static boolean addFee(StudentFeeBean fee) {
		boolean status = false;
		int value = 0;
		
		// ID is in capital letters
		String createTable = "CREATE TABLE IF NOT EXISTS `studentfee` (" + "`ID` INT NOT NULL AUTO_INCREMENT,"
				+ "`name` VARCHAR(50) NULL," + "`father's name` VARCHAR(50) NULL," + "`enrollment` VARCHAR(25) NULL," + "`semester` INT NULL,"  +
				"`date` DATE NULL," + "`amount` INT NULL," + "`DD number/check number` VARCHAR(25) NULL," 
				 + "PRIMARY KEY (`ID`));";

		String query = "insert into studentfee(name, `father's name`, enrollment, semester, date, amount, `DD number/check number`) values (?,?,?,?,?,?,?)";
		try {
			Connection con = SqlConnect.getConnection();
			java.sql.Statement table = con.createStatement();
			table.execute(createTable);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, fee.getName());
			ps.setString(2, fee.getFatherName());
			ps.setString(3, fee.getEnrollNumber()); 
			
			ps.setInt(4, fee.getSemester());
			ps.setDate(5, fee.getDate());
			ps.setInt(6, fee.getAmount());
			
			ps.setString(7, fee.getDdNumber());

			value = ps.executeUpdate();
			System.out.println(value);
			if (value == 1) {
				status = true;
			} else {
				status = false;
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("Error while inserting the fee data" + e);
		}
		return status;

	}
	
	public static List<StudentFeeBean> getFee(int semester) {
		
		List<StudentFeeBean> feeRecords = new ArrayList<StudentFeeBean>();
		String query = "SELECT * FROM studentfee where semester="+semester+" ;";
		
		try {
			Connection con = SqlConnect.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet result = ps.executeQuery();
			while(result.next()) {
				
				StudentFeeBean a = new StudentFeeBean();
				a.setId(result.getString(1));
				a.setName(result.getString(2));
				a.setFatherName(result.getString(3));
				a.setEnrollNumber(result.getString(4));
				a.setSemester(Integer.parseInt(result.getString(5)));
				a.setDate(result.getDate(6));
				
				a.setAmount(Integer.parseInt(result.getString(7)));
				a.setDdNumber(result.getString(8));
				feeRecords.add(a);
			}

			con.close();
		} catch (SQLException e) {
			System.out.println("Error while fetching the alumni data" + e);
		}
		return feeRecords;

	}
}
