package bouteille;

public class Bouteille {

    // Attributes
    // Properties of the bottle
    private float contenanceEnL; // How much liquid it can hold (liters)
    private float contenuEnL; // How much liquid is in it now (liters)
    private boolean ouvert; // Whether the lid is on or off (true for open, false for closed)
    private String typeDeContenu; // What kind of drink is in it (water, juice, etc.)

    // Constructor with no arguments: Makes a regular bottle
    public Bouteille() {
        this.contenanceEnL = 1;
        this.contenuEnL = 1;
        this.ouvert = false;
        this.typeDeContenu = "H2O";
    }

    // Constructor with arguments: Lets you define specific properties
    public Bouteille(float contenanceEnL, float contenuEnL, boolean ouvert, String typeDeContenu) {
        this.contenanceEnL = contenanceEnL;
        this.contenuEnL = contenuEnL;
        this.ouvert = ouvert;
        this.typeDeContenu = typeDeContenu;
    }

    // Copy constructor: Makes a new bottle exactly like another
    public Bouteille(Bouteille bouteilleARecopier) {
        this.contenanceEnL = bouteilleARecopier.contenanceEnL;
        this.contenuEnL = bouteilleARecopier.contenuEnL;
        this.ouvert = bouteilleARecopier.ouvert;
        this.typeDeContenu = bouteilleARecopier.typeDeContenu;
    }

    // Methods
    // Check size: See how big the bottle is (in units of 100 milliliters)
    public float donneContenanceEnCL() {
        return this.contenanceEnL * 100;
    }

    // See if Full: Check if the bottle has all the liquid it can hold
    public boolean estPlein() {
        return this.contenuEnL == this.contenanceEnL;
    }

    // Close the Lid: Try to put the lid on the bottle.
    public boolean fermer() {
        if (this.ouvert) {
            this.ouvert = false;
        }
        return !this.ouvert;
    }

    // Open the Lid: Try to take the lid off the bottle.
    public boolean ouvrir() {
        if (!this.ouvert) {
            this.ouvert = true;
        }
        return this.ouvert;
    }

    // Add Drink: Try to pour more drink into the bottle
    public boolean remplir(float quantite) {
        if (this.ouvert && this.contenanceEnL - this.contenuEnL >= quantite) {
            this.contenuEnL += quantite;
            return true;
        }
        return false;
    }

    // Take Out Drink: Try to pour some drink out of the bottle
    public boolean vider(float quantite) {
        if (this.ouvert && this.contenuEnL >= quantite) {
            this.contenuEnL -= quantite;
            return true;
        }
        return false;
    }

    // Fill Completely: Try to fill the bottle all the way up
    public boolean remplirComplet() {
        if (this.ouvert && this.contenuEnL != this.contenanceEnL) {
            this.contenuEnL = this.contenanceEnL;
            return true;
        }
        return false;
    }

    // Empty Completely: Try to pour out all the drink in the bottle
    public boolean viderComplet() {
        if (this.ouvert && this.contenuEnL != 0) {
            this.contenuEnL = 0;
            return true;
        }
        return false;
    }
}
