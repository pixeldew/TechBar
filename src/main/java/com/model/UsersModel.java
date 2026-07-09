package com.model;

public class UsersModel {
	private Integer id;
	private String userName;
	private String phone;
	private String problemDescription;
	private String status;
	
	 public UsersModel() {
	    }
	
	public UsersModel(Integer id, String userName, String phone, String problemDescription, String status) {
		this.id=id;
		this.userName= userName;
		this.phone= phone;
		this.problemDescription= problemDescription;
		this.status= status;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getProblemDescription() {
		return problemDescription;
	}
	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
