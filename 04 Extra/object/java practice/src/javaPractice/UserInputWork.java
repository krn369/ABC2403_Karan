package javaPractice;

import java.util.Scanner;

public class UserInputWork {

	public static void main(String[] args) {
		
		// Making Scanner Object
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter first name :");
//		String fname = sc.nextLine();
//		
//		System.out.println("Enter last name :");
//		String lname = sc.nextLine();
//		
//		System.out.println("Enter you age :");
//		int age = sc.nextInt();
//		
//		System.out.println("Enter your height in inches :");
//		double height = sc.nextDouble();
//		
//	System.out.println("Your full name is :" + fname + " " + lname + ". " + "Your age is : " + age + ". " + "Your height is : " + height + ".");
//	
	String country = "Nepal";
	String capital = "Kathmandu, ";
	String tempValue = "Nepal";
	
	System.out.println("The length of country is : " + country.length());
	System.out.println("The length of capital is : " + capital.length());
	System.out.println("Address is " + capital.concat(country));
	System.out.println("Is country equal to temp value :" + country.equals(tempValue));
	
	
	
	}

}
