package com.feedbackApplication.database;

public class User {
	
	private String userEmail;
	private String userPassword;
	private String userName;
	private String userDOB;
	private long userPhone;
	
	public User(){
		
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserDOB() {
		return userDOB;
	}

	public void setUserDOB(String userDOB) {
		this.userDOB = userDOB;
	}

	public long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}
	
	
	
	

}
