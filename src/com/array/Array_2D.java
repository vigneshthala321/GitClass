package com.array;

public class Array_2D {
	public static void main(String[] args) {
		
		int a[] = new int[4];
		int b[] = {1,2,3,4};
		
		int c[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		for (int i = 0; i < c.length; i++) {
			
			for (int j = 0; j < c[i].length; j++) {
				
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println("");
			
			System.out.println(c[0][3]);
			
		}
		










	}
}
