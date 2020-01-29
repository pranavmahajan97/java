package com.Pranav.Strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
	//	String named = "Pranav";
		StringBuilder sb = new StringBuilder();
		sb.append("Pranav");
		System.out.println(sb);
		sb.append(" Mahajan");
		System.out.println(sb);
		StringBuffer sbuffer = new StringBuffer();
		sbuffer.append("IBM");
		System.out.println(sbuffer);
		
	}

}
