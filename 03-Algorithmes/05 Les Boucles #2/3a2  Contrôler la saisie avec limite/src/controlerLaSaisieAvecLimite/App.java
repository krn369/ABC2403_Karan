package controlerLaSaisieAvecLimite;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declare variables
		String motDePasseSaisi;
		int nombreEssais = 0;
		boolean motDePasseCorrect = false;

		// Loop for password entry and validation (maximum 3 attempts)
		while (nombreEssais < 3 && !motDePasseCorrect) {
			nombreEssais++;

			System.out.print("Saisissez votre mot de passe (" + (4 - nombreEssais) + ") essais maximum) : ");
			motDePasseSaisi = sc.nextLine();

			// Check if the password is correct
			if (motDePasseSaisi.equals("formation")) {
				motDePasseCorrect = true;
			} else {
				System.out.println("Mot de passe incorrect. Veuillez recommencer.");
			}
		}

		// Check if the login was successful
		if (motDePasseCorrect) {
			System.out.println("\nVous êtes connecté !");
		} else {
			System.out.println("\nVotre compte est bloqué.");
		}
		sc.close();
	}

}
