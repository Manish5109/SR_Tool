package com.study.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_profile")
public class EmployeeProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_id")
	Long empId;
	
	@Column(name="emp_name")
	String empName;
	
	@Column(name="emp_email")
	String empMail;
	
	@Column(name="emp_mobile")
	long empMobile;
	
	@Column(name="emp_city")
	String empCity;
	
	@Column(name="emp_address")
	String empAddress;
	
	@Column(name="emp_dob")
	Date empDob;
	
	@Column(name="emp_doj")
	Date empDoj;
	
	@Column(name="emp_probation")
	String empProbation;
	
	@Column(name="emp_career_level")
	int empCareerLevel;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpMail() {
		return empMail;
	}

	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}

	public long getEmpMobile() {
		return empMobile;
	}

	public void setEmpMobile(long empMobile) {
		this.empMobile = empMobile;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public Date getEmpDob() {
		return empDob;
	}

	public void setEmpDob(Date empDob) {
		this.empDob = empDob;
	}

	public Date getEmpDoj() {
		return empDoj;
	}

	public void setEmpDoj(Date empDoj) {
		this.empDoj = empDoj;
	}

	public String getEmpProbation() {
		return empProbation;
	}

	public void setEmpProbation(String empProbation) {
		this.empProbation = empProbation;
	}

	public int getEmpCareerLevel() {
		return empCareerLevel;
	}

	public void setEmpCareerLevel(int empCareerLevel) {
		this.empCareerLevel = empCareerLevel;
	}
	
}
