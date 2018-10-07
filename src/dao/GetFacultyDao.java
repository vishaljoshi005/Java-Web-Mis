package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.FacultyBean;

public class GetFacultyDao {



	public static List<FacultyBean> getName() {
		List<FacultyBean> facultyRecords = new ArrayList<>();
		String query =  "SELECT `id`, `name` FROM `faculty`";
		try {
			Connection con = SqlConnect.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet result = ps.executeQuery();
			while(result.next()) {
				
				FacultyBean a = new FacultyBean();
				a.setId(result.getInt(1));
				a.setFacultyName(result.getString(2));
				facultyRecords.add(a);
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("Error while Fetching the faculty data" + e);
		}
		return facultyRecords;

	}

}
