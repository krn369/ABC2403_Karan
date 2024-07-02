// How can you create and manipulate instances of a regular desk (Bureau) and an electric desk (BureauElectrique),
// ensuring that the electric desk can be adjusted to predefined heights within specified limits?

// Comment pouvez-vous créer et manipuler des instances d'un bureau ordinaire (Bureau) et d'un bureau électrique (BureauElectrique), 
// en garantissant que le bureau électrique peut être ajusté à des hauteurs prédéfinies dans des limites spécifiées ?

// This question encourages understanding and application of the following concepts:

// Class Inheritance: How BureauElectrique extends Bureau.
// Object Creation: How to instantiate objects of Bureau and BureauElectrique.
// Method Usage: How to use methods to manipulate object properties, such as setting heights and adjusting the desk position.
// Constructor Overloading: Understanding different constructors in both classes, including the parameterized and copy constructors.
// Encapsulation and Data Validation: How the program ensures valid height adjustments within specified limits.

// Appropriate Questions for This Program.....
// How does inheritance work in Java?
// What are the differences between regular and electric desks in this program?
// How can we manipulate the properties of an object in Java?
// How do constructors and copy constructors work in Java?
// How can encapsulation be used to protect data in Java objects?

package bureauElectrique;

import java.math.BigDecimal;

// This class contains the main method where instances of Bureau and BureauElectrique are created and used.

public class App {

	public static void main(String[] args) {

		// Create an instance of Bureau
		// Creates an instance of a regular desk (Bureau), sets its height, and prints
		// its dimensions.

		Bureau bureauSimple = new Bureau(new BigDecimal("150"), new BigDecimal("75"), new BigDecimal("80"));

		// Print initial dimensions of bureauSimple
		System.out.println("Dimensions du bureau simple :--------------------------- ");
		System.out.println("Largeur : " + bureauSimple.getLargeurEnCM() + " cm");
		System.out.println("Longueur : " + bureauSimple.getLongueurEnCM() + " cm");
		System.out.println("Hauteur : " + bureauSimple.getHauteurEnCM() + " cm");

		// Positionner le bureauSimple à une hauteur de 85 cm
		boolean success = bureauSimple.PositionnerALaHauteur(new BigDecimal("85"));
		System.out.println("Positionner le bureau simple à 85 cm : " + success);
		System.out.println("Nouvelle hauteur du bureau simple : " + bureauSimple.getHauteurEnCM() + " cm");

		// Create an instance of BureauElectrique
		// Creates instances of electric desks (BureauElectrique), manipulates their height, and prints their dimensions.

		BureauElectrique bureau = new BureauElectrique(new BigDecimal("64"), new BigDecimal("120"),
				new BigDecimal("80"), new BigDecimal("100"), new BigDecimal("75"), new BigDecimal("75"), true);

		// Brancher le bureau
		bureau.DeBrancher();

		// Try to set height to 90
		success = bureau.PositionnerALaHauteur(new BigDecimal("90"));
		System.out.println("Positionner à 90 : " + success);

		// Descendre le bureau par 10 units
		success = bureau.Descendre(new BigDecimal("10"));
		System.out.println("Descendre par 10 : " + success);

		// Imprimer le actuel hauteur
		System.out.println("Hauteur Actuel : " + bureau.getHauteurEnCM());

		// Create an instance of BureauElectrique for bureauWafae
		BureauElectrique bureauWafae = new BureauElectrique(new BigDecimal("64"), new BigDecimal("100"),
				new BigDecimal("80"), new BigDecimal("100"), new BigDecimal("75"), new BigDecimal("75"), true);

		// Create an instance of BureauElectrique for bureauJP
		BureauElectrique bureauJP = new BureauElectrique(new BigDecimal("70"), new BigDecimal("120"),
				new BigDecimal("80"), new BigDecimal("110"), new BigDecimal("73"), new BigDecimal("70"), true);

		// Brancher the bureaus
		bureauWafae.Brancher();
		bureauJP.Brancher();

		// Imprimer les hauteurs initiales
		System.out.println("La hauteur initiale du bureauWafae est : " + bureauWafae.getHauteurEnCM());
		System.out.println("La hauteur initiale du bureauJP est : " + bureauJP.getHauteurEnCM());

	}

}
