package com.wipro.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int id;
	
	 @Column(name="first_Name")
	private String firstName;
	private String department;
	private String workLocation;
	
	

	public Employee() {
		super();
	}

	public Employee(int id, String firstName, String department, String workLocation) {
		this.id = id;
		this.firstName = firstName;
		this.department = department;
		this.workLocation = workLocation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}
}
