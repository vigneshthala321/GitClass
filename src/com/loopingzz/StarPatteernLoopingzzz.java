package com.loopingzz;

import java.util.Iterator;

public class StarPatteernLoopingzzz {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int space = 1; space <= 5-i; space++) {
				System.out.print(" "+" ");

			}

			for (int j = 1; j <= (i*2)-1; j++) {
				int z=j%2;
				if (z==0||(j==3&&i>2)||(j==5&&i>3)||(j==7&&i==5)) {
					System.out.print(" "+" ");
				}
				else {
					System.out.print("*"+" ");

				}
			}
			System.out.println();
		}

		for (int i = 4; i >= 1; i--) {

			for (int space = 1; space <= 5-i; space++) {
				System.out.print(" "+" ");
			}

			for (int j = 1; j <= (i*2)-1; j++) {
				int z = j%2;
				if (z==0||(i>=4&&j==5)||(i>=3&&j==3)) {
					System.out.print(" "+" ");
				}
				else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}







	}






}
