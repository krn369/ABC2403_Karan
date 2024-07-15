package temperatureConversion1;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value;
        String unit;

        do {
            System.out.print("Saisissez une valeur numérique entre -459.67 et 5 000 000 suivie de l'unité de température (C pour Celsius ou F pour Fahrenheit) : ");
            String input = scanner.nextLine().toUpperCase();

            try {
                String[] parts = input.split(" "); // Split input into value and unit
                value = Double.parseDouble(parts[0]); // Parse value to double
                unit = parts[1]; // Extract unit

                if (!validateInput(value, unit)) {
                    System.out.println("Erreur : valeur ou unité invalide. Veuillez réessayer.");
                    continue; // Skip to next iteration of the loop
                }

                double result = convert(value, unit);
                System.out.printf("%.2f %s équivaut à %.2f %s.\n", value, unit, result, getOppositeUnit(unit));
                break; // Exit the loop after successful conversion

            } catch (NumberFormatException e) {
                System.out.println("Erreur : format de valeur invalide. Veuillez saisir un nombre.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erreur : format d'entrée invalide. Veuillez séparer la valeur et l'unité par un espace.");
            }

        } while (true);
        
        scanner.close();
    }

    // Function to validate user input (value and unit)
    private static boolean validateInput(double value, String unit) {
        return value >= -459.67 && value <= 5000000 && (unit.equals("C") || unit.equals("F"));
    }

    // Function to get the opposite unit based on the provided unit
    private static String getOppositeUnit(String unit) {
        return unit.equals("C") ? "F" : "C";
    }

    // Function to perform the conversion based on value and unit
    private static double convert(double value, String unit) {
        if (unit.equals("C")) {
            return (value - 32) * 5 / 9;
        } else {
            return (value * 9 / 5) + 32;
        }
    }
}