package laBonnePlageDeGalets;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 int nombreSaisi;
	     boolean estDansPlage;

	        do {
	            System.out.print("Saisissez un nombre entre 10 et 20: ");
	            nombreSaisi = sc.nextInt();

	            estDansPlage = (nombreSaisi >= 10) && (nombreSaisi <= 20);

	            if (!estDansPlage) {
	                if (nombreSaisi > 20) {
	                    System.out.println("Plus petit !");
	                } else {
	                    System.out.println("Plus grand !");
	                }
	            }
	        } while (!estDansPlage);

	        System.out.println(nombreSaisi + ", Yes, you did it !");
	        
	        sc.close();
	}

}
