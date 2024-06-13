package bouteille;

public class Bouteille {

	// attributes
	// Properties of the bottle
	
	private float contenanceEnL; // How much liquid it can hold (litres)
	private float contenuEnL;    // How much liquid is in it now (litres) duplicate variable name fixed
	private boolean ouvert;       // Whether the lid is on or off ( true for open, false for close)
	private String typeDeContenu;  // What kind of the drink is in it (water, juice, etc)

	// access/modifier

	// constructor

	// constructeur par default : Makes a regular bottle 

	public Bouteille() {
		contenanceEnL = 1;
		contenuEnL = 1;
		ouvert = false;
		typeDeContenu = "H2O";

	}

	// Constructor with arguments : Lets you define specific properties 

	public Bouteille(float _contenanceEnL, float _contenuEnL, boolean _ouvert, String _typeDeContenu) {
		this.contenanceEnL = _contenanceEnL;
		this.contenuEnL = _contenuEnL;
		this.ouvert = _ouvert;
		this.typeDeContenu = _typeDeContenu;
	}

	// Constructeur par recopie ou de clonage
	// Copy constructor : Makes a new bottle exactly like another

	public Bouteille(Bouteille _bouteilleARecopier) {

		this.contenanceEnL = _bouteilleARecopier.contenanceEnL;
		this.contenuEnL = _bouteilleARecopier.contenuEnL;
		this.ouvert = _bouteilleARecopier.ouvert;
		this.typeDeContenu = _bouteilleARecopier.typeDeContenu;
	}

	// Methods
	// Check size : See how big the bottle is (in units of 100 milliliters) 

	public float donneContenanceEnCL() {

		float result;
		result = this.contenuEnL * 100;

		return result;
	}

		// See if Full : Check if the bottle has all the liquid it can hold
	
	public boolean estPlien() {
		return this.contenuEnL == this.contenanceEnL;
		
	}
	
	// Close the Lid : Try to put the lid on the bottle.
	
	public boolean fermer() {
		
		if(this.ouvert) {
			this.ouvert = false;
		} 
		return this.ouvert;
	}
	
	
	// Open the Lid : Try to take the lid off the bottle.
	
	public boolean ouvrir() {
		if (!this.ouvert) {
			this.ouvert = true;
		}
		return this.ouvert;
			
	}
	
	// Add Drink : Try to pour more drink into the bottle
	
	public boolean remplir(float remplirICI) {
		
		// traitment

		if (this.ouvert && this.contenanceEnL - this.contenuEnL >= remplirICI) {

			
			this.contenuEnL +=  remplirICI;
			return true;
		} 
		return false;

	}
	
	// Take Out Drink : Try to pour some drink out of the bottle
	
	public boolean vider(float videzICI) {
		if (this.ouvert && this.contenuEnL >= videzICI) {
			this.contenuEnL -= videzICI;
			return true;
		}
		return false;
	}
	
	  // Fill Completely: Try to fill the bottle all the way up
	  public boolean remplireComplet() {
	    if (this.ouvert && this.contenuEnL != this.contenanceEnL) {
	      this.contenuEnL = this.contenanceEnL;
	      return true;
	    }
	    return false;
	  }

	  // Empty Completely: Try to pour out all the drink in the bottle
	  public boolean videzComplet() {
	    if (this.ouvert && this.contenuEnL != 0) {
	      this.contenuEnL = 0;
	      return true;
	    }
	    return false;
	  }

}
