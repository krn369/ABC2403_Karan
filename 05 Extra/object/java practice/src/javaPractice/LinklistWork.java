package javaPractice;

import java.util.Collections;
import java.util.LinkedList;

public class LinklistWork {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<>();
		
		names.add("Karan");
		names.add("Rojita");
		names.add("Khusi");
		names.add("Sita");
		names.add("Ramesh");
		names.add("Nanichori");
		names.add("Raymond");
		names.add("Leo");
		
		
		names.addFirst("PARIYAR");
		
		System.out.println(names.size());
	
		Collections.sort(names);
		
		// to print details
		
		for(String name: names) {
			
			System.out.println(name);
		}
		

	}

}
