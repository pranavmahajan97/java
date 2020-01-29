package com.Pranav.functions;

public abstract class Calculations {

	public static int add(int first, int last) {
		return first + last;
	}

	protected final int subtract(int first, int last) {
		return first - last;
	}

	synchronized int multiply(int first, int last) {
		return first * last;
	}

	private native int division(int first, int last);

	abstract void modulus (int first, int last);
}
