package com.Pranav.Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Bangalore");
		hs.add("Gurgaon");
		hs.add("Bangalore");
		hs.add("Delhi");
		System.out.println(hs.size());
		System.out.println(hs);
		
		TreeSet trs = new TreeSet();
		trs.add("Bangalore");
		trs.add("Gurgaon");
		trs.add("Bangalore");
		trs.add("Delhi");
		System.out.println(trs.size());
		System.out.println(trs);
	}

}

