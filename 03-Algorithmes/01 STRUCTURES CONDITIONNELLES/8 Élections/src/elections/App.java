package elections;

import java.util.Scanner; // Importer la classe Scanner pour lire les entrées utilisateur

public class App {

	public static void main(String[] args) {
		
		// Déclaration des variables
        double scoreCandidat1, scoreCandidat2, scoreCandidat3, scoreCandidat4;
        double seuilMajorite, seuilDeuxiemeTour;
        boolean estElu, estBallottageFavorable, estBallottageDefavorable, estBattu;

        // Créer un objet Scanner pour lire les entrées
        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur les scores des candidats
        System.out.print("Saisissez le score du candidat 1 (en %) : ");
        scoreCandidat1 = sc.nextDouble();
        System.out.print("Saisissez le score du candidat 2 (en %) : ");
        scoreCandidat2 = sc.nextDouble();
        System.out.print("Saisissez le score du candidat 3 (en %) : ");
        scoreCandidat3 = sc.nextDouble();
        System.out.print("Saisissez le score du candidat 4 (en %) : ");
        scoreCandidat4 = sc.nextDouble();

        // Définir les seuils
        seuilMajorite = 50;
        seuilDeuxiemeTour = 12.5;

        // Initialiser les variables booléennes
        estElu = false;
        estBallottageFavorable = false;
        estBallottageDefavorable = false;
        estBattu = false;

        // Déterminer le statut du candidat n°1
        if (scoreCandidat1 > seuilMajorite) {
            estElu = true;
        } 
        
        else if (scoreCandidat1 >= seuilDeuxiemeTour) {
            // Vérifier s'il est en tête parmi les candidats restants
            if (scoreCandidat1 > scoreCandidat2 && scoreCandidat1 > scoreCandidat3 && scoreCandidat1 > scoreCandidat4) {
                estBallottageFavorable = true;
            }
            
            else {
                estBallottageDefavorable = true;
            }
        } 
        
        else {
            estBattu = true;
        }

        // Afficher le statut du candidat n°1
        if (estElu) {
            System.out.println("Le candidat 1 est élu dès le premier tour.");
        } 
        
        else if (estBallottageFavorable) {
            System.out.println("Le candidat 1 est en ballottage favorable.");
        } 
        
        else if (estBallottageDefavorable) {
            System.out.println("Le candidat 1 est en ballottage défavorable.");
        } 
        
        else if (estBattu) {
            System.out.println("Le candidat 1 est battu.");
        }
        
        sc.close();

	}

}
