package etLePlusGrandEst;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nombreCourant;
		int plusGrandNombre = Integer.MIN_VALUE; // Initialisé à la valeur minimale possible pour un entier en Java
		int numeroDuPlusGrandNombre = 0;
		int i;

		for (i = 1; i <= 20; i++) {
			System.out.print("Entrez le nombre numéro " + i + " : ");
			nombreCourant = sc.nextInt();

			if (nombreCourant > plusGrandNombre) {
				plusGrandNombre = nombreCourant;
				numeroDuPlusGrandNombre = i;
			}
		}

		System.out.println("Le plus grand des nombres saisis est : " + plusGrandNombre);
		System.out.println("Il s'agit du nombre numéro " + numeroDuPlusGrandNombre);

		sc.close();
	}

}
