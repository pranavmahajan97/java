package com.Pranav;

public class ThisMethodDemo {
	public static void main(String[] args) {
		Computer thinkpad = new Computer("Lenovo","ThinkPad",(byte)14);
		System.out.println(thinkpad.toString());
		
	}
}

class Computer {
	String manufacturer;
	String model;
	byte ram;
	byte hdd;
	byte screensize;

	public Computer() {
	}

	public Computer(String manufacturer, String model) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
	}

	public Computer(String manufacturer, String model, byte ram) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.ram = ram;
		
		
	}

	
	@Override
	public String toString() {
		return "Computer [manufacturer=" + manufacturer + ", model=" + model + ", ram=" + ram + "]";
	}
}
