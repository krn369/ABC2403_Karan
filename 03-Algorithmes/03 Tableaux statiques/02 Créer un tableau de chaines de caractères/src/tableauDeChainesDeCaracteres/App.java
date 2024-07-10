package tableauDeChainesDeCaracteres;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		 // Declare and initialize the 'voyelles' array
        char[] voyelles = new char[6];

        // Latin alphabet vowels
        char[] voyellesAlphabet = {'a', 'e', 'i', 'o', 'u', 'y'};

        int compteurVoyelles = 0;
		// Fill the 'voyelles' array with Latin alphabet vowels
        for (int i = 0; i < voyelles.length; i++) {
            voyelles[i] = voyellesAlphabet[i];
            compteurVoyelles++; // Increment the vowel counter
        }

        // Display the 'voyelles' array (optional)
        System.out.println(Arrays.toString(voyelles)); // Prints the array content

        // Display the vowel count
        System.out.println("Nombre de voyelles ajoutées : " + compteurVoyelles);

	}

}
