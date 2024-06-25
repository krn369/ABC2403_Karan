package bureauElectrique;

import java.math.BigDecimal;

// This class extends the Bureau class to represent an electric desk with additional properties and methods.

public class BureauElectrique extends Bureau {

	// Private	Only within the class
	// Public	Anywhere in your code
	// Protected	Within the class, its subclasses (including those from other packages), and within the same package
	// Package-Private	Only within the same package where the class is defined

	private boolean branche; //whether the electric desk is plugged in (true) or not (false). The desk cannot adjust its height unless plugged in.
	private final BigDecimal hauteur1EnCM;
	private final BigDecimal hauteur2EnCM;
	private final BigDecimal hauteur3EnCM;
	private final BigDecimal hauteurMaxEnCM;
	private final BigDecimal hauteurMinEnCM;

	// Constructor with parameters : Initializes the electric desk with all necessary properties.
	public BureauElectrique(BigDecimal hauteurMinEnCM, BigDecimal hauteurMaxEnCM, BigDecimal hauteurEnCM,
				BigDecimal hauteur3EnCM, BigDecimal hauteur2EnCM, BigDecimal hauteur1EnCM, boolean branche) {
		
		super(null, null, hauteurEnCM); // Passing null for largeurEnCM and longueurEnCM as they are not used in this context
						// and the provided hauteurEnCM to initialize the inherited height property in the Bureau class.
		this.branche = branche;
		this.hauteur1EnCM = hauteur1EnCM;
		this.hauteur2EnCM = hauteur2EnCM;
		this.hauteur3EnCM = hauteur3EnCM;
		this.hauteurMinEnCM = hauteurMinEnCM;
		this.hauteurMaxEnCM = hauteurMaxEnCM;
	}

	// Copy constructor : Creates a new electric desk based on another electric
	// desk's properties.
	public BureauElectrique(BureauElectrique bureauElectriqueACopier) {
		super(bureauElectriqueACopier); // Call the superclass copy constructor
		this.branche = bureauElectriqueACopier.branche;
		this.hauteur1EnCM = bureauElectriqueACopier.hauteur1EnCM;
		this.hauteur2EnCM = bureauElectriqueACopier.hauteur2EnCM;
		this.hauteur3EnCM = bureauElectriqueACopier.hauteur3EnCM;
		this.hauteurMaxEnCM = bureauElectriqueACopier.hauteurMaxEnCM;
		this.hauteurMinEnCM = bureauElectriqueACopier.hauteurMinEnCM;
	}

	// Methods

	public boolean Brancher() {		// Plugs in the electric desk
		this.branche = true;
		return this.branche;
	}

	public boolean DeBrancher() {		// Unplugs the electric desk
		this.branche = false;
		return this.branche;
	}


	// Attempts to set the height, ensuring it's within limits and the desk is plugged in
	@Override						// This annotation indicates overriding the inherited method
	public boolean PositionnerALaHauteur(BigDecimal hauteur) {
		if (hauteur.compareTo(hauteurMinEnCM) >= 0 && hauteur.compareTo(hauteurMaxEnCM) <= 0) {
			super.positionnerALaHauteur(hauteur);   // This calls the positionnerALaHauteur(BigDecimal hauteur) method from the superclass (Bureau). 
								// This method is likely responsible for actually adjusting the desk's height mechanism.
			return true;
		}
		return false;
	} 

		public boolean Descendre(BigDecimal differenceHauteur) {	 // Lowers the desk by a specified amount (within limits)
		    if (this.branche) {
		      BigDecimal nouvelleHauteur = this.hauteurEnCM.subtract(difference);
		      if (nouvelleHauteur.compareTo(hauteurMinEnCM) >= 0) {
		        return this.PositionnerALaHauteur(nouvelleHauteur);
		      }
		    }
		    return false;
	}

	public boolean Monter(BigDecimal differenceHauteur) {		// Raises the desk by a specified amount (within limits)
		    if (this.branche) {
		      BigDecimal nouvelleHauteur = this.hauteurEnCM.add(difference);
		      if (nouvelleHauteur.compareTo(hauteurMaxEnCM) <= 0) {
		      return this.PositionnerALaHauteur(nouvelleHauteur);
		      }
		    }
		    return false;
	}
	
	// Sets the height to one of the predefined heights (1, 2, or 3)
	// These methods are shortcuts to set the height to one of the predefined heights (hauteur1EnCM, hauteur2EnCM, or hauteur3EnCM).
	// They simply call the PositionnerALaHauteur(hauteur) method with the corresponding predefined height value.
	
	public boolean MettreALaHauteur1() {
		return PositionnerALaHauteur(this.hauteur1EnCM);
	}

	public boolean MettreALaHauteur2() {
		return PositionnerALaHauteur(this.hauteur2EnCM);
	}

	public boolean MettreALaHauteur3() {
		return PositionnerALaHauteur(this.hauteur3EnCM);
	}
}
