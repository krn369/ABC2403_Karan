package rechercheDesDiviseurs;

import java.util.*;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declare variables
		int nombre;
		int diviseur;

		// Prompt the user to enter a number
		System.out.print("Saisissez un nombre entier : ");
		nombre = sc.nextInt();
		
		sc.close();
		// Check if the number is less than or equal to 1
		if (nombre <= 1) {
			System.out.println("Le nombre n'a pas de diviseurs autres que 1 et lui-même.");
		} else {
			// Display divisors from 2 to the square root of the number
			System.out.print("\nDivisores : ");
			for (diviseur = 2; diviseur <= nombre; diviseur++) {
				// Check if the number is divisible by the divisor
				if (nombre % diviseur == 0) {
					System.out.print(diviseur + " ");
				}
			}
		}

		
	}

}
