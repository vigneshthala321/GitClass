package com.loopingzz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class ListSetMapCreation {
	public static void main(String[] args) {
		//1.1 Array List
		List<String> liststring = new ArrayList<>();

		String s = "Sakthi";
		String k = "krishna";

		liststring.add("v");
		liststring.add(s);
		liststring.add(k);
		liststring.add(null);

		System.out.println(liststring);
		String string = liststring.get(1);
		System.out.println(string);

		//1.2 Vector List
		Vector<Integer> integer = new Vector<>();

		int a = 10;
		int b = 20;
		int c = 30;

		integer.add(a);
		integer.add(b);
		integer.add(c);

		System.out.println(integer);
		//	Integer integer2 = integer.get(0);
		System.out.println(integer.get(1));
		integer.add(1,40);
		//    System.out.println(integer);
		for (Integer value : integer) {
			System.out.println(value);
		}
		System.out.println(integer);
		
		//3.Set
		Set<String> setstring = new HashSet<>();

		String vi = "vicky";
		String sa = "saklthi";
		String ja = "jai";
		String ring = "ring";

		setstring.add(ja);
		setstring.add(sa);
		setstring.add(vi);

		System.out.println(setstring);
		String string2 = setstring.toString();
		System.out.println(string2);


		//3.list
		List<String> liststrings = new ArrayList<>();

		String d = "shalini";

		liststrings.add("vicky");
		liststrings.add("jai");
		liststrings.add(d);

		for (String listnames : liststrings) {

			System.out.println(listnames);
		}
		
		//linkedHash Map
		Map<String, Integer> hashmap = new LinkedHashMap<>();
		
		hashmap.put("Vicky", 10);
		hashmap.put("shalini", 11);
		hashmap.put("swetha", 12);
		
		System.out.println(hashmap);
		
		Collection<Integer> values = hashmap.values();
		System.out.println(values);
		
		Set<String> keySet = hashmap.keySet();
		System.out.println(keySet);
		
		Integer vick = hashmap.get("Vicky");
		System.out.println(vick);
		


















	}


}
