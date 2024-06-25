package bureauElectrique;

import java.math.BigDecimal;

// This class represents a basic desk with properties for its dimensions and methods to manipulate these properties.

public class Bureau {
	protected BigDecimal hauteurEnCM;
	protected BigDecimal largeurEnCM;
	protected BigDecimal longueurEnCM;

	// Default constructor : Initializes the desk without setting any dimensions
	public Bureau() {
	}

	// Parameterized constructor : Initializes the desk with specified dimensions
	// (width, length, height).
	public Bureau(BigDecimal largeurEnCM, BigDecimal longueurEnCM, BigDecimal hauteurEnCM) {
		this.largeurEnCM = largeurEnCM;
		this.longueurEnCM = longueurEnCM;
		this.hauteurEnCM = hauteurEnCM;
	}

	// Copy constructor : Creates a new desk based on another desk's dimensions.
	public Bureau(Bureau bureauACopier) {
		this.largeurEnCM = bureauACopier.largeurEnCM;
		this.longueurEnCM = bureauACopier.longueurEnCM;
		this.hauteurEnCM = bureauACopier.hauteurEnCM;
	}

	// Method to position the desk at a specific height if the height is
	// non-negative.
	public boolean PositionnerALaHauteur(BigDecimal hauteur) {
		if (hauteur.compareTo(BigDecimal.ZERO) >= 0) {
			this.hauteurEnCM = hauteur;
			return true;
		}
		return false;
	}

	// Getters (getHauteurEnCM, getLargeurEnCM, getLongueurEnCM): Retrieve the
	// dimensions of the desk.

	// Getter for hauteurEnCM
	public BigDecimal getHauteurEnCM() {
		return hauteurEnCM;
	}

	// Getter for largeurEnCM
	public BigDecimal getLargeurEnCM() {
		return largeurEnCM;
	}

	// Getter for longueurEnCM
	public BigDecimal getLongueurEnCM() {
		return longueurEnCM;
	}
}
