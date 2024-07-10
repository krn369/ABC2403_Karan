//#Exercice 4.9 : Recherche spécifique dans un tableau
//Toujours et encore sur le même principe, écrivez un algorithme permettant, à l’utilisateur de saisir les notes d’une classe. Le programme, une fois la saisie terminée, renvoie le nombre de ces notes supérieures à la moyenne de la classe.


package notesClasse;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Get the number of students from the user
        System.out.print("Combien d'élèves sont dans la classe ? ");
        int nbEtudiants = scanner.nextInt();

        // Create an array to store the grades
        int[] grades = new int[nbEtudiants];

        // Get the grades from the user
        for (int i = 0; i < nbEtudiants; i++) {
            System.out.print("Saisissez la note de l'élève " + (i + 1) + " : ");
            grades[i] = scanner.nextInt();
        }

        // Calculate the class average
        int totalScore = 0;
        for (int grade : grades) {
            totalScore += grade;
        }
        double classAverage = (double) totalScore / nbEtudiants;

        // Count the number of grades above the average
        int nbAboveAverage = 0;
        for (int grade : grades) {
            if (grade > classAverage) {
                nbAboveAverage++;
            }
        }

        // Display the class average and number of grades above average
        System.out.println("\nLa moyenne de la classe est de : " + classAverage);
        System.out.println("Le nombre de notes supérieures à la moyenne est de : " + nbAboveAverage);
        
        scanner.close();

	}

}
