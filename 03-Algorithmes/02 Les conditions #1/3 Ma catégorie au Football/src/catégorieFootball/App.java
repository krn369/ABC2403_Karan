package catégorieFootball;

import java.util.Scanner; // Importer la classe Scanner pour lire les entrées utilisateur

public class App {

	public static void main(String[] args) {
		
		// Déclaration des variables
        int age;
        String categorie;

        // Créer un objet Scanner pour lire les entrées
        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur de saisir l'âge
        System.out.print("Saisissez l'âge du joueur: ");
        age = sc.nextInt();

        // Déterminer la catégorie d'âge
        if (age < 5) {
            categorie = "Trop jeune";
        } else if (age >= 5 && age <= 6) {
            categorie = "Débutant";
        } else if (age >= 7 && age <= 8) {
            categorie = "Poussin";
        } else if (age >= 9 && age <= 10) {
            categorie = "Benjamin";
        } else if (age >= 11 && age <= 12) {
            categorie = "Pupille";
        } else if (age >= 13 && age <= 14) {
            categorie = "Minime";
        } else if (age >= 15 && age <= 16) {
            categorie = "Cadet";
        } else if (age >= 17 && age <= 18) {
            categorie = "Junior";
        } else if (age >= 19 && age <= 34) {
            categorie = "Sénior";
        } else {
            categorie = "Vétéran";
        }

        // Afficher la catégorie d'âge
        System.out.printf("Le joueur est dans la catégorie %s.\n", categorie);	
        
        sc.close();

	}

}
