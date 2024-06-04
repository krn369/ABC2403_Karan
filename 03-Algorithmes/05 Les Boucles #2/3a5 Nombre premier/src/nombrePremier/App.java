package nombrePremier;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declare variables
		int nombre;
		int diviseur;
		boolean estPremier = true;

		// Prompt the user to enter a number
		System.out.print("Saisissez un nombre entier : ");
		nombre = sc.nextInt();

		sc.close();

		// Check if the number is less than or equal to 1
		if (nombre <= 1) {
			estPremier = false;
		} else {
			// Check for divisibility from 2 to the square root of the number
			for (diviseur = 2; diviseur <= Math.sqrt(nombre); diviseur++) {
				if (nombre % diviseur == 0) {
					estPremier = false;
					break; // No need to continue checking if a divisor is found
				}
			}
		}

		// Display the result
		if (estPremier) {
			System.out.println(nombre + " est un nombre premier.");
		} else {
			System.out.println(nombre + " n'est pas un nombre premier.");
		}

	}

}
