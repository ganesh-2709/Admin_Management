package com.admin.EmployeeDto;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

public class EmployeeDto {
	
		
	private int empId;
	private String firstName;
	private String lastName;
	private String jobRole;
	private String email;
	private long phoneNumber;
	private Date dob;
	private String gender;
	private double salary;
	private String address;
		
		
		public EmployeeDto() {
			super();
			// TODO Auto-generated constructor stub
		}


		public EmployeeDto(int empId, String firstName, String lastName, String jobRole, String email, long phoneNumber,
				Date dob, String gender, double salary, String address) {
			super();
			this.empId = empId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.jobRole = jobRole;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.dob = dob;
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


		public Date getDob() {
			return dob;
		}


		public void setDob(Date dob) {
			this.dob = dob;
		}


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


