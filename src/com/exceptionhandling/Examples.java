package com.exceptionhandling;


public class Examples {
	public static void main(String[] args) {
		
		int a[]= new int[2];
		
		for (int i = 0; i < 2; i++) {
			
			a[i]=i+0;
			System.out.println(a[i]);
			
			for (int value : a) {
				System.out.println(value);
				
			}
			
		}
		
		
		
		
	}

}
