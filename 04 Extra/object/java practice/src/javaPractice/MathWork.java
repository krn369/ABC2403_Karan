package javaPractice;

public class MathWork {
	
	public static void main(String[] args) {
		
		int n1 = 123;
		
		int n2 = 225;
		
		double n3 = 45.52;
		
		
		System.out.println("Max number : " + Math.max(n1, n2));
		System.out.println("Min number : " + Math.min(n1, n2));
		System.out.println("Round Value :" + Math.round(n3));
		System.out.println("Floor value : " + Math.floor(n3));
		System.out.println("Ceil Value : " + Math.ceil(n3));
		System.out.println("Square Root : " + Math.sqrt(n3));
		System.out.println("Cube : " + Math.pow(55, 3));
		
		generateRandom(150,250);
		
	}
	
	public static void generateRandom(int min, int max) {
		
		int random = (int) (Math.random() * (max - min +1) + min ) ;
		System.out.println(random);
		
	}

}
