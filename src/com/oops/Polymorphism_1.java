package com.oops;

public class Polymorphism_1 {
	//Method Over Loading

	public void poly(int v) {
		v=v+10;
		System.out.println("Hello"+ v);

	}
	public void poly(String m) {
		System.out.println("Hello"+m);
	
	}

	public static void main(String[] args) {

		Polymorphism_1 p = new Polymorphism_1();
		p.poly(1);
		p.poly(" Good Morning");

	}




}
