package com.Pranav.Collection;

import java.util.HashMap;

public class HashMapDemp {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(7,"pranav");
		hm.put(7,"kritika");
		hm.put(9,"pranav");
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println(hm.get(7));
	}

}
