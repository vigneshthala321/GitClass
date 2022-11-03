package com.forloop;

public class ReverseofString_2 {
	public static void main(String[] args) {

		String viki = "Vignesh Thulasidass";
		String result = "";

		String[] split = viki.split(" ");

		for (String v : split) {
			for (int i = v.length()-1; i >=0; i--) {
				char charAt = v.charAt(i);
				result = result+charAt; 

			}
			result=result+" ";
		}
		System.out.println(result);
		
	}
	
}
