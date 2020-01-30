package com.Pranav.Miscellaneous;

public class StaticBlockDemo {
	public static void main(String[] args) {
		new Corporate();
//		Corporate c = new Corporate();
//		Corporate d = new Corporate();
//		Corporate e = new Corporate();
//		Corporate f = new Corporate();
		// static block runs only once when class is loaded even for 4 objects it will run only once.
	}
}

class Corporate {
	static{
		System.out.println("Corporate.staticBlock()");
	}
	{
		System.out.println("Class check");
	}

	public Corporate() {
		System.out.println("Corporate.Corporate()");
	}
}
