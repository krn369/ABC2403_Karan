package javaPractice;

public class ConstructorWork {
	
	public static void main(String[] args) {
		
		Book b1 = new Book(1,299, "WORK SMART NOT HARD", 50.99);
		Book b2 = new Book(2,199, "YOU ARE THE BEST", 37.95);
		Book b3 = new Book(3,499, "NEVER GIVE UP", 88.77);
		Book b4 = new Book(4, "ALL IS WELL");
		
		
		Book [] books = {b1,b2,b3};
		
		// USING FOR EACH LOOP
		
		for(Book b : books) {
			
			b.printInfo();
		}
		
		
		b4.printInfoPlus();

		
	}
	
}

class Book{
	
	// Properties
	
	int id;
	int pages;
	String name;
	double price;
	
	// Constructor
	
	Book(int id, int pages, String name, double price){
		
		this.id = id;
		this.pages = pages;
		this.name = name;
		this.price = price;
	}
		
	
	// Constuctor Overloading
	
	Book(int id, String name){
		
		this.id = id;
		this.name = name;
	}
	
		// Other Methods
		
		void printInfo() {
			
			System.out.println("Book id is : " + this.id);
			System.out.println("Book name is :" + this.name);
			System.out.println("Total numbers of the page is : " + this.pages);
			System.out.println("Total price is : " + this.price);
			System.out.println("-------------------------------------------------------------\n");
		}
		
		void printInfoPlus() {
			
			System.out.println("Book id is : " + this.id);
			System.out.println("Book name is :" + this.name);
			System.out.println("-------------------------------------------------------------\n");
		}
		
	
		
	
}