package com.array;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicate_String {
	public static void main(String[] args) {

		String s[]= {"java","python","ruby","java","csharp"};

		Set<String> str = new HashSet<>();

		boolean b = false;
		for (String string : s) {

			if (str.add(string)==false) {

				System.out.println("Found Duplicate Element :"+string);
				b=true;
			}
			if (b==false) {
				System.out.println("Duplicate is not present");
			}

		}

	}

}
