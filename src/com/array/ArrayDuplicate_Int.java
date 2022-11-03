package com.array;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayDuplicate_Int {
	public static void main(String[] args) {

		int a[] = {1,2,2,3,4,4,5,6,6,7};
		int temp;

		for (int i = 0; i < a.length; i++) {

			for (int j = i+1; j < a.length; j++) {

				if (a[i]==a[j]) {

					System.out.println("Duplicate Element:"+a[i]);

				}
			


			}
		}
		




	}

}
