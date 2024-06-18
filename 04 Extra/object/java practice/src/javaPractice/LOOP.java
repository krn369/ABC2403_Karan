package javaPractice;

import java.util.Iterator;

public class LOOP {
	
	public static void main(String[] args) {
		
		
		
		// FOR LOOP
		
//		String name = "Karan PARIYAR";
				
//		 for(int i = 0; i < 100; i++ ) {
//			 
//			 System.out.println(name + " " + i);
//		 }
		
		
//		for (int i = 1; i<= 10; i++ ) {
//			
//			System.out.println("13 * " + i + " = "  + (13 * i));
//		}
		
		
		
			// WHILE LOOP
		
//	int num = 1;
//	while ( num <= 100) {
//		
//		System.out.println(num);
//		
//		num++;
//		
//	}
		
		// DO WHILE LOOP
		
//		int num = 1;
//		
//		do {
//		System.out.println(num);
//		num++;
//		} while (num <= 100);
		
		
		// NESTED LOOP
		for(int i = 1; i <= 15; i++ ) {
			
			for(int j = 1; j <= 10; j++) {
				
				System.out.println( i + " * " + j + " = " + (i*j) );
			}
			System.out.println("\n");
		}
	}

}
