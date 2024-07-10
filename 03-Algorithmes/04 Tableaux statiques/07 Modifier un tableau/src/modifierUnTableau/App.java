
//#Exercice 4.7 : Modifier un tableau
//Écrire un algorithme qui permet la saisie d’un nombre quelconque de valeurs, sur le principe de l’exercice 4.3.
//
//Toutes les valeurs doivent être ensuite augmentées de 1, et le nouveau tableau sera affiché à l’écran.



package modifierUnTableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// Get the number of values to input from the user
        System.out.print("Combien de valeurs voulez-vous saisir ? ");
        int nbValeurs = sc.nextInt();

        // Create a dynamic array based on the user's input
        int[] valeurs = new int[nbValeurs];

        // Get values from the user and store them in the array
        for (int i = 0; i < nbValeurs; i++) {
            System.out.print("Saisissez la valeur " + (i + 1) + " : ");
            valeurs[i] = sc.nextInt();
        }

        // Initialize counters for positive and negative values
        int nbPositifs = 0;
        int nbNegatifs = 0;

        // Count positive and negative values
        for (int valeur : valeurs) {
            if (valeur > 0) {
                nbPositifs++;
            } else if (valeur < 0) {
                nbNegatifs++;
            }
        }

        // Display the initial count of positive and negative values
        System.out.println("\nNombre de valeurs saisies : " + nbValeurs);
        System.out.println("Nombre de valeurs positives : " + nbPositifs);
        System.out.println("Nombre de valeurs négatives : " + nbNegatifs);

        // Increment each value in the array by 1
        for (int i = 0; i < valeurs.length; i++) {
            valeurs[i]++;
        }

        // Display the updated array
        System.out.println("\nTableau des valeurs avec 1 ajouté à chaque valeur:");
        for (int valeur : valeurs) {
            System.out.print(valeur + " ");
        }
        
        sc.close();

	}

}
