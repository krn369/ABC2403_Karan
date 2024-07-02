package javaPractice;

public class Main {

	public static void main(String[] args) {
		
		
		// CREATING OBJECT
		
	
		
		Computer c1 = new Computer();
		c1.id = 1;
		c1.price = 5000;
		c1.name = "DELL";
		
		Computer c2 = new Computer();
		c2.id = 2;
		c2.price = 8000;
		c2.name = "MSI";
		
		// Print Details from Object
		
		c1.displayInfo();
		System.out.println("\n");
		c2.displayInfo();
		

	}

}
