package com.constructor;

public class Cons {

	int v = 10;
	int i ;
	String c;
	int k;
	String y ;

	public Cons(int v, int i, String c, int k, String y) {
		super();
		this.v = v;
		this.i = i;
		this.c = c;
		this.k = k;
		this.y = y;
		System.out.println("Dass");
	}

	public static void main(String[] args) {
		Cons obj = new Cons(80, 20, "vicky", 50, "Manoj");

		System.out.println("Dhana");
		System.out.println(obj.v);
		System.out.println(obj.i);
		System.out.println(obj.c);
		System.out.println(obj.k);
		System.out.println(obj.y);
	}





}
