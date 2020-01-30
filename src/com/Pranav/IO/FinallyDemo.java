package com.Pranav.IO;

import java.io.FileNotFoundException;

public class FinallyDemo {

	public static void main(String[] args) {
		try {
			getDetails(990);
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open file : " + e.getMessage());
		} 
		finally {
			System.out.println("Finally Block");
		}

	}

	private static void getDetails(int value) throws FileNotFoundException {
		System.out.println("FinallyDemo.getDetails()");
		if (value>100)
		{
			throw new FileNotFoundException("checking");
		}
	}

}
