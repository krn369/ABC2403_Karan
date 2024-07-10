package exerciceMath;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
    	
    	// Déclaration des variables
    	
        double rayon;
        double aire;
        double volume;

        // Créer un objet Scanner pour lire les entrées
        Scanner sc = new Scanner(System.in);

        // Demander et lire le rayon
        System.out.print("Veuillez entrer un rayon de la sphère: ");
        rayon = sc.nextDouble();

        // Calculer l'aire
        aire = 4 * Math.PI * rayon * rayon; // Math.PI est la constante pi

        // Calculer le volume
        volume = (4 * Math.PI * rayon * rayon * rayon) / 3;

        // Afficher les résultats
        System.out.printf("L'aire de la sphère est: %.2f\n", aire);
        System.out.printf("Le volume de la sphère est: %.2f\n", volume);
        
    
    	sc.close();
    }	
    	 
    	
    	
       
}