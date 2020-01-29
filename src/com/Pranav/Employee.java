package com.Pranav;

public class Employee {

	int emid;
	String empName;
	String empDept;
	String projectName;

	@Override
	public String toString() {
		return "Employee [emid=" + emid + ", empName=" + empName + ", empDept=" + empDept + ", projectName="
				+ projectName + "]";
	}

	public int getEmid() {
		return emid;
	}

	public void setEmid(int emid) {
		this.emid = emid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
