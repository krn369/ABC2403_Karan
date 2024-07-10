package nombresParfaits;

public class App {

	public static void main(String[] args) {
	    // Fonction pour trouver les premiers nombres parfaits (French)
        // Function to find the first perfect numbers (English)
        findFirstPerfectNumbers(4);
    }

    // Fonction pour vérifier si un nombre est parfait (French)
    // Function to check if a number is perfect (English)
    static boolean estParfait(int nombre) {
        if (nombre <= 1) {
            return false;
        }

        int somme = 1; // Inclure 1 comme diviseur (French)
                        // Include 1 as a divisor (English)
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                somme += i; // Ajouter le diviseur (French)
                            // Add the divisor (English)
                if (i == nombre / i) { // S'il s'agit d'un carré parfait, ajouter une seule fois (French)
                                     // If it's a perfect square, add only once (English)
                    somme -= i;
                }
            }
        }

        return somme == nombre;
    }

    // Fonction pour trouver et afficher les premiers nombres parfaits (French)
    // Function to find and display the first perfect numbers (English)
    static void findFirstPerfectNumbers(int nbNombres) {
        int nombreParfaitCompte = 0;
        int nombreCourant = 1;

        while (nombreParfaitCompte < nbNombres) {
            if (estParfait(nombreCourant)) {
                System.out.println(nombreCourant + " est un nombre parfait."); // French
                System.out.println(nombreCourant + " is a perfect number."); // English
                nombreParfaitCompte++;
            }

            nombreCourant++;
        }
    }
}