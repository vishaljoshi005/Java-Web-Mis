package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.StudentBean;

public class ViewStudentDao {
	
	public static int getRows() {
		int rows=0;
		String query = "SELECT COUNT(*) FROM student ";
		try {
			Connection con = SqlConnect.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				rows=rs.getInt(1);
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("Error while fetching the student data" + e);
		}
		
		return rows;
	}
	
	
	public static List<StudentBean> getStudent(int start) {
		System.out.println("From Dao"+start);
		List<StudentBean> studentRecords = new ArrayList<>();
		String query = "SELECT * FROM student LIMIT "+(start)+","+12;
		System.out.println("From Dao"+start);
		try {
			Connection con = SqlConnect.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet result = ps.executeQuery();
			while(result.next()) {
				
				StudentBean a = new StudentBean();
				a.setId(result.getInt(1));
				a.setFirstName(result.getString(2));
				a.setLastName(result.getString(3));
				a.setGender(result.getString(4));
				a.setFatherName(result.getString(5));
				a.setMotherName(result.getString(6));
				a.setDob(result.getDate(7));				
				a.setAdmissionYear(result.getString(8));
				a.setEmail(result.getString(9));
				a.setContact(result.getString(10));
				a.setAddress(result.getString(11));
				
				studentRecords.add(a);
			}

			con.close();
		} catch (SQLException e) {
			System.out.println("Error while fetching the student data" + e);
		}
		return studentRecords;

	}
	
	public static boolean deleteStudent(int id) {
		boolean studentStatus= false;
		int value=0;
		String query = "DELETE FROM student	WHERE id="+id;
		try {
			Connection con = SqlConnect.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			value= ps.executeUpdate();
			System.out.println(value);
			if(value>0) {
				studentStatus =true;
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("Error while deleting the student data" + e);
		}
		return studentStatus;
		
	}

}
