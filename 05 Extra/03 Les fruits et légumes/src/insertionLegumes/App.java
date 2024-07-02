package insertionLegumes;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Création d'un tableau pour stocker les noms des fruits et légumes
        String[] fruitsLegumes = new String[10];

        // Création d'un tableau pour stocker les prix au kilo
        double[] prixKilo = new double[10];

        // Variable pour stocker le nombre de fruits et légumes saisis
        int nbFruitsLegumes = 0;

        // Saisie des fruits et légumes
        while (nbFruitsLegumes < fruitsLegumes.length) {
            System.out.print("Saisissez le nom d'un fruit ou légume (ou \"go\" pour terminer) : ");
            String nomFruitLegume = sc.nextLine();

            if (nomFruitLegume.equals("go")) {
                break;
            }

            System.out.print("Saisissez le prix au kilo : ");
            double prix = sc.nextDouble();

            fruitsLegumes[nbFruitsLegumes] = nomFruitLegume;
            prixKilo[nbFruitsLegumes] = prix;

            nbFruitsLegumes++;

            sc.nextLine(); // Consommer le retour chariot
        }

        // Affichage de la liste des fruits et légumes
        System.out.println("\nListe des fruits et légumes :");
        for (int i = 0; i < nbFruitsLegumes; i++) {
            System.out.printf("1 kilogramme de %s coûte %.2f euros.\n", fruitsLegumes[i], prixKilo[i]);
        }

        // Recherche du légume le moins cher
        int indiceFruitsLegumeMoinsCher = 0;
        for (int i = 1; i < nbFruitsLegumes; i++) {
            if (prixKilo[i] < prixKilo[indiceFruitsLegumeMoinsCher]) {
                indiceFruitsLegumeMoinsCher = i;
            }
        }

        // Affichage du légume le moins cher
        System.out.println("\nLégume le moins cher au kilo : " + fruitsLegumes[indiceFruitsLegumeMoinsCher]);
		
		

	}

}
