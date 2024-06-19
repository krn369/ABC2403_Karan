package javaPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistWork {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Karan");
		names.add("Rojita");
		names.add("Khusi");
		names.add("Sita");
		names.add("Ramesh");
		names.add("Nanichori");
		names.add("Raymond");
		names.add("Leo");
	
		names.remove(7);
		names.set(6, "Richard");
		
		System.out.println(names.get(0));
		
		//Collections.sort(names);
		Collections.sort(names, Collections.reverseOrder());
		
		for (String name: names) {
			System.out.println("\n" + name);
		}
		
		
		
		
	}

}
