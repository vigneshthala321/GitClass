package com.forloop;

public class ReverseofNumber {
	public static void main(String[] args) {

		int a = 567;
		int res =0;

		while (a>0) {
			int rem = a%10;

			res = (res*10)+rem;

			a=a/10;
			System.out.println(res);
		}	
		System.out.println(res);

	}

}
