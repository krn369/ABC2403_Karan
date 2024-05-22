package laFactorielle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Déclaration des variables
        int nombre;
        int fact = 1;
        int i;

        // Demander à l'utilisateur de saisir un nombre
        System.out.print("Saisissez un nombre: ");
        nombre = scanner.nextInt();

        // Vérifier si le nombre est négatif
        if (nombre < 0) {
            System.out.println("La factorielle n'est pas définie pour les nombres négatifs.");
        } else {
            // Calculer la factorielle
            for (i = 1; i <= nombre; i++) {
                fact *= i;
            }

            // Afficher la factorielle calculée
            System.out.println("La factorielle de " + nombre + " est : " + fact);
        }
	}

}
