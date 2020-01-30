package com.Pranav.IO;
import java.io.*;
public class TryWithDemo {
 public static void main(String[] args) {
	File dataFile = new File("C:\\Pranav Workspace\\Explore Java\\src\\com\\Pranav\\IO\\TryWithDemo.java");
	try (BufferedReader bReader = new BufferedReader(new FileReader(dataFile));)
	{
		String data;
		while((data=bReader.readLine())!=null)
		{
			System.out.println(data);
		}
	}
	catch(IOException e)
	{
		System.out.println(e.getMessage());
	}
			
}
}
