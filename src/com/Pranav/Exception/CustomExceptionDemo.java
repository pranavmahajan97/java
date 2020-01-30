package com.Pranav.Exception;

import java.util.Scanner;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			createGroup(sc);
		} catch (Exception e) {
			System.out.println("Issue creating group " + e.getMessage());
		}
	}

	private static void createGroup(Scanner sc) throws Exception {
		System.out.println("Please specify the group count");
		int groupCount = Integer.parseInt(sc.nextLine());
		if 	(groupCount>7)
		{
			throw new Exception("exceeds..");
		}
		else
		{
			System.out.println("Group created with " + groupCount + " people");
		}
		
	}
}
//class ExcException extends Exception
//{
//	String emsg;
//	
//	public ExcException(String emsg) {
//		super();
//		this.emsg = emsg;
//		System.out.println(emsg);
//	}
//
//	@Override
//public String getMessage() {
//	return super.getMessage();
//}
//	}