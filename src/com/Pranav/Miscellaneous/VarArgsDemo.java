package com.Pranav.Miscellaneous;

public class VarArgsDemo {

	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.sum(20, 30));
	}

}
class Calc{
	int sum(int first, int second)
	{
		return first+second;
	}
	
}