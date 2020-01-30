package com.Pranav.Company;

import java.util.*;

public class Company {
	public static void main(String[] args) {
		ArrayList<Integer> empid = new ArrayList<Integer>();
		HashMap<Integer, String> named = new HashMap<Integer, String>();
		HashMap<Integer, String> founder = new HashMap<Integer, String>();
		HashMap<Integer, String> hq = new HashMap<Integer, String>();

		System.out.println("How many companies you want to add in your database?");
		Scanner sc8 = new Scanner(System.in);
		int ncom = Integer.parseInt(sc8.nextLine());
		int id = 0;
		for (int i = 0; i < ncom; i++) {
			create(i, empid, named, founder, hq);
		}
		Scanner sc2 = new Scanner(System.in);
		Boolean x = true;
		while (x) {
			System.out.println("What do you want to do now?(C/R/U/D/Exit)");

			String s = sc2.nextLine();
			String d = s.toLowerCase();
			switch (d) {
			case "r": {
				retrieve(empid, named, founder, hq);
				break;
			}
			case "u": {
				System.out.println("Enter company id for updation");
				Scanner sc3 = new Scanner(System.in);
				Scanner sc6 = new Scanner(System.in);
				int uid = sc3.nextInt();
				System.out.println("Enter new headquarters");
				String nhq = sc6.nextLine();
				hq.put(uid, nhq);
				break;
			}
			case "d": {
				System.out.println("Enter company id for deletion");
				Scanner sc4 = new Scanner(System.in);
				int did = sc4.nextInt();
				deletion(did, empid, named, founder, hq);
				break;
			}
			case "exit": {
				System.out.println("Exited");
				x = false;
				break;
			}
			case "c": {
				System.out.println("How many companies you want to add in your database?");
				Scanner sc9 = new Scanner(System.in);
				int newcom = sc8.nextInt();
				int j = empid.size();
				for (int i = j; i < newcom + j; i++) {
					create(i, empid, named, founder, hq);
				}
				break;
			}

			}
		}
	}

	private static void retrieve(ArrayList<Integer> empid, HashMap<Integer, String> named,
			HashMap<Integer, String> founder, HashMap<Integer, String> hq) {
		System.out.println("Enter the compnayid");
		Scanner c4 = new Scanner(System.in);
		int idd = c4.nextInt();
		if (empid.contains(idd)) {
			System.out.println(idd + " " + named.get(idd) + " " + founder.get(idd) + " " + hq.get(idd));
		} else {
			System.out.println("compnay not found");
		}

	}

	private static void deletion(int did, ArrayList<Integer> empid, HashMap<Integer, String> named,
			HashMap<Integer, String> founder, HashMap<Integer, String> hq) {
		try {
			empid.remove(new Integer(did));
			named.remove(did);
			founder.remove(did);
			hq.remove(did);
		} catch (Exception e) {
			System.out.println("Enter correct id");
		}

	}

	private static void create(int i, ArrayList<Integer> empid, HashMap<Integer, String> named,
			HashMap<Integer, String> founder, HashMap<Integer, String> hq) {
		int id = 0;
		Scanner sc = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Enter the ID of" + (i + 1) + "company");
		id = sc.nextInt();
		empid.add(id);
		System.out.println("Enter name of the company");
		named.put(id, sc4.nextLine());
		System.out.println("Enter the founder of company");
		founder.put(id, sc4.nextLine());
		System.out.println("Where is the headquarter?");
		hq.put(id, sc4.nextLine());
	}
}
