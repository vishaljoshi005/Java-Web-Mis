package bean;

import java.sql.Date;

public class StudentFeeBean implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	public StudentFeeBean(){
			
		}
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String name;
	private String fatherName;
	private String enrollNumber;
	private int semester;
	private Date date;
	private int amount;
	private String ddNumber;
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getEnrollNumber() {
		return enrollNumber;
	}
	public void setEnrollNumber(String enrollNumber) {
		this.enrollNumber = enrollNumber;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDdNumber() {
		return ddNumber;
	}
	public void setDdNumber(String ddNumber) {
		this.ddNumber = ddNumber;
	}
	
	
}
