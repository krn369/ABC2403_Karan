//# Exercice 4.6 : Somme des valeurs de 2 tableaux
//Toujours à partir de deux tableaux d’entiers précédemment saisis, écrivez un algorithme qui calcule la somme des produits des deux tableaux. Pour calculer le résultat, il faut multiplier chaque élément du tableau 1 par chaque élément du tableau 2, et additionner le tout.


package sommeTableauxMF;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        // Demander la taille des tableaux à l'utilisateur (Ask the user for the size of the arrays)
        System.out.print("Entrez la taille des tableaux : ");
        int taille = sc.nextInt();

        // Lire les valeurs du premier tableau (Read values for the first array)
        float[] tableau1 = new float[taille];
        System.out.println("Entrez les valeurs du tableau 1 :");
        for (int i = 0; i < taille; i++) {
            tableau1[i] = sc.nextFloat();
        }

        // Lire les valeurs du deuxième tableau (Read values for the second array)
        float[] tableau2 = new float[taille];
        System.out.println("Entrez les valeurs du tableau 2 :");
        for (int i = 0; i < taille; i++) {
            tableau2[i] = sc.nextFloat();
        }

        // Calculer la somme des tableaux (Calculate the sum of the arrays)
        float[] sommeTableaux = calculerSomme(tableau1, tableau2);

        // Afficher la somme des tableaux (Print the sum of the arrays)
        System.out.println("Somme des tableaux :");
        for (float valeur : sommeTableaux) {
            System.out.print(valeur + " ");
        }
    }

    // Fonction pour calculer la somme de deux tableaux (Function to calculate the sum of two arrays)
    private static float[] calculerSomme(float[] tableau1, float[] tableau2) {
        float[] sommeTableaux = new float[tableau1.length];
        for (int i = 0; i < tableau1.length; i++) {
            sommeTableaux[i] = tableau1[i] + tableau2[i];
        }
        return sommeTableaux;
    }
}
