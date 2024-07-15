package conversionKmMiles;

import java.util.Scanner;

public class App {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input; // Declare a String variable to store the user input
	        double kilometres;

	        do {
	            System.out.print("Saisissez une valeur en kilomètres (entre 0.01 et 1 000 000) ou 'q' pour quitter : ");
	            input = scanner.nextLine(); // Read the entire line as a string

	            if (input.equalsIgnoreCase("q")) {
	                System.out.println("Au revoir!");
	                break; // Exit the loop if the user enters "q" (case-insensitively)
	            }

	            try {
	                kilometres = Double.parseDouble(input);  // Convert the string to a double
	                if (kilometres < 0.01 || kilometres > 1000000) {
	                    System.out.println("Erreur : valeur saisie invalide. Veuillez réessayer.");
	                } else {
	                    // Valid number entered, proceed with conversion and output
	                    double miles = kilometres * 1.609;
	                    System.out.printf("%.2f kilomètres équivaut à %.2f miles.\n", kilometres, miles);
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Erreur : format de valeur invalide. Veuillez saisir un nombre.");
	            }
	        } while (true); // Loop indefinitely (user can exit with 'q')
	    }
	}