package etLePlusGrandEstEncore;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Déclaration des variables
        int nombreCourant;
        int plusGrandNombre = Integer.MIN_VALUE;
        int numeroDuPlusGrandNombre = 0;
        int compteurNombres = 0;

        // Boucle pour lire les nombres jusqu'à l'entrée d'un 0
        while (nombreCourant != 0) { 
            compteurNombres++;
            System.out.print("Entrez le nombre numéro " + compteurNombres + " (0 pour quitter) : ");
            nombreCourant = scanner.nextInt();

        
            if (nombreCourant > plusGrandNombre) {
                plusGrandNombre = nombreCourant;
                numeroDuPlusGrandNombre = compteurNombres;
            }
        }

        // Vérifier si au moins un nombre a été saisi
        if (compteurNombres == 0) {
            System.out.println("Aucun nombre n'a été saisi.");
        } else {
            // Afficher le plus grand nombre et son numéro
            System.out.println("Le plus grand des nombres saisis est : " + plusGrandNombre);
            System.out.println("Il s'agit du nombre numéro " + numeroDuPlusGrandNombre);
        }
	        
	        scanner.close();
	}

}
