package com.techlab.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private int empid;
	private String ename;
	private String designation;
	private int managerid;
	private Date dateOfJoining;
	private double salary;
	private double commission;
	private int deptno;
	private SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");

	public Employee(int empid, String ename, String role, int managerid, String dob, double salary, double comm,
			int deptno) throws ParseException {
		this.empid = empid;
		this.ename = ename;
		this.designation = role;
		this.managerid = managerid;
		this.dateOfJoining = formatter.parse(dob);
		this.salary = salary;
		this.commission = comm;
		this.deptno = deptno;
	}

	public int getEmpId() {
		return empid;
	}

	public String getEname() {
		return ename;
	}

	public String getDesignation() {
		return designation;

	}

	public int getManagerId() {
		return managerid;
	}

	public Date getDob() {
		return dateOfJoining;

	}

	public double getSalary() {
		return salary;
	}

	public double getComm() {
		return commission;
	}

	public int getDeptNo() {
		return deptno;
	}

}
