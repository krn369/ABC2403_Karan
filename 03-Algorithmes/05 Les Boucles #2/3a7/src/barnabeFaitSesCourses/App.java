package barnabeFaitSesCourses;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declare variables
		int argentDepart;
		int nombreMagasins = 0;
		int depenseParMagasin;

		// Get the initial amount of money
		System.out.print("Saisissez l'argent initial de Barnabé (en euros) : ");
		argentDepart = sc.nextInt();

		// Check if the initial amount is sufficient
		if (argentDepart <= 1) {
			System.out.println("Barnabé n'a pas pu faire d'achats.");
		} else {
			// Shopping loop
			while (argentDepart > 0) {
				nombreMagasins++;

				// Calculate the expense in the current store
				depenseParMagasin = (argentDepart / 2) + 1; // 1 € more than half

				// Update the remaining money
				argentDepart -= depenseParMagasin;

				/*
				 * POUR VERIFIER LA LOGIQUE
				 * System.out.println("\n €" + depenseParMagasin);
				 * System.out.println("magasins"+nombreMagasins); System.out.println("€" +
				 * argentDepart);
				 */
			}

			// Display the number of stores visited
			System.out.println("\nBarnabé a acheté dans " + nombreMagasins + " magasins.");
		}

		sc.close();
	}

}
