package jeuDeLaFourchette;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		 Random random = new Random();
	        Scanner scanner = new Scanner(System.in);

	        // Generate the mystery number
	        int nombreMystere = random.nextInt(101); // Range: 0 to 100 (inclusive)

	        // Main game loop
	        int nombreEssais = 0;
	        boolean trouve = false;
	        while (!trouve) {
	            nombreEssais++;

	            System.out.print("Saisissez un nombre entre 0 et 100 : ");
	            int nombreChoisi = scanner.nextInt();

	            if (nombreChoisi == nombreMystere) {
	                trouve = true;
	            } else {
	                if (nombreChoisi < nombreMystere) {
	                    System.out.println("Le nombre mystère est supérieur à " + nombreChoisi + ".");
	                } else {
	                    System.out.println("Le nombre mystère est inférieur à " + nombreChoisi + ".");
	                }
	            }
	        }

	        // Display the final result
	        System.out.println("\nBravo, vous avez trouvé le nombre mystère en " + nombreEssais + " essais !");
	        
	        scanner.close();
	}

}
