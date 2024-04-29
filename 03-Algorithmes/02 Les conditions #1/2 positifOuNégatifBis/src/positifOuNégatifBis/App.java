package positifOuNégatifBis;

import java.util.Scanner;  // // Importer la classe Scanner pour lire les entrées utilisateur
public class App {

	public static void main(String[] args) {
		
		 // Déclaration des variables
        int nombre1, nombre2, produit;

        // Créer un objet Scanner pour lire les entrées
        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur de saisir deux nombres
        System.out.print("Saisissez un premier nombre entier: ");
        nombre1 = sc.nextInt();

        System.out.print("Saisissez un second nombre entier: ");
        nombre2 = sc.nextInt();

        // Calculer le produit des deux nombres
        produit = nombre1 * nombre2;

        // Déterminer le signe du produit
        if (produit == 0) {
            System.out.println("Le produit est 0.");
        } else if (nombre1 > 0 && nombre2 > 0) {
            System.out.println("Le produit est positif.");
        } else if (nombre1 < 0 && nombre2 < 0) {
            System.out.println("Le produit est positif.");
        } else {
            System.out.println("Le produit est négatif.");
        }

        sc.close();
	}

}
