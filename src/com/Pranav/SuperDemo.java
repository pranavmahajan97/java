package com.Pranav;

public class SuperDemo {
	public static void main(String[] args) {
		ServiceCompany sc = new ServiceCompany();
		sc.info();

	}
}

class Company2 {

	public Company2(int value) {
		super();
		System.out.println("CompanyConstructor " + value);
	}
	void info()
	{
		System.out.println("Company.info()");
	}

}

class ServiceCompany extends Company2 {

	public ServiceCompany() {
		super(100);
	}

}