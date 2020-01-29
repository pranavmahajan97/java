package com.Pranav.functions;
// final jdk classes
public class FinalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionInfo ac = new AdditionInfo();
		ac.getinfo();
	}
	
	

}
final class Info{
// final class cant be extended	
	void getinfo()
	{
		System.out.println("Info.enclosing_method()");
	}
}
class AdditionInfo
{
 void getinfo()
 {
	 Info i = new Info();
	 i.getinfo();
	 System.out.println("AdditionInfo.getinfo()");
 }
}
