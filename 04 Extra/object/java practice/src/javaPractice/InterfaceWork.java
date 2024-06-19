package javaPractice;

public class InterfaceWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.run();
		
		Bike b1 = new Bike();
		b1.run();
	}

}

interface Vehicle{
	
	void run();
	
}

interface ABC{
	
	
}
class Car implements Vehicle{
	
	public void run() {
		System.out.println("Car runs with 4 wheels.");
	}
}

class Bike implements Vehicle{
	
	public void run() {
		
		System.out.println("Bike runs with 2 wheels.");
	}
}