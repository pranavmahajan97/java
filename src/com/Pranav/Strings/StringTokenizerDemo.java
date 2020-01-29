package com.Pranav.Strings;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String name = args[0];
		System.out.println(name);
		StringTokenizer newtokens = new StringTokenizer(name," ");
		while(newtokens.hasMoreTokens())
		{
			System.out.println(newtokens.nextToken());
		}
	}
}
