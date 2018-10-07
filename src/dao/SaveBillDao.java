package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.BillBean;

public class SaveBillDao {
	
	public static String getName(int id) {
		
		String name="";
		String query = "SELECT name FROM faculty WHERE id="+id+";";
		try {
			Connection con = SqlConnect.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				name=rs.getString(1);
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("Error while fetching the faculty name" + e);
		}
		
		return name;
	}
	
	


	public static boolean saveBill(BillBean bill) {
		boolean status = false;
		int value = 0;
		
		// ID is in capital letters
		String createTable = "CREATE TABLE IF NOT EXISTS `bill` (" + 
				"  `id` INT NOT NULL AUTO_INCREMENT," + 
				"  `faculty_code` INT NULL," + 
				"  `name` VARCHAR(65) NULL," + 
				"  `date` DATE NULL," + 
				"  `day` VARCHAR(12) NULL," + 
				"  `sheet_no` VARCHAR(45) NULL," + 
				"  `semester` VARCHAR(10) NULL," + 
				"  `paper_no` VARCHAR(15) NULL," + 
				"  `type` VARCHAR(15) NULL," + 
				"  `batch` VARCHAR(15) NULL," + 
				"  `time` VARCHAR(10) NULL," + 
				"  `hours` VARCHAR(10) NULL," + 
				"  `rate` INT NULL," + 
				"  `billcol` VARCHAR(45) NULL," + 
				"  PRIMARY KEY (`id`));" ;

		String query = "insert into bill(faculty_code, name, date, day, sheet_no, semester, paper_no, type, batch, time, hours, rate) values (?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			Connection con = SqlConnect.getConnection();
			java.sql.Statement table = con.createStatement();
			table.execute(createTable);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, bill.getFacultyCode());
			ps.setString(2, bill.getName());
			ps.setDate(3, bill.getDate()); // Date is already converted into sql format in  the bean class
			ps.setString(4, bill.getDay());
			ps.setString(5, bill.getSheetNumber());
			ps.setString(6, bill.getSemester());
			ps.setString(7, bill.getPaperNumber());
			ps.setString(8, bill.getType());
			ps.setString(9, bill.getBatch());
			ps.setString(10, bill.getTime());
			ps.setString(11, bill.getHours());
			ps.setInt(12, bill.getRate());
			value = ps.executeUpdate();
			System.out.println(value);
			if (value == 1) {
				status = true;
			} else {
				status = false;
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("Error while inserting the bill data" + e);
		}
		return status;

	}
}
