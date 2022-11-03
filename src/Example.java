import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,3,4,5};

		for (int i = 0; i < a.length; i++) {

			for (int j = i+1; j < a.length; j++) {

				if (a[i]==a[j]) {
					System.out.println("Duplicate elements :"+ a[i]);
				}
				if ((a[i]==a[j])) {
				//	System.out.println(a[i]);
				}else {
					System.out.println(a[i]);
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}




	}
}
