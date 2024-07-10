package predisLavenir;

import java.util.Scanner; // Importer la classe Scanner pour lire les entrées utilisateur

public class App {

	public static void main(String[] args) {
		
		  // Déclaration des variables
        int heure, minutes, heure_plus_trois, minutes_plus_trois;

        // Créer un objet Scanner pour lire les entrées
        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur de saisir l'heure
        System.out.print("Saisissez l'heure (entre 0 et 23) : ");
        heure = sc.nextInt();

        // Vérifier si l'heure est dans la plage valide
        if (heure < 0 || heure > 23) {
            System.out.println("Les données saisies sont invalides.");
        } 
        else {
            // Demander à l'utilisateur de saisir les minutes
            System.out.print("Saisissez les minutes (entre 0 et 59) : ");
            minutes = sc.nextInt();

            // Vérifier si les minutes sont dans la plage valide
            if (minutes < 0 || minutes > 59) {
                System.out.println("Les données saisies sont invalides.");
            } 
            else {
                // Calculer les minutes après 3 minutes
                minutes_plus_trois = minutes + 3;

                // Ajuster les minutes si elles dépassent 59
                if (minutes_plus_trois > 59) {
                    minutes_plus_trois -= 60;
                    heure_plus_trois = heure + 1;
                } else {
                    heure_plus_trois = heure;
                }

                // Afficher l'heure après 3 minutes
                System.out.printf("Dans 3 minutes, il sera %d:%d.\n", heure_plus_trois, minutes_plus_trois);
            }
        }
		
        sc.close();
		
		
	}

}
