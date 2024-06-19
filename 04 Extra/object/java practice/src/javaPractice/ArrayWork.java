package javaPractice;

public class ArrayWork {

	public static void main(String[] args) {
		
		String [] names = { "Karan", "Rojita", "Khusi", "Sita", "Ramesh"};
		int [] grades = {70,80,90,99,75};
		System.out.println(names[0]);
		System.out.println("Total Names :" + names.length );
		
		
		
		
		// Change Milan to Shyam
		
		names[0] = "Pariyar";
		
		
		// Print all the names inside the array.
		
		
				for(int i = 0; i < names.length; i++) {
					
					System.out.println(names[i]);
				}
				
				System.out.println("\n");
				
				for( String name : names) {
					
					System.out.println(name);
				}
				
				System.out.println("\n");
				for(int i = 0; i< names.length; i++ ) {
					
					System.out.println(names[i] + " grade is " + grades[i]);
				}
				
				System.out.println("\n");
				int total = 0;
				
				for (int i = 0; i< grades.length; i++) {
					
					total = total + grades[i];
				}
				
				System.out.println("The total grades obtained = " + total);
				
				double avg = total / grades.length;
				
				System.out.println("The average marks obtained is : "+ avg);
	}
	

}
