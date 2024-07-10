//# Exercice 4.3 : Alimenter un tableau
//Écrire un algorithme permettant à l’utilisateur de saisir un nombre quelconque de valeurs, qui devront être stockées dans un tableau.
//L’utilisateur doit donc commencer par entrer le nombre de valeurs qu’il compte saisir. Il effectuera ensuite cette saisie. Enfin, une fois la saisie terminée, le programme affichera le nombre de valeurs négatives et le nombre de valeurs positives.


package nombrePositifNegatifMF;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        // Demander le nombre de valeurs à l'utilisateur (Ask the user for the number of values)
	        int nbValeurs = demanderNombreValeurs(sc);

	        // Déclaration et initialisation du tableau (Declare and initialize the array)
	        int[] valeurs = new int[nbValeurs];

	        // Saisie des valeurs par l'utilisateur (User input of values)
	        saisirValeurs(valeurs, sc);

	        // Comptage des nombres positifs et négatifs (Count positive and negative numbers)
	        int nbPositifs = compterNombresPositifs(valeurs);
	        int nbNegatifs = compterNombresNegatifs(valeurs);

	        // Affichage des résultats (Display results)
	        afficherResultats(nbPositifs, nbNegatifs);
	    }

	    // Fonction pour demander le nombre de valeurs à l'utilisateur (Function to ask the user for the number of values)
	    public static int demanderNombreValeurs(Scanner sc) {
	        System.out.print("Entrez le nombre de valeurs à saisir : ");
	        return sc.nextInt();
	    }

	    // Fonction pour saisir les valeurs dans le tableau (Function to enter values into the array)
	    public static void saisirValeurs(int[] valeurs, Scanner sc) {
	        System.out.println("Saisissez les valeurs : ");
	        for (int i = 0; i < valeurs.length; i++) {
	            valeurs[i] = sc.nextInt();
	        }
	    }

	    // Fonction pour compter les nombres positifs (Function to count positive numbers)
	    public static int compterNombresPositifs(int[] valeurs) {
	        int nbPositifs = 0;
	        for (int valeur : valeurs) {
	            if (valeur > 0) {
	                nbPositifs++;
	            }
	        }
	        return nbPositifs;
	    }

	    // Fonction pour compter les nombres négatifs (Function to count negative numbers)
	    public static int compterNombresNegatifs(int[] valeurs) {
	        int nbNegatifs = 0;
	        for (int valeur : valeurs) {
	            if (valeur < 0) {
	                nbNegatifs++;
	            }
	        }
	        return nbNegatifs;
	    }

	    // Fonction pour afficher les résultats (Function to display results)
	    public static void afficherResultats(int nbPositifs, int nbNegatifs) {
	        System.out.println("Nombre de valeurs positives : " + nbPositifs);
	        System.out.println("Nombre de valeurs négatives : " + nbNegatifs);
	    }
	}