package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.AlumniBean;

public class ViewAlumniDao {
	
	public static int getRows() {
		int rows=0;
		String query = "SELECT COUNT(*) FROM alumni ";
		try {
			Connection con = SqlConnect.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				rows=rs.getInt(1);
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("Error while fetching the alumni data" + e);
		}
		
		return rows;
	}
	
	
	public static List<AlumniBean> getAlumni(int start) {
		System.out.println("From Dao"+start);
		List<AlumniBean> alumniRecords = new ArrayList<>();
		String query = "SELECT * FROM alumni LIMIT "+(start)+","+12;
		System.out.println("From Dao"+start);
		try {
			Connection con = SqlConnect.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet result = ps.executeQuery();
			while(result.next()) {
				
				AlumniBean a = new AlumniBean();
				a.setId(result.getInt(1));
				a.setName(result.getString(2));
				a.setGender(result.getString(3));
				a.setDob(result.getDate(4));
				a.setBatch(result.getString(5));
				a.setEmail(result.getString(6));
				a.setContact(result.getString(7));
				a.setBranch(result.getString(8));
				a.setOccupation(result.getString(9));
				a.setLocation(result.getString(10));
				
				alumniRecords.add(a);
			}

			con.close();
		} catch (SQLException e) {
			System.out.println("Error while fetching the alumni data" + e);
		}
		return alumniRecords;

	}
	
	public static boolean deleteAlumni(int id) {
		boolean alumniStatus= false;
		int value=0;
		String query = "DELETE FROM alumni	WHERE id="+id;
		try {
			Connection con = SqlConnect.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			value= ps.executeUpdate();
			System.out.println(value);
			if(value>0) {
				alumniStatus =true;
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("Error while deleting the alumni data" + e);
		}
		return alumniStatus;
		
	}

}
