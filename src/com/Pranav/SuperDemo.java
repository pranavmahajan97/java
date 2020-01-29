package com.Pranav;

public class SuperDemo {
	public static void main(String[] args) {
		ServiceCompany sc = new ServiceCompany();
		sc.info();

	}
}

class Company {

	public Company(int value) {
		super();
		System.out.println("CompanyConstructor " + value);
	}
	void info()
	{
		System.out.println("Company.info()");
	}

}

class ServiceCompany extends Company {

	public ServiceCompany() {
		super(100);
	}

}