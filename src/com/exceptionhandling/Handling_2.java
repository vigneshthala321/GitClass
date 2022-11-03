package com.exceptionhandling;

public class Handling_2 {
	public static void main(String[] args) {
		//Now we know its Arithmetic Exception so change super class Exception to Arithmetic Exception
		//2.Now create Array
		//3.If the Exception occurs in try block it wont execute below code, it will directly goes to catch block so edit (y = 2)

		int x,y,z=0;
		x=8;
		y=0;
		int a[] = new int[4];

		try {
			//Arithmetic Exception
			z=x/y;
			//ArrayIndexoutofBound Exception
			for (int i = 0; i <=6; i++) {
				a[i]=i+1;
				System.out.println(a[i]);
			}

		} catch (ArithmeticException e) {
			System.out.println(e+": Cannot divide by zero");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e+" Maximum number of value should be 4");
		}
		finally {
			System.out.println("Finally Block always print");
		}

		System.out.println(z);
		System.out.println("Code below Try and Ctach");
	}




}


