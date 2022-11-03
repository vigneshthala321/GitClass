package com.forloop;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Example {
	public static void main(String[] args) {

	String a[] = {"vicky","java","selenium","vicky","python"};
		boolean b =  false;
		Set<String> se = new HashSet<>();
		
		for (String s : a) {
			
			if (se.add(s)==false) {
				System.out.println("Duplicate value:"+s);
				b=true;
			}
			else if (b== false) {
			
				System.out.println("No dupliocate value is present");
			}
			
			
		}
		
		


	}

}





