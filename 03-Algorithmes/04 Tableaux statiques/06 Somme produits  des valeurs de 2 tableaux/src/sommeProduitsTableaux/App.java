//Exercice 4.6 : Somme des valeurs de 2 tableaux
//Toujours à partir de deux tableaux d’entiers précédemment saisis, écrivez un algorithme qui calcule la somme des produits
//des deux tableaux. Pour calculer le résultat, il faut multiplier chaque élément du tableau 1
//par chaque élément du tableau 2, et additionner le tout.

package sommeProduitsTableaux;

public class App {

	public static void main(String[] args) {
		
		// Assuming two arrays 'tableau1' and 'tableau2' have already been filled with values
        int[] tableau1 = {11,21,31,41};
        int[] tableau2 = {55,65,75,85};

        // Check if the arrays have the same length
        if (tableau1.length != tableau2.length) {
            System.out.println("Erreur : Les deux tableaux doivent avoir la même longueur.");
            return;
        }

        // Initialize the sum variable
        int sommeProduits = 0;

        // Calculate the sum of products
        for (int i = 0; i < tableau1.length; i++) {
            sommeProduits += tableau1[i] * tableau2[i];
        }

        // Display the sum of products
        System.out.println("La somme des produits des deux tableaux est : " + sommeProduits);

	}

}
