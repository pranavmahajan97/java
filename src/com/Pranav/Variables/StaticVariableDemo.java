package com.Pranav.Variables;

public class StaticVariableDemo {
public static void main(String[] args) {
	Vendor vc = new Vendor();
	vc.createVendor("IBM");
	vc.totalVendor();
	Vendor hb = new Vendor();
	hb.createVendor("Hunger Box");
	hb.totalVendor();
	
}
}
class Vendor{
	static int totalVendors;
	void createVendor(String name)
	{
		System.out.println("Creating a vendor" + name);
		totalVendors++;
	}
	void totalVendor()
	{
		System.out.println(totalVendors);}
	}