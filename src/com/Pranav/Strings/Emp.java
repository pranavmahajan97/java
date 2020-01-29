package com.Pranav.Strings;
import java.util.*;
public class Emp {
	static int fillcount=0;
	public static void main(String[] args) {
		System.out.println("How many employees you want to have?");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int empid[] = new int[a+10];
		String name[] = new String[a+10];
		String department[] = new String[a+10];
		String project[] = new String[a+10];
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		for(int i=0;i<a;i++)
		{
			System.out.println("Enter the details of employee");
			System.out.println("Enter the ID of " + (i+1)+ " employee");
		empid[i] = sc.nextInt();
			System.out.println("Enter the name of " + (i+1)+ " employee");
			name[i] = sc2.nextLine();
			System.out.println("Enter the department of " + name[i]);
			department[i] = sc2.nextLine();
			System.out.println("Enter the project of " + name[i]);
			project[i] = sc3.nextLine();
			fillcount++;
		}
		while(true)
		{
			System.out.println("What do you want to do now?(C/R/U/D/Exit)");
		
		String s = sc.nextLine();
		String d = s.toLowerCase();
		switch(d)
		{
		case "r":
			{int id = 0;
			int count=0;
			System.out.println("Enter the employee id");
			int retrieve = sc3.nextInt();
			for(int i=0;i<empid.length;i++)
			{
				if (empid[i]==(retrieve))
				{
					id = i;
					count=1;
				}
			}
			if (count==1)
			{
				printdetails(id,empid,name,department,project);
			}
			else
			{
				System.out.println("Employee not found");
			}
			
			
			break;
		}
		case "u":
		{
			System.out.println("Enter employee ID of employee");
			int uid=Integer.MIN_VALUE;
			int re2 = sc3.nextInt();
			for(int i=0;i<empid.length;i++)
			{
				if(empid[i]==re2)
				{
					uid = i;
					break;
				}
			}
			try {
			System.out.println("You are editing for " + name[uid] + " Please enter new department and project ");
			Scanner sc4 = new Scanner(System.in);
			String dep = sc4.nextLine();
			String pro = sc4.nextLine();
			department[uid] = dep;
			project[uid] = pro;
			break;}
			catch(Exception e){
				System.out.println("Please enter a valid employee number");
				break;
			}
		}
		case "d":
		{
			System.out.println("Enter employee ID of whose details you want to delete");
			Scanner sc6 = new Scanner(System.in);
			int did = sc6.nextInt();
			int did2=0;
			for(int i=0;i<empid.length;i++)
			{
				if(empid[i]==did)
				{
					did2 = i;
					break;
				}
			}
			empid[did2] = 0;
			fillcount--;
			System.out.println("Employee Deleted");
			break;
		}
		case "c":
		{
			System.out.println("How many employees you want to add?");
			Scanner sc7 = new Scanner(System.in);
			Scanner sc8 = new Scanner(System.in);
			int cc = sc7.nextInt();
			
			for(int j=a;j<(a+cc);j++)
			{
				System.out.println("Enter the details of employee");
				System.out.println("Enter the ID of employee");
				empid[j] = sc7.nextInt();
				System.out.println("Enter the name of " + empid[j]+ " employee");
				name[j] = sc8.nextLine();
				System.out.println("Enter the department of " + name[j]);
				department[j] = sc8.nextLine();
				System.out.println("Enter the project of "  + name[j]);
				project[j] = sc8.nextLine();
				fillcount++;
			}
			break;
		}
		case "exit":
			System.out.println("Exited!");
			break;
		default:
			break;
			}
		
		}
	}
	private static void printdetails(int id, int[] empid, String[] name, String[] department, String[] project) {
		System.out.println(empid[id]);
		System.out.println(name[id]);
		System.out.println(department[id]);
		System.out.println(project[id]);
		
	}
	
	

}