package com.emp.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empd;
	private String employeeName;
	private double age;
	private String designation;
	private String role;
	public int getEmpd() {
		return empd;
	}
	public void setEmpd(int empd) {
		this.empd = empd;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [empd=" + empd + ", employeeName=" + employeeName + ", age=" + age + ", designation="
				+ designation + ", role=" + role + "]";
	}
	
	
	
	
	
	
	
}
