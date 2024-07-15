package conversionKmMiles2;

import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);

    double value;
    String unit; 

    do {
        System.out.print("Saisissez une valeur (entre 0.01 et 1 000 000) et son unité (km ou mi) : ");
        value = scanner.nextDouble();
        unit = scanner.next().toUpperCase(); // Convertir l'unité en majuscules pour la comparaison

        if (value < 0.01 || value > 1000000 || (!unit.equals("KM") && !unit.equals("MI"))) {
            System.out.println("Erreur : valeur ou unité invalide. Veuillez réessayer.");
        }
    } while (true); // Remove the extra semicolon here

    double result;
    if (unit.equals("KM")) {
        result = value * 1.609;
        System.out.printf("%.2f km équivaut à %.2f miles.\n", value, result);
    } else {
        result = value / 1.609;
        System.out.printf("%.2f miles équivaut à %.2f km.\n", value, result);
    }
}
}