package com.exceptions;

public class Over_FlowExp {
	
	private void c1() {
		this.c1();
	}
	
	private void c2() {
		this.c2();
	}
	public static void main(String[] args) {
	Over_FlowExp xyz = new Over_FlowExp();
	xyz.c1();
	
	
		
		
		
		
	}
	
	
	
}
