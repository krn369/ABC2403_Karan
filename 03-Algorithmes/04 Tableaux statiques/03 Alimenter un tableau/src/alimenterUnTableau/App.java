package alimenterUnTableau;

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
	        int nbNeutre = 0;

	        // Count positive and negative values
	        for (int valeur : valeurs) {
	            if (valeur > 0) {
	                nbPositifs++;
	            } else if (valeur < 0) {
	                nbNegatifs++;
	            }
	            else {
					nbNeutre++;
				}
	        }

	        // Display the results
	        System.out.println("\nNombre de valeurs saisies : " + nbValeurs);
	        System.out.println("Nombre de valeurs positives : " + nbPositifs);
	        System.out.println("Nombre de valeurs négatives : " + nbNegatifs);
	        System.out.println("Nombre de valeurs neutre : " + nbNeutre);
	}

}
