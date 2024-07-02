package javaPractice;

public class MethodWork {

	public static void main(String[] args) {
		printName();
		printAddress();
		add(51.22,59.33);
		printAge(1998);
		
		double sum = add1(15,89.8);
		System.out.println("The sum is " + sum );
		
		
		String firstname = "Rojita";
		String lastname = "RANJITKAR";
		
		String fullName = getFullName(firstname, lastname);
		System.out.println(fullName);
		
		double interest = getSI(55555,1,12.8);
		System.out.println("Your Simple Interest is :" + interest);
		
		
		String francePresident = getPresidentFrance();
		System.out.println(francePresident);
		
	}
	
	
	
	
	
	public static void printName() {
		System.out.println("Karan PARIYAR");
	}
	
	
	
	
	
	// NO PARAMETER NO RETURN TYPE
	
	
	public static void printAddress() {
		
		System.out.println("Mulhouse, France");
		
		additonalAddress();
	}
	
	public static void additonalAddress() {
		
		System.out.println("My  fulladdress in Mulhouse is 7 bd des nations");
		System.out.println("My postal code is 68200");
		System.out.println("My studio number is 46");
		System.out.println("I am living in the building named \" Arc en Ciel \" ");
	}
	
	
	// YES PARAMETER BUT NO RETURN TYPE
			
	public static void add(int n1, int n2) {
		
		int sum = n1 + n2;
		System.out.println("The sum is " + sum);
	}
	
	public static void printAge(int birthyear) {
		
		int age = 2024 - birthyear;
		System.out.println("Your age is " + age);
	}
	
	
	// YES PARAMETER AND YES RETURN TYPE
	
	public static int add1(int n1, int n2) {
		 
		return n1 + n2;
	}
	
	// Method overloading
	
		public static void add(double n1, double n2) {
		
		double sumo = n1 + n2;
		
		System.out.println("The sum is " + sumo);
		
		}
		
		
	public static int add1(int n1, int n2, int n3) {
		 
		return n1 + n2 + n3;
	}
	
	public static double add1(double n1, double n2) {
		 
		return n1 + n2;
	}
	
	
	public static String getFullName(String fname, String lname) {
		return "Your Full name is : " + fname + " " + lname;
	}
	
	public static double getSI(double p, double t, double r) {
		
		return (p*t*r)/100;
	}
	
	
	// NO PARAMETER BUT YES RETURN TYPE
	
	public static String getPresidentFrance() {
		return "The actual President of the France is Mr. Emmanuel MACRON";
	}
	

	
}
