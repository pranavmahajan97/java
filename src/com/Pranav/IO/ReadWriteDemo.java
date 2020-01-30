package com.Pranav.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteDemo {

	public static void main(String[] args) throws IOException {
		File infofile = new File("C:\\Pranav Workspace\\Explore Java\\src\\com\\Pranav\\IO\\WriteDemo2.txt");
		FileWriter file = new FileWriter(infofile);
		file.write("Files in java can be tricky");
		file.close();
		System.out.println("Successfully written to the file");
		FileReader reade = new FileReader("C:\\Pranav Workspace\\Explore Java\\src\\com\\Pranav\\IO\\WriteDemo2.txt");
		int i;
		while((i=(reade).read())!=-1)
			
		{
			System.out.print((char)i);
			
		}
		//character wise
		System.out.println();
		reade.close();
		BufferedReader bf = new BufferedReader(new FileReader(infofile));
		String data;
		while ((data=bf.readLine())!=null)
		{
			System.out.println(data);
		}
		
		bf.close();
		//using buffered reader
		Scanner dataScanner = new Scanner(infofile);
		//String retrievedData;
		while(dataScanner.hasNextLine())
		{
			System.out.println(dataScanner.nextLine());
		}
		dataScanner.close();
		// using Scanner class
	}

}

