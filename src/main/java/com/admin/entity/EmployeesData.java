package com.admin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Employees_Data")
public class EmployeesData {
	@Id
	private int empId;
	private String firstName;
	private String lastName;
	private String jobRole;
	private String email;
	private long phoneNumber;
	//private Date doj;
	private String gender;
	private double salary;
	private String address;
	
	public EmployeesData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeesData(int empId, String firstName, String lastName, String jobRole, String email, long phoneNumber,
			String gender, double salary, String address) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobRole = jobRole;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.salary = salary;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/*
	 * public Date getDoj() { return doj; }
	 * 
	 * public void setDoj(Date doj) { this.doj = doj; }
	 */

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}