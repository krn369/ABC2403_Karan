package javaPractice;

public class EncapsulationWork {

	public static void main(String[] args) {
		Bag b1 = new Bag();
		b1.setId(1);
		b1.setName("Gucci");
		
		
		Bag b2 = new Bag();
		b2.setId(2);
		b2.setName("Adidas");
		
		
		Bag b3 = new Bag();
		b3.setId(3);
		b3.setName( "Balenciaga");
		
		System.out.println(b1.getName());
		System.out.println(b2.getName());
		System.out.println(b3.getName());
	}

}

class Bag{
	
	// Properties
	
	private int id;
	private String name;
	
	
	// Creating Getter and Setter
	
	int getId() {
		return this.id;
	}
	
	String getName() {
		return this.name;
	}
	
	void setId(int id) {
		this.id = id;
	}
	
	void setName(String name) {
		this.name = name;
	}
}