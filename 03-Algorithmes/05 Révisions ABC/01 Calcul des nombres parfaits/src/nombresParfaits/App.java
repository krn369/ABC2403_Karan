package nombresParfaits;

public class App {

	  public static void main(String[] args) {
	    findFirstPerfectNumbers(4); // Change the argument to desired number of perfect numbers
	  }

	  static boolean estParfait(int nombre) {
	    if (nombre <= 1) {  // If the number (nombre) is less than or equal to 1, it's not a perfect number. The method returns false in this case.
	      return false;
	    }

	    int somme = 1; // Include 1 as a divisor
	    for (int i = 2; i * i <= nombre; i++) {
	      if (nombre % i == 0) {
	        somme += i;
	        if (i == nombre / i) {
	          break; // Only add once for perfect squares
	        } else {
	          somme += nombre / i; // Add the other divisor for non-perfect squares
	        }
	      }
	    }

	    return somme == nombre;
	  }

	  static void findFirstPerfectNumbers(int nbNombres) {
	    int nombreParfaitCompte = 0;  // This variable is an integer that keeps track of how many perfect numbers have been found so far. It's initialized to 0.
	    int nombreCourant = 2; // This variable is an integer that represents the current number being checked for perfection.  Start from 2 as 1 is not a perfect number

	    while (nombreParfaitCompte < nbNombres) {
	      if (estParfait(nombreCourant)) {   // The code calls the estParfait method to check if the current number (nombreCourant) is a perfect number.
	        System.out.println(nombreCourant + " est un nombre parfait.");  //Prints the number to the console along with a message indicating it's a perfect number.
	        nombreParfaitCompte++; // Increments the nombreParfaitCompte to keep track of the found perfect numbers.
	      }
	      nombreCourant++; // The current number (nombreCourant) is incremented to move on to the next number for checking.
	    }
	  }
	}