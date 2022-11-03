package com.loopingzz;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IterationofCollections {
	public static void main(String[] args) {

		//1.creating object for vector class
		Vector<String> vectorstring = new Vector<>();

		String d ="D";
		String e ="E";

		vectorstring.add("a");
		vectorstring.add("b");
		vectorstring.add("c");
		vectorstring.add(d);
		vectorstring.add(e);
		System.out.println(vectorstring);

		//2.performing Enumeration
		Enumeration<String> enumeration = vectorstring.elements();
		//3.using while loop we are going to iterate
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			System.out.println(string);
		}

		//4.Set by using Iterator
		HashSet<String> hashset = new HashSet<>();

		// String k ="k";
		// String y ="Y";
		hashset.add("v");
		hashset.add("i");
		hashset.add("c");
		hashset.add("k");
		hashset.add("y");
		System.out.println(hashset);
		Iterator<String> iterator = hashset.iterator();


		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);

			if (string.contains("k")) {
				iterator.remove();
			}
		}
		System.out.println(hashset);

		//3.By using listiterator
		ListIterator<String> listIterator = vectorstring.listIterator();
		
		while (listIterator.hasNext()) {
			String string = (String) listIterator.next();
			if (string.contains("a")) {
				listIterator.add("z");
			}
			if (string.contains("b")) {
				listIterator.remove();
			}
			if (string.contains("c")) {
				listIterator.set("M");
			}
			System.out.println(listIterator);
		}
		System.out.println(vectorstring);














	}
}
