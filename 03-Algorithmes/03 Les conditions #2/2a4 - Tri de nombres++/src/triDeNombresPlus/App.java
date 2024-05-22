package triDeNombresPlus;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int nombreA, nombreB, nombreC;

		Scanner sc = new Scanner(System.in);

		System.out.print("Saisissez le premier nombre : ");
		nombreA = sc.nextInt();

		System.out.print("Saisissez le deuximème nombre : ");
		nombreB = sc.nextInt();

		System.out.print("Saisissez le troisième nombre : ");
		nombreC = sc.nextInt();

		if (nombreC < nombreB && nombreB < nombreA) {
			System.out.println("Dans l'ordre décroissant : " + nombreA + ", " + nombreB + ", " + nombreC);
		} else if (nombreB < nombreC && nombreC < nombreA) {
			System.out.println("Dans l'ordre décroissant : " + nombreA + ", " + nombreC + ", " + nombreB);
		} else if (nombreA < nombreC && nombreC < nombreB) {
			System.out.println("Dans l'ordre décroissant : " + nombreB + ", " + nombreC + ", " + nombreA);
		} else if (nombreC < nombreA && nombreA < nombreB) {
			System.out.println("Dans l'ordre décroissant : " + nombreB + ", " + nombreA + ", " + nombreC);
		} else if (nombreA < nombreB && nombreB < nombreC) {
			System.out.println("Dans l'ordre décroissant : " + nombreC + ", " + nombreB + ", " + nombreA);
		}

		else {
			System.out.println("Dans l'ordre décroissant : " + nombreC + ", " + nombreA + ", " + nombreB);
		}
		sc.close();
	}

}
