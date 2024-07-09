package porteDeGarage;

public class App {
	
	
	// Main method to test the PorteDeGarage Class.
	// The main method creates an instance of "PorteDeGarage" and performs a series of operations ( unlock, open, partially open at 50%,
	// close and lock) to demonstrate the functionality of the class methods. 
	
	public static void main(String[] args) {
		
		PorteDeGarage porte = new PorteDeGarage();
		porte.deverrouiller();
		porte.ouvrir();
		porte.ouvrirPartiellement(50);
		porte.fermer();
		porte.verrouiller();

	}

}
