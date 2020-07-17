package com.techlab.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {
	private int empid;
	private String ename;
	private String job;
	private int mg_id;
	private Date doj;
	private int salary;
	private int commision;
	private int deptno;
	private List<Employee> reporttes = new ArrayList<Employee>();
	
//	public Employee(int empid, String ename, String job, int mg_id, Date doj, int salary, int commision, int deptno) {
	public Employee(int empid, String ename, String job, int mg_id, int salary, int commision, int deptno) {
		this.empid = empid;
		this.ename = ename;
		this.job = job;
		this.mg_id = mg_id;
		this.salary = salary;
		this.commision = commision;
		this.deptno = deptno;
	}
	
	public void addReporttee(Employee rep) {
		reporttes.add(rep);
	}
	
	public String show(int level) {
		String root = this.toString()+"\n";
		for(Employee emp : reporttes) {
			root += addSpace(level+1)+emp.show(level+1);
		}
		
		return root;
	}
	
	
	
	private String addSpace(int level) {
		String spaces ="";
		for(int i=0; i<level; i++) {
			spaces += "\t";
		}
		return spaces;
	}

	@Override
	public String toString() {
		return getEname() +"("+ getJob() +")";
	}

	public int getEmpid() {
		return empid;
	}

	public String getEname() {
		return ename;
	}

	public String getJob() {
		return job;
	}

	public int getMg_id() {
		return mg_id;
	}

	public Date getDoj() {
		return doj;
	}

	public int getSalary() {
		return salary;
	}

	public int getCommision() {
		return commision;
	}

	public int getDeptno() {
		return deptno;
	}

	public List<Employee> getReporttes() {
		return reporttes;
	}

}
