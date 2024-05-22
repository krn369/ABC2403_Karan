package bicyclette;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Déclaration des variables
        boolean beauTemps;
        boolean veloOK;
        boolean reparationImmediates;
        boolean livrePossede;
        boolean livreDispoBibliotheque;

        // Lecture de la condition météo
        System.out.print("Fera-t-il beau demain? (Oui/Non): ");
        beauTemps = scanner.nextLine().equalsIgnoreCase("Oui");

        // Détermination de l'activité en fonction du beau temps
        if (beauTemps) {
            // Le vélo est-il en bon état ?
            System.out.print("Le vélo est-il en bon état ? (Oui/Non): ");
            veloOK = scanner.nextLine().equalsIgnoreCase("Oui");

            if (veloOK) {
                // Balade à vélo
                System.out.println("Vous allez faire une balade à vélo.");
            } else {
                // Réparation du vélo
                System.out.println("Vous allez faire réparer votre vélo.");

                // Les réparations seront-elles immédiates ?
                System.out.print("Les réparations seront-elles immédiates ? (Oui/Non): ");
                reparationImmediates = scanner.nextLine().equalsIgnoreCase("Oui");

                if (reparationImmediates) {
                    // Balade à vélo après réparation immédiate
                    System.out.println("Vous allez faire une balade à vélo après réparation.");
                } else {
                    // Balade à pied à l'étang
                    System.out.println("Vous irez à pied à l'étang pour cueillir des joncs.");
                }
            }
        } else {
            // Journée lecture
            System.out.println("Vous allez passer la journée à lire.");

            // Possédez-vous le premier tome de Game of Thrones ?
            System.out.print("Possédez-vous le premier tome de Game of Thrones ? (Oui/Non): ");
            livrePossede = scanner.nextLine().equalsIgnoreCase("Oui");

            if (livrePossede) {
                // Relecture du premier tome de Game of Thrones
                System.out.println("Vous allez relire le premier tome de Game of Thrones.");
            } else {
                // Recherche du livre à la bibliothèque
                System.out.println("Vous allez chercher le livre à la bibliothèque.");

                // Le livre est-il disponible à la bibliothèque ?
                System.out.print("Le livre est-il disponible à la bibliothèque ? (Oui/Non): ");
                livreDispoBibliotheque = scanner.nextLine().equalsIgnoreCase("Oui");

                if (livreDispoBibliotheque) {
                    // Emprunt du premier tome de Game of Thrones
                    System.out.println("Vous allez emprunter le premier tome de Game of Thrones.");
                } else {
                    // Emprunt d'un roman policier
                    System.out.println("Vous allez emprunter un roman policier.");
                }
                System.out.println("Vous allez rentrer chez vous.");
                System.out.println("Vous allez lire votre livre dans le fauteil.");
            }
        }
        scanner.close();

		/*
		 * // Déclaration des variables boolean beauTemps; boolean veloOk; boolean
		 * reparationsImmediates; boolean livrePossede; boolean livreDispoBibliotheque;
		 * 
		 * // Traitement if (beauTemps) { System.out.println("Je vais me ballader");
		 * 
		 * if (veloOk) { System.out.println("J'irai me ballader à bicyclette"); } else {
		 * System.out.println("Je vais chez le garagiste");
		 * 
		 * if (reparationsImmediates) {
		 * System.out.println("J'irai me ballader à bicyclette"); } else {
		 * System.out.println("J'irai cueillir des joncs"); } } } else {
		 * System.out.println("Je vais lire un livre");
		 * 
		 * if (!livrePossede) { System.out.println("Je vais à la bibliothèque");
		 * 
		 * if (livreDispoBibliotheque) { System.out.println("J'emprunte GoT"); } else {
		 * System.out.println("J'emprunte un roman policier"); }
		 * 
		 * System.out.println("Je rentre chez moi"); } else {
		 * System.out.println("Je lis GoT"); }
		 * 
		 * System.out.println("Lecture de mon livre dans le fauteuil"); }
		 */

	}

}
