package esTuMajeur;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// Déclaration de la variable
		int age;
		Scanner sc = new Scanner(System.in);
		// Lecture de l'âge
		System.out.print("Saisissez votre âge: ");
		age = sc.nextInt();

		// Détermination du message en fonction de l'âge
		if (age >= 18) {
			System.out.println("Vous êtes majeur.");
		} else if (age > 0) {
			System.out.println("Vous êtes mineur.");
		} else {
			System.out.println("Vous n’êtes pas encore né.");
		}

		sc.close();
	}

}
