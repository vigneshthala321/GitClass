package com.array;

public class Array_1D {
	public static void main(String[] args) {
		int a[] = new int[4];

		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		a[3]= 40;

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i]);

		}
		
		for (int j : a) {
			
			System.out.println(j);
		}

	}



}
