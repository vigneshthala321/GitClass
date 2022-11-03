package com.exceptions;

public class OutofBondExp {

	public static void main(String[] args) {
		
		//Array Index out of Bond Exception
		int a[] = new int[10*10];
		a[101]=10;
		System.out.println(a[101]);
		
		//String Index out of Bond Exception
		String s = "Vicky";
		char charAt = s.charAt(8);
		System.out.println(charAt);
		
		
	}
	
	
}





