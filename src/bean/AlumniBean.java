package bean;

import java.sql.Date;  


public class AlumniBean implements java.io.Serializable {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AlumniBean(){
		
	}
	
	private String name;
	private String gender;
	private String dob;
	private String batch;
	private String email;
	private String contact;
	private String branch;
	private String occupation;
	private String location;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Date getDob() {
		return Date.valueOf(dob);
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getBatch() {
		return batch;
	}
	
	public void setBatch(String batch) {
		this.batch = batch;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getContact() {
		return contact;
	}
	
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public String getBranch() {
		return branch;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public String getOccupation() {
		return occupation;
	}
	
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public String getLocation() {
		return location;
	}
	

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
