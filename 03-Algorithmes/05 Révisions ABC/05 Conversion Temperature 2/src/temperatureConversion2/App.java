package temperatureConversion2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String unit;
        double minValue, maxValue;

        do {
            System.out.print("Saisissez une unité de mesure (C ou F) ou quit pour quitter : ");
            unit = scanner.nextLine().toUpperCase();

            if (unit.equals("QUIT")) {
                System.out.println("Au revoir!");
                break; // Exit the loop if the user enters "quit"
            }

            if (!unit.equals("C") && !unit.equals("F")) {
                System.out.println("Erreur : unité invalide. Veuillez saisir C ou F.");
                continue; // Skip to next iteration if invalid unit is entered
            }

            System.out.print("Saisissez la valeur minimale de la plage : ");
            minValue = scanner.nextDouble();
            System.out.print("Saisissez la valeur maximale de la plage : ");
            maxValue = scanner.nextDouble();

            if (minValue > maxValue) {
                System.out.println("Erreur : la valeur minimale ne peut pas être supérieure à la valeur maximale.");
                continue; // Skip to next iteration if minimum is greater than maximum
            }

            System.out.printf("Conversion de la plage %s à %s %s:\n", minValue, maxValue, unit);
            for (double value = minValue; value <= maxValue; value++) {
                double convertedValue = convert(value, unit);
                System.out.printf("%.2f %s équivaut à %.2f %s.\n", value, unit, convertedValue, getOppositeUnit(unit));
            }

        } while (true);
    }

    // Function to get the opposite unit based on the provided unit
    private static String getOppositeUnit(String unit) {
        return unit.equals("C") ? "F" : "C";
    }

    // Function to perform the conversion based on value and unit (corrected)
    private static double convert(double value, String unit) {
        if (unit.equals("C")) {
            return (value * 9 / 5) + 32; // conversion for Celsius to Fahrenheit
        } else {
            return (value - 32) * 5 / 9; // Corrected conversion for Fahrenheit to Celsius
        }
    }
}