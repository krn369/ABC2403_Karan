package porteDeGarage;

public class PorteDeGarage {
	
	// Attributes
	private boolean estVerrouille; // isLocked boolean to store if the door is locked
	private int pourcentageOuvert; // 0 means fully closed, 100 means fully open || to store the percentage of how open the door is?

	// Constructor
	//	Defines a constructor that initialize "estVerrouille" isLocked to false and "pourcentageOuvert" int to store the percentage of how open the door is.
	public PorteDeGarage() {

		this.estVerrouille = false;
		this.pourcentageOuvert = 0;
	}

	// Methods
	
	// Open Method
	// Checks if the door is not locked. if true, it sets "pourcentageOuvert" to 100 (fully open) and prints a message. if the door is locked, it prints a different message.
	public void ouvrir() {

		if (!estVerrouille) {
			this.pourcentageOuvert = 100;
			System.out.println("La porte du garage est complèment ouverte.");
		}

		else {
			System.out.println("La porte du garage est verrouillée et ne peur pas être ouverte.");
		}

	}

	
	// Close Method
	// Set "pourcentageOuvert" to 0 and prints a message.
	public void fermer() {
		this.pourcentageOuvert = 0;
		System.out.println("La porte du garage est fermée.");
	}
	
	
	// Lock Method
	// Checks if the door is fully closed (pourcentageOuvert = 0) if ture, it sets isLocked "estVerriouille" to true, and prints a message. if the door is not fully closed, it prints a different message.
	public void verrouiller() {

		if (this.pourcentageOuvert == 0) {
			this.estVerrouille = true;
			System.out.println("La porte du garage est verrouillée.");
		}

		else {
			System.out.println("Fermez la porte du garage avant de la verrouiller.");
		}
	}
	
	
	// UnLock Method
	// Sets isLocked "estVerrouille" to false (unlocked) and prints a message.
	public void deverrouiller() {
		this.estVerrouille = false;
		System.out.println("La porte du garage est déverouillée.");

	}
	
	
	// PartiallyOpen Method
	// Checks if the door is not locked, if true, it then checks if the provided percentage is between 1 and 99. if both conditions are met, is sets "pourcentageOvert" to the provided percentage and prints a message. If the percentage is invalid or the door is locked, it prints a different message.
	public void ouvrirPartiellement(int pourcentage) {

		if (!estVerrouille) {

			if (pourcentage > 0 && pourcentage < 100) {
				this.pourcentageOuvert = pourcentage;

				System.out.println("La porte du garage est partiellement ouverte à " + pourcentage + "%.");
			} else {
				System.out.println("Pourcentage invalide. Veuillez fournir une valeur entre 1 et 99.");
			}

		}

		else {
			System.out.println("La porte du garage est verrouillée et ne peut pas être partiellement ouverte.");
		}
	}

}
