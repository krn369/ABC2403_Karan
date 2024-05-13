package tarifAssurance;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int age,tempsPermis,tempsContrat,nbAccidents; 
		String couleurTarifFidelite,couleurTarif,ancienneContratType;
		
		Scanner sc = new Scanner(System.in);
		
		// Demander les données à l'utilisateur
	    System.out.print("Saisissez l'âge du conducteur : ");
	    age = sc.nextInt();
	    System.out.print("Saisissez l'ancienneté du permis (en années) : ");
	    tempsPermis = sc.nextInt();
	    System.out.print("Saisissez le nombre d'accidents responsables : ");
	    nbAccidents = sc.nextInt();
	    System.out.print("Saisissez l'ancienneté du contrat type en couler : ");
	    ancienneContratType = sc.next();
	    System.out.print("Saisissez l'ancienneté du contrat type en couler : ");
	    tempsContrat = sc.nextInt();
	    
	}

}
