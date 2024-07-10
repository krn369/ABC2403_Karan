package paiementEtRenduMonnaie;

import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
        // Declare and initialize variables
        double prixCourant;
        double sommeTotale = 0.0;
        int nombreBillets5Euros = 0;
        double resteAPayer = 0.0;
        int piece2Euros = 0;
        int piece20Centimes = 0;
        int piece10Centimes = 0;

        // Input loop for prices until user enters 0
        while (true) {
            System.out.print("Saisissez un prix (0 pour quitter) : ");

            // Validate user input (handle non-numeric input)
            if (!sc.hasNextDouble()) {
                System.out.println("Erreur: Veuillez saisir un nombre.");
                sc.nextLine(); // Clear the buffer to avoid infinite loop
                continue;
            }

            prixCourant = sc.nextDouble();

            if (prixCourant == 0) {
                break; // Exit loop if user enters 0
            }

            sommeTotale += prixCourant;
        }

        // Calculate number of 5 euro bills
        nombreBillets5Euros = (int) Math.floor(sommeTotale / 5.0);

        // Calculate remaining amount after 5 euro bills
        resteAPayer = sommeTotale - (nombreBillets5Euros * 5.0);

        // Display payment summary
        System.out.println("\nLe client doit payer : " + sommeTotale + " Euros.");
        System.out.println("Le client doit donner " + nombreBillets5Euros + " billets de 5 Euros soit " + (nombreBillets5Euros * 5.0) + " Euros.");

        // Distribute coins and count their number
        while (resteAPayer >= 2.0) {
            resteAPayer -= 2.0;
            piece2Euros++;
        }

        while (resteAPayer >= 0.5) {
            resteAPayer -= 0.5;
            piece20Centimes++;
        }

        while (resteAPayer >= 0.1) {
            resteAPayer -= 0.1;
            piece10Centimes++;
        }

        // Display coin distribution
        System.out.println("\nRépartition de la monnaie à restituer au client :");
        if (piece2Euros > 0) {
            System.out.println(" - " + piece2Euros + " pièce(s) de 2 Euros");
        }
        if (piece20Centimes > 0) {
            System.out.println(" - " + piece20Centimes + " pièce(s) de 0.20 Euros");
        }
        if (piece10Centimes > 0) {
            System.out.println(" - " + piece10Centimes + " pièce(s) de 0.10 Euros");
        }
        sc.close();
	}

}
