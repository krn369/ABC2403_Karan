package bissextile;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

        // Get the year from the user
        System.out.print("Entrez une année : ");
        int annee = scanner.nextInt();

        // Check if the year is divisible by 4
        boolean divisibleBy4 = annee % 4 == 0;

        // Check if the year is divisible by 100
        boolean divisibleBy100 = annee % 100 == 0;

        // Check if the year is divisible by 400
        boolean divisibleBy400 = annee % 400 == 0;

        // Determine if it's a leap year based on the rules
        boolean isLeapYear;
        if (divisibleBy4 && !divisibleBy100) {
            isLeapYear = true;
        } else if (divisibleBy400) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        // Display the result
        System.out.println(annee + " est " + (isLeapYear ? "une année bissextile" : "une année non bissextile"));
        
        scanner.close();
	}

}
