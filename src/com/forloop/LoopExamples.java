package com.forloop;

import java.util.Iterator;

public class LoopExamples {
	public static void main(String[] args) {
		//1.)
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
		System.out.println();
		System.out.println();

		//2.)
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		//3.)
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {

				if (i==1||i==4||j==1||j==4) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		//4.)
		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= 10; j++) {

				if (i==1||i==10||j==1||j==10||i==5) {
					System.out.print("$"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}

			System.out.println();
		}
		System.out.println();
		System.out.println();

		//5.)
		System.out.println("5.)");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				int k=j+i-1;
				if (k<=5) {
					System.out.print(k+" ");
				}
				else {
					System.out.print(k-5+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		//6.)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				int k = j-i+1;
				if (k<=0) {
					System.out.print(5+k+" ");
				}else {
					System.out.print(k+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		//7.)
		for (int i = 1; i <= 5 ; i++) {
			for (int j = 1; j <= i; j++) {
				int k=(j+i)%2;
				if (k==0) {
					System.out.print("1"+" ");
				}
				else {
					System.out.print("0"+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		//8.)
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		//9.)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for (int i = 5; i >=1; i--) {
			for (int j = 1; j <= i; j++) {

				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		//9.2.)Printing above program in a single nested for loop
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				if (i>5 && i+j>10) {
					break;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		//10.)Printing of String value
		String  v = "Vicky";

		for (int i = 1; i <= v.length(); i++) {
			for (int j = 1; j <= v.length(); j++) {
				if (i>j) {
					System.out.print(" "+" ");
				}else {
					System.out.print(v.charAt(j-1)+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		//11.)
		for (int i = 1; i <= 5; i++) {

			for (int space = 4; space >=i; space--) {
				System.out.print(" "+" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		//12.)Diamond pattern
		for (int i = 1; i <= 5 ; i++) {

			for (int space = 1; space <= 5-i; space++) {
				System.out.print(" "+" ");
			}

			for (int j = 1; j <= (i*2)-1; j++) {
				System.out.print("#"+" ");
			}
			System.out.println();
		}

		for (int i = 4; i >= 1; i--) {

			for (int space = 1; space <= 5-i; space++) {
				System.out.print(" "+" ");
			}

			for (int j = 1; j <= (i*2)-1; j++) {
				System.out.print("#"+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		//13.)
		for (int i = 1; i <= 5; i++) {

			for (int space = 1; space <= 5-i; space++) {

				System.out.print(" "+" ");
			}
			for (int j = 1; j <= (i*2)-1; j++) {
				int z =j%2;
				if (z==0) {
					
					System.out.print(" "+" ");
				}
				else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}

		for (int i = 4; i >= 1; i--) {

			for (int space = 1; space <= 5-i; space++) {
				System.out.print(" "+" ");
			}

			for (int j = 1; j <= (i*2)-1; j++) {
				int z = j%2;
				if (z==0) {
					System.out.print(" "+" ");
				}
				else {
					System.out.print("*"+" ");

				}
			}
			System.out.println();
		}






















	}
}
