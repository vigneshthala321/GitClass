package com.array;

public class AccendingOrder {
public static void main(String[] args) {
	int a[]= { 2,1,45,26,21,12,98,48};
	int temp;

	for (int i = 0; i < a.length; i++) {

		for (int j = i+1; j < a.length; j++) {

			if (a[i]>a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
			}


		}

	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}

	
}
}
