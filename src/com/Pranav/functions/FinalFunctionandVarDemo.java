package com.Pranav.functions;

public class FinalFunctionandVarDemo {
	static int value = 100;
	public static void main(String[] args) {
		System.out.println(value);
		value=2100;
		//cant assign new values to variable if it was final
		System.out.println("new value is " + value);
	}
	
}
class Data{
	void stdData()
	{
		System.out.println("Data.stdData()");
	}
	final void splData()
	{
		System.out.println("Data.splData()");
	}
}

class CompanyData extends Data{
	
	@Override
	void stdData() {
		// TODO Auto-generated method stub
		super.stdData();
	}
	
}
