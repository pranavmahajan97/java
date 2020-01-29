package com.Pranav.Strings;

public class StringDemo {

	public static void main(String[] args) {
			String name  = "IBM";
			
			System.out.println(name);
			name = name + " Corp";
			System.out.println(name);
			String check = "IBM Corp";
			if(check.equals(name))
				System.out.println("Equal");
	}

}
