package com.strings;

public class StringBuffer_1{


public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Naveen");
	sb.append(" Reddy");
	sb.delete(1, 4);
	sb.reverse();
	
	//change StringBuffer(object) to String
	String string_1 = sb.toString();
	
	System.out.println(string_1);
	 
	
	
	
	
	
	
	
	
}
	
	
}
