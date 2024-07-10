//# Exercice 4.5 : Somme des valeurs de 2 tableaux
//Écrire un algorithme qui respecte la demande suivante :
//
//Créer 2 tableaux d’entiers de même longueur.
//Créer un 3ème tableau dont les valeurs sont la somme des valeurs des 2 tableaux précédents.

package maximumMinimum;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        // Demander à l'utilisateur le nombre de valeurs (Ask the user for the number of values)
	        int nbValeurs = demanderNombreValeurs(sc);

	        // Déclaration et initialisation du tableau (Declare and initialize the array)
	        float[] valeurs = new float[nbValeurs];

	        // Saisie des valeurs par l'utilisateur (User input of values)
	        saisirValeurs(valeurs, sc);

	        // Déterminer le nombre maximal et minimal (Determine the maximum and minimum numbers)
	        float maximum = trouverMaximum(valeurs);
	        float minimum = trouverMinimum(valeurs);

	        // Affichage du nombre maximal et minimal (Display the maximum and minimum numbers)
	        afficherResultats(maximum, minimum);
	    }

	    // Fonction pour demander le nombre de valeurs à l'utilisateur (Function to ask the user for the number of values)
	    public static int demanderNombreValeurs(Scanner sc) {
	        System.out.print("Entrez le nombre de valeurs à saisir : ");
	        return sc.nextInt();
	    }

	    // Fonction pour saisir les valeurs dans le tableau (Function to enter values into the array)
	    public static void saisirValeurs(float[] valeurs, Scanner sc) {
	        System.out.println("Saisissez les valeurs : ");
	        for (int i = 0; i < valeurs.length; i++) {
	            valeurs[i] = sc.nextFloat();
	        }
	    }

	    // Fonction pour trouver le nombre maximal (Function to find the maximum number)
	    public static float trouverMaximum(float[] valeurs) {
	        float maximum = valeurs[0]; // Initialiser le maximum avec la première valeur du tableau
	        for (float valeur : valeurs) {
	            if (valeur > maximum) {
	                maximum = valeur;
	            }
	        }
	        return maximum;
	    }

	    // Fonction pour trouver le nombre minimal (Function to find the minimum number)
	    public static float trouverMinimum(float[] valeurs) {
	        float minimum = valeurs[0]; // Initialiser le minimum avec la première valeur du tableau
	        for (float valeur : valeurs) {
	            if (valeur < minimum) {
	                minimum = valeur;
	            }
	        }
	        return minimum;
	    }

	    // Fonction pour afficher les résultats (Function to display the results)
	    public static void afficherResultats(float maximum, float minimum) {
	        System.out.println("Le nombre maximal est : " + maximum);
	        System.out.println("Le nombre minimal est : " + minimum);
	    }
	}