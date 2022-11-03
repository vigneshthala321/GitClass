package com.forloop;

import java.util.Iterator;

public class PrimeNumber_02 {
	public static void main(String[] args) {
		
		int count = 0;
		
		
		for (int i = 5; i <= 10; i++) {
			
			for (int j = 1; j <= 10; j++) {
				if (i>0) {
					
				if (i%j==0) {
					count++;
				}
				}
			}
			if (count==2) {
				System.out.println(i);
			}
			else {
				System.out.println("it is not a prime number:"+i);
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

	}









