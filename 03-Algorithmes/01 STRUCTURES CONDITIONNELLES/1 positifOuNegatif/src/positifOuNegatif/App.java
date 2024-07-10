package positifOuNegatif;

import java.util.Scanner; // Importer la classe Scanner pour lire les entrées utilisateur

public class App {

	public static void main(String[] args) {
		
		// Déclaration de la variable
        int nombreEntier;
        

        // Créer un objet Scanner pour lire les entrées
        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre
        System.out.print("Saisissez un nombre entier: ");
        nombreEntier = sc.nextInt();

        // Déterminer si le nombre est positif ou négatif
        
        if (nombreEntier > 0) { // Si nombreEntier est supérieur  à 0
            System.out.println("Ce nombre est positif");
        }
            
       else if (nombreEntier < 0) { // Si nombreEntier est inférieur  à 0
            System.out.println("Ce nombre est négatif");      
        } 
        
        else {
            System.out.println("Ce nombre est ni positif et ni négatif"); //sinon
        }
        
        sc.close();
        
	}

	}
