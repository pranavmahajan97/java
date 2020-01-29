package com.Pranav;

public class ThisKeywordDemo {
	private int count;
	public static void main(String[] args) {
		ThisKeywordDemo th = new ThisKeywordDemo();
		th.process();
	}
	void process() {
		System.out.println(count);
		setCount(148);
		System.out.println("New Count "+ count);
		
	}
	private void setCount(int count) {
			this.count=count;		
	}
	
}
