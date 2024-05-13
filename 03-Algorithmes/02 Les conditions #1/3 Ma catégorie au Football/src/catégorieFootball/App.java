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
            
        } else if (age < 7) {
            categorie = "Débutant";
            
        } else if (age < 9) {
            categorie = "Poussin";
            
        } else if (age < 11) {
            categorie = "Benjamin";
            
        } else if (age < 13) {
            categorie = "Pupille";
            
        } else if (age < 15) {
            categorie = "Minime";
            
        } else if (age < 17) {
            categorie = "Cadet";
            
        } else if (age < 19) {
            categorie = "Junior";
            
        } else if (age < 35) {
            categorie = "Sénior";
            
        } else {
            categorie = "Vétéran";
        }

        // Afficher la catégorie d'âge
        System.out.println("Le joueur est dans la catégorie " + categorie + ".");	
        
        sc.close();

	}

}
