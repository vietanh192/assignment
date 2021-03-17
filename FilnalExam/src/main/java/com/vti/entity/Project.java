package com.vti.entity;

public class Project {
private int projecId;
private int teamSize;
private Manager manegerId;
private Employee employeesId;
public Project(int projecId, int teamSize, Manager manegerId, Employee employeesId) {
	super();
	this.projecId = projecId;
	this.teamSize = teamSize;
	this.manegerId = manegerId;
	this.employeesId = employeesId;
}
public Project() {
	super();
}
public int getProjecId() {
	return projecId;
}
public void setProjecId(int projecId) {
	this.projecId = projecId;
}
public int getTeamSize() {
	return teamSize;
}
public void setTeamSize(int teamSize) {
	this.teamSize = teamSize;
}
public Manager getManegerId() {
	return manegerId;
}
public void setManegerId(Manager manegerId) {
	this.manegerId = manegerId;
}
public Employee getEmployeesId() {
	return employeesId;
}
public void setEmployeesId(Employee employeesId) {
	this.employeesId = employeesId;
}

}
