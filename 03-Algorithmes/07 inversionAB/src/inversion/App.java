package inversion;

import java.util.Scanner; // Importer la classe Scanner pour lire les entrées utilisateur

public class App {

	public static void main(String[] args) {
		
		// Déclaration des variables
		
        int a, b, c; // Déclarer trois variables entières pour stocker les nombres et la valeur temporaire

        // Créer un objet Scanner pour lire les entrées
        Scanner sc = new Scanner(System.in);

        // Demander et lire le premier nombre
        System.out.print("Veuillez saisir un premier nombre (A): ");
        a = sc.nextInt();

        // Demander et lire le second nombre
        System.out.print("Veuillez saisir un second nombre (B): ");
        b = sc.nextInt();

        // Afficher les valeurs originales
        System.out.printf("La valeur originale de A est: %d et de B est: %d\n", a, b);

        // Inverser les valeurs
        c = a; // Stocker la valeur de A dans une variable temporaire
        a = b; // Affecter la valeur de B à A
        b = c; // Affecter la valeur stockée temporairement (la valeur originale de A) à B

        // Afficher les valeurs inversées
        System.out.printf("L'inverse valeur de A est: %d et de B est: %d\n", a, b);
        
        sc.close();
        

	}

}
