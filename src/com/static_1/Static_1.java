package com.static_1;

public class Static_1 {

	int id ;
	String name ;
	int salary;
	static String manager;
	static int cid;

	public Static_1() {
		System.out.println("Constructor");
	}
	
	static  {
		manager = "antony";
		cid = 101;
		System.out.println("Static Method");

	}

	static int i ;

	public static void main(String[] args) {
		i=10;

		Static_1 vivek = new Static_1();
		vivek.id=01;
		vivek.name="vivek";
		vivek.salary=1000;
		Static_1.manager="sophars";

		Static_1 karthi = new Static_1();
		karthi.id=02;
		karthi.name="karthi";
		karthi.salary=2000;
		Static_1.manager="sophars";

		Static_1 vishnu = new Static_1();
		vishnu.id=03;
		vishnu.name="vishnu";
		vishnu.salary=3000;
		Static_1.manager="raja";

		System.out.println(vivek.salary);
		System.out.println(vivek.manager); 
		System.out.println(Static_1.manager);
		System.out.println(Static_1.cid);
		System.out.println(i);






	}






}
