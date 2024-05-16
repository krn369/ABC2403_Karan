package laBonnePlageDeSable;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int nombreSaisi;
        boolean estDansPlage;

        do {
            System.out.print("Saisissez un nombre entre 1 et 3: ");
            nombreSaisi = sc.nextInt();

            estDansPlage = (nombreSaisi >= 1) && (nombreSaisi <= 3);
        } while (!estDansPlage);

        System.out.println(nombreSaisi + ", Bravo, vous avez réussi !");
        
        sc.close();

	}

}
