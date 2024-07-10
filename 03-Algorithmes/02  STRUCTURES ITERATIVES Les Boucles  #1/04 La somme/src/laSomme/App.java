package laSomme;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Déclaration des variables
		int nombreLimite;
		int somme = 0;

		// Demander le nombre limite à l'utilisateur
		System.out.print("Saisissez un nombre limite: ");
		nombreLimite = sc.nextInt();

		// Calcul de la somme des entiers jusqu'à nombreLimite
		for (int i = 1; i <= nombreLimite; i++) {
			somme += i;
		}

		// Affichage de la somme calculée
		System.out.println("La somme des nombres jusqu'à " + nombreLimite + " est : " + somme);

		sc.close();

	}

}
