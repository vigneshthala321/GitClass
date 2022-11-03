package com.exceptionhandling;

public class Handling_1 {
	public static void main(String[] args) {
		//Normal statement
		int i,j,k=0;
		i=8;
		j=0;
		//Critical statement
		//k=i/j; critical statement comes under try block
		try {
			k=i/j;

		} catch (Exception e) {
			System.out.println(e+" Cannot divide by zero");
		}
		finally {
			System.out.println("final block");
		}
		//whenever u assign a variable in a block, assign a value
		//initialize value to the variable K
		System.out.println(k);
	}
	//After the exception occur in the try block we handle it in a catch and below statement K gets printed
	//The Execution keeps on going even through exception occurs
	//Arithmetic Exception (Unchecked Exception)

}
