package com.vti.entity;

public class Employee extends User {
	private int projectId;
	private int  proSkill;
	public Employee(int userID, String fullName, String email, String password, int projectId, int proSkill) {
		super(userID, fullName, email, password);
		this.projectId = projectId;
		this.proSkill = proSkill;
	}
	public Employee() {
		super();
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getProSkill() {
		return proSkill;
	}
	public void setProSkill(int proSkill) {
		this.proSkill = proSkill;
	}
	

	 
}
