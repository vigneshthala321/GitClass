package com.oops;

class Sample{
	private	int i;
	private	String viki;

	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getViki() {
		return viki;
	}
	public void setViki(String viki) {
		this.viki = viki;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Sample s = new Sample();

		s.setI(12);
		s.getI();
		s.getViki();
		s.setViki("Vicky");


		System.out.println(s.getI());
		System.out.println(s.getViki());
		
	}

}
