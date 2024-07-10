package compteurValeurs;

import java.util.Scanner;

public class App {

    // Main program
    public static void main(String[] args) {
        int[] valeurs = recupererValeurs(); // Get values from the user

        int[] resultats = compterPositifsNegatifs(valeurs); // Count positive and negative values

        System.out.println("\nNombre de valeurs saisies : " + valeurs.length);
        System.out.println("Nombre de valeurs positives : " + resultats[0]);
        System.out.println("Nombre de valeurs négatives : " + resultats[1]);

        incrementerValeurs(valeurs); // Increment values in the array

        System.out.println("\nTableau des valeurs avec 1 ajouté à chaque élément:");
        for (int valeur : valeurs) {
            System.out.print(valeur + " ");
        }
    }

    // Method to get values from the user
    static int[] recupererValeurs() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Combien de valeurs voulez-vous saisir ? ");
        int nbValeurs;

        // Validate user input to ensure a positive integer
        do {
            nbValeurs = sc.nextInt();
            if (nbValeurs <= 0) {
                System.out.println("Veuillez saisir un nombre positif d'éléments.");
            }
        } while (nbValeurs <= 0);

        int[] valeurs = new int[nbValeurs];

        for (int i = 0; i < nbValeurs; i++) {
            System.out.print("Saisissez la valeur " + (i + 1) + " : ");
            valeurs[i] = sc.nextInt();
        }

        sc.close();
        return valeurs;
    }

    // Method to count positive and negative values
    static int[] compterPositifsNegatifs(int[] valeurs) {
        int nbPositifs = 0;
        int nbNegatifs = 0;

        for (int valeur : valeurs) {
            if (valeur > 0) {
                nbPositifs++;
            } else if (valeur < 0) {
                nbNegatifs++;
            }
        }

        return new int[]{nbPositifs, nbNegatifs};
    }

    // Method to increment values in the array
    static void incrementerValeurs(int[] valeurs) {
        if (valeurs.length == 0) {
            System.out.println("Attention : le tableau est vide.");
            return;
        }

        for (int i = 0; i < valeurs.length; i++) {
            valeurs[i]++;
        }
    }
}