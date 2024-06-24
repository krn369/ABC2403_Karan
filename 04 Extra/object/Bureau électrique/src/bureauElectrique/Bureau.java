package bureauElectrique;

import java.math.BigDecimal;

public class Bureau {
    protected BigDecimal hauteurEnCM;
    protected BigDecimal largeurEnCM;
    protected BigDecimal longueurEnCM;

    // Default constructor
    public Bureau() {}

    // Parameterized constructor
    public Bureau(BigDecimal largeurEnCM, BigDecimal longueurEnCM, BigDecimal hauteurEnCM) {
        this.largeurEnCM = largeurEnCM;
        this.longueurEnCM = longueurEnCM;
        this.hauteurEnCM = hauteurEnCM;
    }

    // Copy constructor
    public Bureau(Bureau bureauACopier) {
        this.largeurEnCM = bureauACopier.largeurEnCM;
        this.longueurEnCM = bureauACopier.longueurEnCM;
        this.hauteurEnCM = bureauACopier.hauteurEnCM;
    }

    // Method to position the desk at a specific height
    public boolean PositionnerALaHauteur(BigDecimal hauteur) {
        if (hauteur.compareTo(BigDecimal.ZERO) >= 0) {
            this.hauteurEnCM = hauteur;
            return true;
        }
        return false;
    }

    // Getter for hauteurEnCM
    public BigDecimal getHauteurEnCM() {
        return hauteurEnCM;
    }
}
