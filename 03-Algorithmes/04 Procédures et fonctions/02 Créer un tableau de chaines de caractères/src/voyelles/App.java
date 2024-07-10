// # Écrire un algorithme qui déclare et remplit un tableau contenant les six voyelles de l’alphabet latin.

package voyelles;

public class App {

	public static void main(String[] args) {
        
		// Déclaration et initialisation du tableau vide (Empty array declaration and initialization)
        char[] voyelles = new char[6];

        // Remplissage du tableau avec la fonction remplirVoyelles (Fill the array with remplirVoyelles function)
        remplirVoyelles(voyelles);

        // Affichage du tableau avec la fonction afficherVoyelles (Display the array with afficherVoyelles function)
        afficherVoyelles(voyelles);
    }

    // Fonction pour remplir le tableau de voyelles (Function to fill the vowels array)
    public static void remplirVoyelles(char[] voyelles) {
        voyelles[0] = 'a';
        voyelles[1] = 'e';
        voyelles[2] = 'i';
        voyelles[3] = 'o';
        voyelles[4] = 'u';
        voyelles[5] = 'y';
    }

    // Fonction pour afficher le contenu du tableau de voyelles (Function to display the content of the vowels array)
    public static void afficherVoyelles(char[] voyelles) {
        System.out.println("Tableau des voyelles :");
        for (char voyelle : voyelles) {
            System.out.print(voyelle + " ");
        }
    }
}