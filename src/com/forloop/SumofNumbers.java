package com.forloop;

public class SumofNumbers {
public static void main(String[] args) {
	
	int viki = 12345;
	int result = 0;
	
	while (viki>0) {
	int	mano = viki%10;
	
	result = result + mano;
	
	viki = viki/10;
	System.out.println(result);
	}
	System.out.println(result);
	
}
	
	
}
