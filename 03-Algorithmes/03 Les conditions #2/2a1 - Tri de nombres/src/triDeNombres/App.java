package triDeNombres;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nombre1, nombre2;
		
		System.out.print("Saisissez le premier nombre :");
		nombre1 = sc.nextInt();
		
		System.out.print("Saisissez le deuxième nombre :");
		nombre2 = sc.nextInt();
		
		if (nombre1 < nombre2 ) {
			System.out.println("Dans l'ordre croissant : " + nombre1 + ", " + nombre2);
			
		} else {
			System.out.println("Dans l'ordre croissant : " + nombre2 + ", " + nombre1);
		}
		sc.close();
	}

}
