package com.forloop;

public class AmstrongNumber {
	public static void main(String[] args) {

		int viki = 153  ;
		int s=viki;

		int result =0;

		while (viki>0) {

			int	rem = viki%10;

			result = result+(rem*rem*rem);

			viki= viki/10;
		}
		if (result==s) {
			System.out.println("it is an Amstrong Number");
		}	
		else {
			System.out.println("it is not an Amstrong Number");
		}


	}

}
