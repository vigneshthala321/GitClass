package com.forloop;

public class Sample {
	public static void main(String[] args) {

	int viki = 4554;
	int example = viki;
	int result = 0;
	
	while (viki>0) {
		
		int rem = viki%10;
		
		 result = (result*10)+rem; 
		 
		 viki = viki/10;
		
	}
	if (result==example) {
		System.out.println("It is a Palindrome Number");
	}
	else {
		System.out.println("It is not a Palindrome Number");
	}



	}


}
