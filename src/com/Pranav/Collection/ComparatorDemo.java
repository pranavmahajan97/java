package com.Pranav.Collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		TreeSet<College> collegeset = new TreeSet<>(new CComparator());
		collegeset.add(new College("RV","BLR","Karnataka"));
		collegeset.add(new College("Thapar","Patiala","Punjab"));
		collegeset.add(new College("BIT","Mesra","Jharkhand"));
		System.out.println(collegeset);
		for(College college: collegeset)
		{
			System.out.println(college);
		}
		
	}

}
class CComparator implements Comparator <College>
{

	@Override
	public int compare(College clgone, College clgtwo) {

		return clgone.getState().compareTo(clgtwo.getState());
	}
	}
class College
{String named;
String city;
String state;
public String getNamed() {
	return named;
}
public void setNamed(String named) {
	this.named = named;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public College(String named, String city, String state) {
	super();
	this.named = named;
	this.city = city;
	this.state = state;
}
@Override
public String toString() {
	return "College [named=" + named + ", city=" + city + ", state=" + state + "]";
}


}
