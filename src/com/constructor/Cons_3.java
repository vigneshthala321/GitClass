package com.constructor;

public class Cons_3 {
	
	int a;
	int b;
	String c;
	double d;
	float e;
	
	public Cons_3() {
		
	}
	
	public Cons_3(int a,String c) {
	this.a=a;
	this.c=c;
	this.b=a;
	}
	
	public Cons_3(double d,float e) {
		
	}
	
	public static void main(String[] args) {
		Cons_3 obj = new Cons_3(60, "Dhana");
		System.out.println(obj.a);
		System.out.println(obj.c);
		System.out.println(obj.b);
	}
	
	
}
