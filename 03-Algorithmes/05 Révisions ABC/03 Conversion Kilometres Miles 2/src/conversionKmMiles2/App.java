package conversionKmMiles2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Saisissez une valeur (entre 0.01 et 1 000 000) et son unité (km ou mi) : ");
            String input = scanner.nextLine();

            double value;
            String unit = extractUnit(input); // Extract unit from input using a function

            if (!isValidInput(value = getValue(input), unit)) {
                System.out.println("Erreur : valeur ou unité invalide. Veuillez réessayer.");
                continue; // Skip to next iteration of the loop
            }

            double result = convert(value, unit);
            System.out.printf("%.2f %s équivaut à %.2f %s.\n", value, unit, result, getOppositeUnit(unit));
            break; // Exit the loop after successful conversion

        } while (true);
        
        scanner.close();
    }

    // Function to extract unit from input string
    private static String extractUnit(String input) {
        return input.substring(input.length() - 2).toUpperCase(); // Extract last two characters and convert to uppercase
    }

    // Function to get the opposite unit based on the provided unit
    private static String getOppositeUnit(String unit) {
        return unit.equals("KM") ? "MI" : "KM";
    }

    // Function to validate user input (value and unit)
    private static boolean isValidInput(double value, String unit) {
        return value >= 0.01 && value <= 1000000 && (unit.equals("KM") || unit.equals("MI"));
    }

    // Function to extract the numerical value from the input string (assuming a valid format)
    private static double getValue(String input) {
        return Double.parseDouble(input.substring(0, input.length() - 2)); // Extract everything except the last two characters
    }

    // Function to perform the conversion based on value and unit
    private static double convert(double value, String unit) {
        return unit.equals("KM") ? value * 1.609 : value / 1.609;
    }
}