package com.vti.entity;

public class Manager extends User {

	private int expInYear;

	public Manager(int userID, String fullName, String email, String password, int expInYear) {
		super(userID, fullName, email, password);
		this.expInYear = expInYear;
	}

	public Manager(int userID, String fullName, String email, String password) {
		super(userID, fullName, email, password);
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}
	
}