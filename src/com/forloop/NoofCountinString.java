package com.forloop;

public class NoofCountinString {
	public static void main(String[] args) {

		String viki = "Vi@2";

		int length = viki.length();
		System.out.println(length);

		int CapCount = 0;
		int SmallCount = 0;
		int SplCount = 0;
		int NumCount =0;

		for (int i = 0; i < viki.length(); i++) {

			char c = viki.charAt(i);
			if (c>='a' && c<='z') {
				SmallCount++;

			}else if (c>='A' && c<='Z') {
				CapCount++;

			}else if (c>='0' && c<='9') {
				NumCount++;

			}else {
				SplCount++;
			} 


		}
		System.out.println(SmallCount);
		System.out.println(CapCount);
		System.out.println(NumCount);
		System.out.println(SplCount);

	}

}
