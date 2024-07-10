//Exercice 4.8 : Recherche dans un tableau
//Écrire un algorithme permettant, toujours sur le même principe, à l’utilisateur de saisir un nombre déterminé de valeurs.
//Le programme, une fois la saisie terminée, renvoie la plus grande valeur en précisant quelle position elle occupe dans le tableau. On prendra soin d’effectuer la saisie dans un premier temps, et la recherche de la plus grande valeur du tableau dans un second temps.

package plusGrandeValeurTableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Get the number of values to input from the user
		System.out.print("Combien de valeurs voulez-vous saisir ? ");
		int nbValeurs = scanner.nextInt();

		// Create a dynamic array based on the user's input
		int[] valeurs = new int[nbValeurs];

		// Get values from the user and store them in the array
		for (int i = 0; i < nbValeurs; i++) {
			System.out.print("Saisissez la valeur " + (i + 1) + " : ");
			valeurs[i] = scanner.nextInt();
		}

		// Initialize variables for the largest value and its position
		int largestValue = valeurs[0]; // Assume first element is largest
		int position = 0;

		// Find the largest value and its position
		for (int i = 1; i < nbValeurs; i++) {
			if (valeurs[i] > largestValue) {
				largestValue = valeurs[i];
				position = i;
			}
		}

		// Display the largest value and its position
		System.out.println("\nLa plus grande valeur est : " + largestValue);
		System.out.println("Elle se trouve à la position : " + (position + 1));

		scanner.close();
	}

}
