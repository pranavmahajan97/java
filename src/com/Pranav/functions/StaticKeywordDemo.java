package com.Pranav.functions;

public class StaticKeywordDemo {
// static blocks, variables and methods but no classes
	// class level methods = static, instant level methods using objects
	// static methods can only access static variables
	// JVM will call StaticKeywordDemo.main()
	public static void main(String[] args) {
		Company.getFounder();

	}

}
class Company{
	static void getFounder()
	{
		System.out.println("Thomas J. Watson");
	}
}