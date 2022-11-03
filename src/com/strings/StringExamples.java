package com.strings;

public class StringExamples {
public static void main(String[] args) {
	
	String s = "Vignesh ";
	String s1 = "vignesh ";
	
	boolean b = s.isEmpty();
	System.out.println(b);
	
	char charAt = s.charAt(0);
	System.out.println(charAt);
	
	int indexOf = s.indexOf("s");
	System.out.println(indexOf);
	
	int lastIndexOf = s.lastIndexOf("s");
	System.out.println(lastIndexOf);
	
	String trim = s.trim();
	System.out.println(trim);
	
	String concat = s.concat("Dhana");
	System.out.println(concat);
	
	String replace = s.replace("n", "N");
	System.out.println(replace);
	
	int compareTo = s.compareTo("Vigne ");
	System.out.println(compareTo);
	
	String substring = s.substring(1, 4);
	System.out.println(substring);
	
	String substring2 = s.substring(2);
	System.out.println(substring2);
	
	boolean equals = s.equals(s1);
	System.out.println(equals);
	
	boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
	System.out.println(equalsIgnoreCase);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
}
