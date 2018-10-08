package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;

import bean.BillBean;
import bean.FacultyBean;



public class GenerateBillDao {
	
	public static String getMonthForInt(int num) {
		
        String month = "wrong";
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        if (num >= 0 && num <= 11 ) {
            month = months[num];
        }
        return month;
    }
	
	
	public static FacultyBean getFacultyDetails(int id) {
		String query = "SELECT * FROM `faculty` WHERE id= "+id+";" ;
		FacultyBean facultyDetail = new FacultyBean();
		try {
			Connection con = SqlConnect.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			
			ResultSet result = ps.executeQuery();
			
			while(result.next()) {
				
				facultyDetail.setId(result.getInt(1));
				facultyDetail.setTitle(result.getString(2));
				facultyDetail.setFacultyName(result.getString(3));
				
				facultyDetail.setEmployeeCode(result.getString(4));
				facultyDetail.setSubject(result.getString(5));
				facultyDetail.setOfficialAddress(result.getString(6));
				
				facultyDetail.setHomeAddress(result.getString(7));
				facultyDetail.setPhone(result.getString(8));
				facultyDetail.setPancard(result.getString(9));
				
				facultyDetail.setMobile(result.getString(10));
				facultyDetail.setBankName(result.getString(11));
				facultyDetail.setBranchName(result.getString(12));
				
				facultyDetail.setIfsc(result.getString(13));
				facultyDetail.setAccount(result.getLong(14));
				facultyDetail.setDesignation(result.getString(15));
				
				facultyDetail.setFacultyType(result.getString(16));
				
			}
			con.close();
		} catch (SQLException e) {
			System.out.println("Error while fetching faculty data" + e);
		}
		
		return facultyDetail;		
	}
		
	
	public static List<BillBean> getBill(int id, int month, int year) {
		
		List<BillBean> billRecords = new ArrayList<>();
		String query = "SELECT * FROM `bill` WHERE `faculty_code`= "+id+ " AND ( MONTH(`date`)="+month+" AND YEAR(`date`)="+year+" );";
		try {
			Connection con = SqlConnect.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet result = ps.executeQuery();
			while(result.next()) {
				
				BillBean bill = new BillBean();
				
				bill.setDate(result.getDate(4));
				bill.setDay(result.getString(5));
				bill.setSheetNumber(result.getString(6));
				
				bill.setSemester(result.getString(7));
				bill.setPaperNumber(result.getString(8));
				bill.setType(result.getString(9));
				
				bill.setBatch(result.getString(10));
				bill.setTime(result.getString(11));
				bill.setHours(result.getString(12));
				
				bill.setRate(Integer.parseInt(result.getString(13)));
				
				billRecords.add(bill);
			}

			con.close();
		} catch (SQLException e) {
			System.out.println("Error while fetching the bill data" + e);
		}
		return billRecords;

	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
