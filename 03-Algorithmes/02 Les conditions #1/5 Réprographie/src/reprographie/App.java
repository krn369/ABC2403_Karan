package reprographie;

import java.util.Scanner; // Importer la classe Scanner pour lire les entrées utilisateur

public class App {
	
	final static double P1 = 0.1 ;
	final static double P2 = 0.09 ;
	final static double P3 = 0.08 ;

	public static void main(String[] args) {
		
		// Déclaration des variables
		
		int nombreDeCopies ;
		double montantDeLaFacture ; 
		
	    // Créer un objet Scanner pour lire les entrées
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez le nombre de photocopies: ");
		nombreDeCopies = sc.nextInt();
		
		if ( nombreDeCopies <= 10) {
			
			montantDeLaFacture = nombreDeCopies * App.P1;
		}
		
		else if (nombreDeCopies <=  30 ) {
			
			montantDeLaFacture = 10 * App.P1 + (nombreDeCopies - 10) * App.P2 ;
			
		}
		
		else {
			
			montantDeLaFacture = 10 * App.P1 + 20 * App.P2 + (nombreDeCopies - 30) * App.P3 ;
			
		}
		
		System.out.println(" A payer: "+ montantDeLaFacture + "€");
		
		sc.close();
       
	}

}
