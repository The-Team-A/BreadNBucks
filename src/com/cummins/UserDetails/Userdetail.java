package com.cummins.UserDetails;



public class Userdetail {
	String first_name;
	String last_name;
	long phn_no;
	String email_id,password;

	public String getUserName() {
		return email_id;
	}

	public void setUserName(String userName) {
		this.email_id = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public void setPhn_no(long phn_no) {
		this.phn_no = phn_no;
	}


	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public long getPhn_no() {
		return phn_no;
	}

}
