// # Exercice 4.4 : Somme des valeurs d’un tableau
// Écrire un algorithme calculant la somme des valeurs d’un tableau (on suppose que le tableau a été préalablement saisi avec 10 nombres réels (float)).


package sommeTableauMF;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Demander à l'utilisateur de saisir les nombres (Ask the user to enter the
		// numbers)
		float[] nombres = saisirNombres(sc);

		// Calculer la somme des nombres (Calculate the sum of the numbers)
		float somme = calculerSomme(nombres);

		// Afficher la somme (Display the sum)
		afficherSomme(somme);
	}

	// Fonction pour saisir les nombres dans le tableau (Function to enter numbers
	// into the array)
	public static float[] saisirNombres(Scanner sc) {
		float[] nombres = new float[10];

		System.out.println("Saisissez 10 nombres réels : ");
		for (int i = 0; i < nombres.length; i++) {
			nombres[i] = sc.nextFloat();
		}

		return nombres;
	}

	// Fonction pour calculer la somme des nombres (Function to calculate the sum of
	// the numbers)
	public static float calculerSomme(float[] nombres) {
		float somme = 0.0f;
		for (float nombre : nombres) {
			somme += nombre;
		}

		return somme;
	}

	// Fonction pour afficher la somme (Function to display the sum)
	public static void afficherSomme(float somme) {
		System.out.println("La somme des nombres est : " + somme);
	}

}
