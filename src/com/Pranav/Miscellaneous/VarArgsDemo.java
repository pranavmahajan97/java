package com.Pranav.Miscellaneous;

public class VarArgsDemo {

	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.sum(10,20,30,40,50));
	}

}
class Calc{
	int sum(int... args)
	{
		int summed=0;
		for(Integer i: args)
		{
			summed=summed+i;
		}
		return summed;
	}
	int sum(int first, int second)
	{
		return first+second;
	}
	
}