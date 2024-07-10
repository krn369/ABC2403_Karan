package compteurValeursMF2;

import java.util.Scanner;

public class App {

	// Method to get grades from the user
	static int[] recupererNotes(int nbEtudiants) {
		Scanner sc = new Scanner(System.in);

		int[] notes = new int[nbEtudiants];

		for (int i = 0; i < nbEtudiants; i++) {
			System.out.print("Saisissez la note de l'étudiant " + (i + 1) + " : ");
			notes[i] = sc.nextInt();
		}

		sc.close();
		return notes;
	}

	// Method to calculate the class average
	static double calculerMoyenne(int[] notes) {
		double somme = 0;
		for (int note : notes) {
			somme += note;
		}
		return somme / notes.length;
	}

	// Method to count grades above average
	static int compterNotesAuDessusMoyenne(int[] notes, double moyenne) {
		int nbNotesAuDessus = 0;
		for (int note : notes) {
			if (note > moyenne) {
				nbNotesAuDessus++;
			}
		}
		return nbNotesAuDessus;
	}

	// Main program

	public static void main(String[] args) {

		System.out.print("Combien d'étudiants sont dans la classe ? ");
		int nbEtudiants = new Scanner(System.in).nextInt();

		int[] notes = recupererNotes(nbEtudiants);

		double moyenne = calculerMoyenne(notes);

		System.out.println("\nLa moyenne de la classe est de : " + moyenne);

		int nbNotesAuDessus = compterNotesAuDessusMoyenne(notes, moyenne);

		System.out.println("Nombre de notes supérieures à la moyenne : " + nbNotesAuDessus);

	}

}
