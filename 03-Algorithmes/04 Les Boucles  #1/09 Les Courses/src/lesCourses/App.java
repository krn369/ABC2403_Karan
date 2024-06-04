package lesCourses;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Declare and initialize variables
		int nombreChevauxPartants;
		int nombreChevauxJoues;
		double chanceDansOrdre;
		double chanceDesordre;

		// Input validation for number of participating horses
		do {
			System.out.print("Saisissez le nombre de chevaux partants : ");
			nombreChevauxPartants = scanner.nextInt();
		} while (nombreChevauxPartants <= 0);

		// Input validation for number of horses bet on
		do {
			System.out.print("Saisissez le nombre de chevaux joués : ");
			nombreChevauxJoues = scanner.nextInt();
		} while (nombreChevauxJoues <= 0 || nombreChevauxJoues > nombreChevauxPartants);

		// Calculate probability of winning in exact order
		chanceDansOrdre = calculerFactorielle(nombreChevauxPartants)
				/ calculerFactorielle(nombreChevauxPartants - nombreChevauxJoues);

		// Calculate probability of winning in any order
		chanceDesordre = calculerFactorielle(nombreChevauxPartants) / (calculerFactorielle(nombreChevauxJoues)
				* calculerFactorielle(nombreChevauxPartants - nombreChevauxJoues));

		scanner.close();

		// Display probabilities
		System.out.println("\nProbabilités de gagner :");
		System.out.println("Dans l'ordre : une chance sur " + formatDouble(chanceDansOrdre) + " de gagner.");
		System.out.println("Dans le désordre : une chance sur " + formatDouble(chanceDesordre) + " de gagner.");
	}

	// Function to calculate factorial (recursive)
	private static long calculerFactorielle(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * calculerFactorielle(n - 1);
		}
	}

	// Function to format double value to two decimal places
	private static String formatDouble(double value) {
		return String.format("%.2f", value);

	}
}
