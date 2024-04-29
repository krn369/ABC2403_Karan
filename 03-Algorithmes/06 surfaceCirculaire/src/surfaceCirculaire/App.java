package surfaceCirculaire;

import java.util.Scanner; // Importer la classe Scanner pour lire les entrées utilisateur

public class App {

	public static void main(String[] args) {


	    // Déclaration des variables
		
        double rayon;
        int angle;
        double secteur;

        // Créer un objet Scanner pour lire les entrées
        
        Scanner sc = new Scanner(System.in);

        // Demander et lire le rayon du cercle
        System.out.print("Veuillez saisir le rayon du cercle: ");
        rayon = sc.nextDouble();

        // Demander et lire l'angle du secteur en degrés
        System.out.print("Veuillez saisir l'angle du secteur (en degrés): ");
        angle = sc.nextInt();

        // Calculer la surface du secteur
        secteur = (Math.PI * rayon * rayon * angle) / 360;

        // Afficher le résultat
        System.out.printf("L'aire du secteur circulaire est: %.2f\n", secteur);
        //%.2f: Il s'agit d'un formatteur qui indique que la valeur de la variable secteur doit être affichée sous forme de nombre flottant avec deux chiffres après la virgule.
        

	}

}
