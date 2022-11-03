package com.forloop;

public class Pallindrome {
	public static void main(String[] args) {
		
		int viki = 858859;
		int s =viki;
		int result =0;
		
		while (viki>0) {
		int	rem = viki%10;
		
		result = (result*10)+rem;
		viki = viki/10;
		
		}
		if (result==s) {
			System.out.println("The Number is Palindrome");
		}else {
			System.out.println("The Number is not a Palindrome");
		}
		
		
	}

}
