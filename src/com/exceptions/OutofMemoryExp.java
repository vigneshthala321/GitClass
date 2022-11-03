package com.exceptions;

public class OutofMemoryExp {
	public static void main(String[] args) {
		int a[] = new int[10000*100000];
		a[0] = 10;
		System.out.println(a[0]);
		
	}

}
