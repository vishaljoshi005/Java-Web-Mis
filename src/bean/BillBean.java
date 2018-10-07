package bean;

import java.sql.Date;

public class BillBean implements java.io.Serializable{

	
private static final long serialVersionUID = 1L;
	
	public BillBean(){
		
	}
	private int id;
	private int facultyCode;
	private String name;	
	private Date date;
	private String day;
	private String sheetNumber;
	private String semester;
	private String paperNumber;
	private String type;
	private String batch;
	private String time;
	private String hours;
	private int rate;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFacultyCode() {
		return facultyCode;
	}
	public void setFacultyCode(int facultyCode) {
		this.facultyCode = facultyCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getSheetNumber() {
		return sheetNumber;
	}
	public void setSheetNumber(String sheetNumber) {
		this.sheetNumber = sheetNumber;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getPaperNumber() {
		return paperNumber;
	}
	public void setPaperNumber(String paperNumber) {
		this.paperNumber = paperNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
}
