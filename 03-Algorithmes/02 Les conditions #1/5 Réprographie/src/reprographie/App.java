package reprographie;

import java.util.Scanner; // Importer la classe Scanner pour lire les entrées utilisateur

public class App {

	public static void main(String[] args) {
		
		// Déclaration des variables
		
        int nbPhotocopies;
        double prixTranche1, prixTranche2, prixTranche3;
        double montantTranche1, montantTranche2, montantTranche3;
        double montantTotal;

        // Créer un objet Scanner pour lire les entrées
        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur le nombre de photocopies
        System.out.print("Saisissez le nombre de photocopies: ");
        nbPhotocopies = sc.nextInt();

        // Définir les prix par tranche
        prixTranche1 = 0.10;
        prixTranche2 = 0.09;
        prixTranche3 = 0.08;

        // Calculer le nombre de photocopies dans chaque tranche
        if (nbPhotocopies <= 10) {
            montantTranche1 = nbPhotocopies * prixTranche1;
            montantTranche2 = 0;
            montantTranche3 = 0;
        } 
        
        else if (nbPhotocopies <= 30) {
            montantTranche1 = 10 * prixTranche1;
            montantTranche2 = (nbPhotocopies - 10) * prixTranche2;
            montantTranche3 = 0;
        }
        
        else {
            montantTranche1 = 10 * prixTranche1;
            montantTranche2 = 20 * prixTranche2;
            montantTranche3 = (nbPhotocopies - 30) * prixTranche3;
        }

        // Calculer le montant total
        montantTotal = montantTranche1 + montantTranche2 + montantTranche3;

        // Afficher le montant total
        System.out.printf("Le montant total de la facture est de: %.2f €.\n", montantTotal);
        
        sc.close();

	}

}
