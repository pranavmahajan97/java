package com.Pranav.Miscellaneous;

public class EmployeeDemo {
	public static void main(String[] args) {
		System.out.println("Employee Application");
		
		Employee x=new Employee();
		x.setEmpName("Pranav Mahajan");
		x.setEmid(1423);
		x.setEmpDept("Engg");
		x.setProjectName("Sales micro service");
		
		
		
		
		EmployeeOper crud=new EmployeeOper();
		int empID = crud.createEmp(x);
		x.setEmid(empID);
		System.out.println("Generate emp ID " + empID);
		System.out.println(x.toString());
	}
}
