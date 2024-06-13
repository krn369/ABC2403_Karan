package encapsulation;

public class Interfaces implements Car {
	
	public static void main(String[] args) {
		
		Interfaces bumbleee = new Interfaces();
	}

	@Override
	public void start() {
		
		System.out.println("My car is starting.");
		
	}

}


interface Car {
	
	void start();
}

interface Person {
	
	void walk();
}