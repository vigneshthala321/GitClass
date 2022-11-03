package com.forloop;

public class SwappingofNumbers {
	public static void main(String[] args) {
		int a = 20;
		int b = 50;

		int c = a;
		a=b;
		b=c;

		System.out.println(a);
		System.out.println(b);

		//without using 3rd variable
		a = a+b;
		b =a-b;
		a = a-b;

		System.out.println(a);
		System.out.println(b);

		//by using multiply
		a=a*b;
		b=a/b;
		a=a/b;

		System.out.println(a);
		System.out.println(b);




	}

}
