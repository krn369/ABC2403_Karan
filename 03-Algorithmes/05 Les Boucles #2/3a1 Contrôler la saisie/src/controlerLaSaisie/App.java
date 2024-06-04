package controlerLaSaisie;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        // Declare variables
        String prenom = null;
        int nombreEssais = 0;
        boolean prenomValide = false;

        // Loop to ask for the first name until it is valid
        while (!prenomValide) {
            nombreEssais++;

            System.out.print("Saisissez votre prénom (au moins 2 caractères) : ");
            prenom = sc.nextLine();

            // Check if the first name has at least 2 characters
            if (prenom.length() >= 2) {
                prenomValide = true;
            } else {
                System.out.println("Le prénom doit contenir au moins 2 caractères. Veuillez recommencer.");
            }
        }

        // Display welcome message with the valid first name
        System.out.println("\nBonjour, " + prenom + " !");
        System.out.println("Nombre d'essais : " + nombreEssais);
        
        sc.close();

	}

}
