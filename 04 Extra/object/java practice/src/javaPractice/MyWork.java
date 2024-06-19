package javaPractice;

public class MyWork {

	public static void main(String[] args) {
		
		Box.info ="Hello";
		Box.info = "HI";
		System.out.println(Box.info);
		System.out.println("Database host is " + Database.getInfo());

	}

}

class Box{
	
	static String info;
}

class Database{
	
	// Static method
	
	static String getInfo() {
		return "localhost";
	}
}