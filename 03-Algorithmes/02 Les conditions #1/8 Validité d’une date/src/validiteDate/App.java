package validiteDate;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Déclaration des variables
        int jour;
        int mois;
        int annee;
        boolean estValide;

        // Saisie des données
        System.out.print("Saisissez un jour: ");
        jour = sc.nextInt();

        System.out.print("Saisissez un mois: ");
        mois = sc.nextInt();

        System.out.print("Saisissez une année: ");
        annee = sc.nextInt();

        // Validation du jour
        if (jour < 1 || jour > 31) {
            estValide = false;
        } else {
            // Passer à la validation du mois si le jour est valide
            estValide = true;
        }

        // Validation du mois
        if (mois < 1 || mois > 12) {
            estValide = false;
        } else {
            // Passer à la validation de la date complète si le mois est valide
        }

        // Validation de la date complète
        if (estValide) {
            // Cas particulier pour février (mois = 2)
            if (mois == 2) {
                if ((annee % 4 == 0) && (annee % 100 != 0) || (annee % 400 == 0)) {
                    // Année bissextile
                    if (jour > 29) {
                        estValide = false;
                    }
                } else {
                    // Année non bissextile
                    if (jour > 28) {
                        estValide = false;
                    }
                }
            } else {
                // Cas pour les autres mois
                if ((mois == 4) || (mois == 6) || (mois == 9) || (mois == 11)) {
                    if (jour > 30) {
                        estValide = false;
                    }
                }
            }
        }

        // Affichage du résultat
        if (estValide) {
            System.out.println("La date saisie est valide.");
        } else {
            System.out.println("La date saisie est invalide.");
            
            sc.close();
        }
	}

}
