
package laBonnePlageDeGalets;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nombreSaisi;
		boolean estValid = false;

		do {
			System.out.print("Saisissez un nombre entre 10 et 20: ");
			nombreSaisi = sc.nextInt();
			estValid = (nombreSaisi >= 10 && nombreSaisi <= 20);

			if (!estValid) {
				System.out.println("Erreur !!! ");
				// Add hint based on the number entered
				if (nombreSaisi > 20) {
					System.out.println("Essayez un plus petit...");
				} else {
					System.out.println("Essayez un plus grand...");
				}
			}

		} while (!estValid);

		/*
		 * int nombreSaisi; boolean estDansPlage; int compteur = 1;
		 * 
		 * do {
		 * 
		 * if (compteur == 1) {
		 * System.out.print("Saisissez un nombre entre 10 et 20: "); }
		 * 
		 * nombreSaisi = sc.nextInt(); compteur++;
		 * 
		 * estDansPlage = (nombreSaisi >= 10 && nombreSaisi <= 20);
		 * 
		 * if (compteur > 1 && !estDansPlage) {
		 * System.out.println("Erreur !!!, Resaisissez un nombre entre 10 et 20");
		 * 
		 * if (nombreSaisi > 20) { System.out.println(" Essayez Plus Petit !!"); } else
		 * { System.out.println("Essayez Plus Grand !!"); } }
		 * 
		 * } while (nombreSaisi < 10 || nombreSaisi > 20);
		 */

		System.out.println(nombreSaisi + ", Yes, you did it ! You are in the good area. ");

		sc.close();
	}

}
