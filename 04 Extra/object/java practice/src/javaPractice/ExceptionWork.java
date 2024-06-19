package javaPractice;

import java.util.Scanner;

public class ExceptionWork {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter the first number");
			int n1 = sc.nextInt();
			
			System.out.println("Enter the second number.");
			int n2 = sc.nextInt();
			
			int sum = n1+n2;
			
			System.out.println("The sum is " + sum);
			
		} catch (Exception e) {
			System.out.println("Please enter the numbers olny");
		}
		
		finally {
			
			System.out.println("At last ");
		}
	}

}
