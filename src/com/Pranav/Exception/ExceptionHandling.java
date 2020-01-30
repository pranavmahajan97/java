package com.Pranav.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {
	public static void main(String[] args)  {
		
		try 
		{	
			File dataFile = new File("C:\\Pranav Workspace\\Explore Java\\newfile.txt");
			FileReader f1 = new FileReader(dataFile);
			System.out.println("File Read");
		} catch (FileNotFoundException e) 
		{
			System.out.println("Please enter correct path");
			//e.printStackTrace();
		}
		}

}
