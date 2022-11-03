package com.forloop;

public class OddNumber {
	public static void main(String[] args) {
		
		int result;
		
		for (int i = 0; i < 100; i++) {
			result=i%2;
			if (!(result==0)) {
				System.out.println(i);
			}
			
		}
		
	}

}
