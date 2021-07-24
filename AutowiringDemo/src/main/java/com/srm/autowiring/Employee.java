package com.srm.autowiring;

public class Employee {
	private int Empid;
	private String Empname;
	private Designation designation;

	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Empname=" + Empname + "]";
	}

	public Employee() {
		super();
	}

	public int getEmpid() {
		return Empid;
	}

	public void setEmpid(int empid) {
		Empid = empid;
	}

	public String getEmpname() {
		return Empname;
	}

	public void setEmpname(String empname) {
		Empname = empname;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

}
