package compteurValeursMF;

import java.util.Scanner;

public class App {

	
		 // Method to get values from the user
        static int[] recupererValeurs(int nbValeurs) {
            Scanner sc = new Scanner(System.in);

            int[] valeurs = new int[nbValeurs];

            for (int i = 0; i < nbValeurs; i++) {
                System.out.print("Saisissez la valeur " + (i + 1) + " : ");
                valeurs[i] = sc.nextInt();
            }

            sc.close();
            return valeurs;
        }

        // Method to find the largest value and its position
      static  int[] trouverPlusGrandeValeur(int[] valeurs) {
            int plusGrandeValeur = valeurs[0]; // Initialize with first value
            int positionPlusGrandeValeur = 0;

            for (int i = 1; i < valeurs.length; i++) {
                if (valeurs[i] > plusGrandeValeur) {
                    plusGrandeValeur = valeurs[i];
                    positionPlusGrandeValeur = i;
                }
            }

            return new int[]{plusGrandeValeur, positionPlusGrandeValeur + 1}; // Position starts from 1, not 0
        }

        // Main program
        
        public static void main(String[] args) {
        	
        System.out.print("Combien de valeurs voulez-vous saisir ? ");
        int nbValeurs = new Scanner(System.in).nextInt();

        int[] valeurs = recupererValeurs(nbValeurs);

        int[] resultat = trouverPlusGrandeValeur(valeurs);

        System.out.println("\nLa plus grande valeur est : " + resultat[0]);
        System.out.println("Elle se situe à la position : " + resultat[1]);
    }
}
