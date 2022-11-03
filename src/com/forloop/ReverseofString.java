package com.forloop;

public class ReverseofString {
	public static void main(String[] args) {

		String viki = "vicky";
		String result = "";

		for (int i = viki.length()-1; i >=0; i--) {

			char charAt = viki.charAt(i);
			result = result+charAt;

		}
		System.out.println(result);

	}

}
