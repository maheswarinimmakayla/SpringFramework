package com.mouritech.springframework.firstapp;

import org.springframework.stereotype.Service;

@Service("empService") 
public class Employee {
 private int empId;
 private String empName;
 private String empEmailId;
 private int empPhoneNo;
 public Employee() {
		// TODO Auto-generated constructor stub
	}
 
public Employee(int empId, String empName, String empEmailId, int empPhoneNo) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empEmailId = empEmailId;
	this.empPhoneNo = empPhoneNo;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public String getEmpEmailId() {
	return empEmailId;
}

public void setEmpEmailId(String empEmailId) {
	this.empEmailId = empEmailId;
}

public int getEmpPhoneNo() {
	return empPhoneNo;
}

public void setEmpPhoneNo(int empPhoneNo) {
	this.empPhoneNo = empPhoneNo;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empEmailId=" + empEmailId + ", empPhoneNo="
			+ empPhoneNo + "]";
}

}
