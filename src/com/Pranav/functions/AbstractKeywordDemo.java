package com.Pranav.functions;

public abstract class AbstractKeywordDemo {
	String getCompanyName()
	{
		return "IBM Corporation";
	}
	 String getProject()
	 {
		 return "";
	 }
	 public static void main(String[] args) {
		Details d = new Details();
		d.getPersonalDetails();
	}
}
// you can have abstract class with all implemented emthods
// you cant create object of abstract class as it may have abstract methods
class Details{
	void getPersonalDetails(){
	 System.out.println("Details.getPersonalDetails()");	
	}
}