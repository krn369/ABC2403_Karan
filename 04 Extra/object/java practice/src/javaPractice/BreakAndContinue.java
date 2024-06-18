package javaPractice;

public class BreakAndContinue {

	public static void main(String[] args) {

		for(int i = 1; i <= 10; i++) {
			
			if(i == 5 || i == 9) {
				
			 continue;   //Continue the loop overlapping the condition           // Exit the loop immediately [ break; ]
			}
			
			System.out.println(i);
		}
		
		
		// FINDING TOTAL SUM  NATURAL NUMBERS
		
		int total = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			total += i;          //total = total + i;
		}
		
		System.out.println("\n");
		System.out.println("Total is : " + total);

	}

}
