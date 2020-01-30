package com.Pranav.Collection;

import java.util.TreeSet;

public class TreesetExtDemo {

	public static void main(String[] args) {
		TreeSet<Furniture> fset = new TreeSet<>();
		System.out.println(fset);
		fset.add(new Furniture("chair", "plastic"));

		Furniture table = new Furniture("table","glass");
		fset.add(table);
		System.out.println(fset.toString());

	}
}

class Furniture implements Comparable<Furniture> {
	String named;
	String material;

	public String getNamed() {
		return named;
	}

	public Furniture(String named, String material) {
		super();
		this.named = named;
		this.material = material;
	}

	public void setNamed(String named) {
		this.named = named;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public int compareTo(Furniture another) {
		// TODO Auto-generated method stub
		return material.compareTo(another.getMaterial());
	}

}
