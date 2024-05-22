package lesNombresSuivants;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nombreDepart;
		int compteur = 0;

		System.out.print("Saisissez un nombre de départ: ");
		nombreDepart = sc.nextInt();

		while (compteur <= 10) {

			System.out.print(nombreDepart + compteur + ", ");

			compteur++;

		}

		System.out.println("Fin de la liste.");
		sc.close();
	}

}
