package com.Pranav.Collection;

import java.util.Hashtable;

public class HashTableDemp {
	public static void main(String[] args) {
		Hashtable<Integer, Double> emprating = new Hashtable<>();
		emprating.put(1,4.5);
		emprating.put(2,4.7);
		emprating.put(3,4.2);
		emprating.put(3, 5.0);
		System.out.println(emprating);
		//HashMap accepts null keys and null values whereas hashset cannot
	}

}
