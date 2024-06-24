package bureauElectrique;

import java.math.BigDecimal;

public class BureauElectrique extends Bureau{


    private boolean branche;
    private final BigDecimal hauteur1EnCM;
    private final BigDecimal hauteur2EnCM;
    private final BigDecimal hauteur3EnCM;
    private final BigDecimal hauteurMaxEnCM;
    private final BigDecimal hauteurMinEnCM;

    // Constructor with parameters
    public BureauElectrique(BigDecimal hauteurMinEnCM, BigDecimal hauteurMaxEnCM, BigDecimal hauteurEnCM, BigDecimal hauteur3EnCM,
                            BigDecimal hauteur2EnCM, BigDecimal hauteur1EnCM, boolean branche) {
        super(null, null, hauteurEnCM);  // Passing null for largeurEnCM and longueurEnCM as they are not used in this context
        this.branche = branche;
        this.hauteur1EnCM = hauteur1EnCM;
        this.hauteur2EnCM = hauteur2EnCM;
        this.hauteur3EnCM = hauteur3EnCM;
        this.hauteurMinEnCM = hauteurMinEnCM;
        this.hauteurMaxEnCM = hauteurMaxEnCM;
    }

    // Copy constructor
    public BureauElectrique(BureauElectrique bureauElectriqueACopier) {
        super(bureauElectriqueACopier);  // Call the superclass copy constructor
        this.branche = bureauElectriqueACopier.branche;
        this.hauteur1EnCM = bureauElectriqueACopier.hauteur1EnCM;
        this.hauteur2EnCM = bureauElectriqueACopier.hauteur2EnCM;
        this.hauteur3EnCM = bureauElectriqueACopier.hauteur3EnCM;
        this.hauteurMaxEnCM = bureauElectriqueACopier.hauteurMaxEnCM;
        this.hauteurMinEnCM = bureauElectriqueACopier.hauteurMinEnCM;
    }

    // Methods
    public boolean Brancher() {
        this.branche = true;
        return this.branche;
    }

    public boolean DeBrancher() {
        this.branche = false;
        return this.branche;
    }

    public boolean Descendre(BigDecimal differenceHauteur) {
        BigDecimal nouvelleHauteur = this.hauteurEnCM.subtract(differenceHauteur);
        if (nouvelleHauteur.compareTo(this.hauteurMinEnCM) >= 0) {
            this.hauteurEnCM = nouvelleHauteur;
            return true;
        }
        return false;
    }

    public boolean Monter(BigDecimal differenceHauteur) {
        BigDecimal nouvelleHauteur = this.hauteurEnCM.add(differenceHauteur);
        if (nouvelleHauteur.compareTo(this.hauteurMaxEnCM) <= 0) {
            this.hauteurEnCM = nouvelleHauteur;
            return true;
        }
        return false;
    }

    @Override
    public boolean PositionnerALaHauteur(BigDecimal hauteur) {
        if (hauteur.compareTo(hauteurMinEnCM) >= 0 && hauteur.compareTo(hauteurMaxEnCM) <= 0) {
            this.hauteurEnCM = hauteur;
            return true;
        }
        return false;
    }

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
