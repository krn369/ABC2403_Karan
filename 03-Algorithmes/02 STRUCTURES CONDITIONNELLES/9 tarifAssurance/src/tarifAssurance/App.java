package tarifAssurance;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez l'âge : ");
        int age = sc.nextInt();

        System.out.print("Entrez les années de permis : ");
        int anneesPermis = sc.nextInt();

        System.out.print("Nombre d'accidents : ");
        int nombreAccidents = sc.nextInt();

        System.out.print("Années en tant que client : ");
        int anneesClient = sc.nextInt();

        String tarifInitial = determinerTarifInitial(age, anneesPermis, nombreAccidents);
        String tarifFinal = appliquerReductionFidelité(tarifInitial, anneesClient);

        System.out.println("Tarif initial : " + tarifInitial);
        System.out.println("Tarif final : " + tarifFinal);
    }

    private static String determinerTarifInitial(int age, int anneesPermis, int nombreAccidents) {
        if (age < 25 && anneesPermis < 2) {
            if (nombreAccidents == 0) {
                return "Rouge";
            } else {
                return "Refusé";
            }
        } else if (age < 25 || anneesPermis < 2) {
            if (nombreAccidents == 0) {
                return "Orange";
            } else if (nombreAccidents == 1) {
                return "Rouge";
            } else {
                return "Refusé";
            }
        } else {
            if (nombreAccidents == 0) {
                return "Vert";
            } else if (nombreAccidents == 1) {
                return "Orange";
            } else if (nombreAccidents == 2) {
                return "Rouge";
            } else {
                return "Refusé";
            }
        }
    }

    private static String appliquerReductionFidelité(String tarifInitial, int anneesClient) {
        if (anneesClient > 5) {
            switch (tarifInitial) {
                case "Vert":
                    return "Bleu";
                case "Orange":
                    return "Vert";
                case "Rouge":
                    return "Orange";
                default:
                    return tarifInitial;
            }
        } else {
            return tarifInitial;
        }
    }
}