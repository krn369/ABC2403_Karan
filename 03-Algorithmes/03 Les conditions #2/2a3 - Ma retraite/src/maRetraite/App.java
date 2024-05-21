package maRetraite;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // Déclaration de la variable
	        int age;

	        // Lecture de l'âge
	        System.out.print("Saisissez votre âge: ");
	        age = sc.nextInt();

	        // Détermination du message en fonction de l'âge
	        if (age < 0) {
	            System.out.println("La valeur fournie n'est pas un âge valide.");
	        } else if (age >= 60) {
	            int retraite = age - 60;
	            if (retraite > 0) {
	                System.out.println("Vous êtes à la retraite depuis " + retraite + " années.");
	            } else {
	                System.out.println("C'est le moment de prendre sa retraite.");
	            }
	        } else {
	            int anneesRestantes = 60 - age;
	            System.out.println("Il vous reste " + anneesRestantes + " années avant la retraite.");
	        }
	        sc.close();
	}

}
