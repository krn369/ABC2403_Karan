package javaPractice;

public class HouseOOP {

	public static void main(String[] args) {
		
		// Creating object: ClassName ObjectName = new ClassName
		
		House h1 = new House();
		h1.color = "Red";
		h1.price = 150000;
		h1.name = "Nanichori Complex";
		
		h1.printInfo();
		
		System.out.println("\n");
		
		House h2 = new House();
		h2.color = "White";
		h2.price = 500000;
		h2.name = "Rani Mahal";
		h2.printInfo();

	}

}


//Creating a class


class House{
	
	//Properties
	String color;
	double price;
	String name;
	
	
	// Functions
	
	void printInfo() {
		
		System.out.println("The color of the house is " + this.color);
		System.out.println("The price of the house is " + this.price + "€");
		System.out.println("The name of the house is " + this.name);
	}
}
