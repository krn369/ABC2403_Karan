package bureauElectrique;

import java.math.BigDecimal;

public class BureauElectrique extends Bureau{

	private boolean branche;
	private BigDecimal hauteurEnCM;
	private final BigDecimal hauteur1EnCM;
	private final BigDecimal hauteur2EnCM;
	private final BigDecimal hauteur3EnCM;
	private final BigDecimal hauteurMaxEnCM;
	private final BigDecimal hauteurMinEnCM;
	
	// Constructor
	
	public BureauElectrique(BureauElectrique bureauElectriqueACopier) {
		
		this.branche = bureauElectriqueACopier.branche;
		this.hauteurEnCM = bureauElectriqueACopier.hauteurEnCM;
		this.hauteur1EnCM = bureauElectriqueACopier.hauteur1EnCM;
		this.hauteur2EnCM = bureauElectriqueACopier.hauteur2EnCM;
		this.hauteur3EnCM = bureauElectriqueACopier.hauteur3EnCM;
		this.hauteurMaxEnCM = bureauElectriqueACopier.hauteurMaxEnCM;
		this.hauteurMinEnCM = bureauElectriqueACopier.hauteurMinEnCM;
		
	}
	
	// Constructor with parameters 
	
	public BureauElectrique(BigDecimal hauteurMinEnCM, BigDecimal hauteurMaxEnCM, BigDecimal hauteurEnCM, BigDecimal hauteur3EnCM,
			BigDecimal hauteur2EnCM, BigDecimal hauteur1EnCM, boolean branche) {
		
		this.branche = branche;
		this.hauteurEnCM = hauteurEnCM;
		this.hauteur1EnCM = hauteur1EnCM;
		this.hauteur2EnCM = hauteur2EnCM;
		this.hauteur3EnCM = hauteur3EnCM;
		this.hauteurMinEnCM = hauteurMinEnCM;
		this.hauteurMaxEnCM = hauteurMaxEnCM;
		
	}
	
	public boolean Brancher() {
		this.branche = true;
		return this.branche;
	}
	
	public boolean DeBrancher() {
		
		this.branche = false;
		return this.branche;
	}
	
	public boolean Descendre (BigDecimal differenceHauteur) {
		
		BigDecimal nouveauHauteur = this.hauteurEnCM.subtract(differenceHauteur);
		
		if (nouveauHauteur.compareTo(this.hauteurMinEnCM) >= 0 ) {
			
			this.hauteurEnCM = nouveauHauteur;
			return true;
		}
		return false;
	}
	
	public boolean Monter(BigDecimal differenceHauteur) {
		
		BigDecimal nouveauHauteur = this.hauteurEnCM.add(differenceHauteur);
		if(nouveauHauteur.compareTo(this.hauteurMaxEnCM)<= 0) {
			
			this.hauteurEnCM = nouveauHauteur;
			return true;
		}
		return false;
	}
	
	public boolean PositionnerALaHauteur(BigDecimal hauteur) {
		
		if(hauteur.compareTo(hauteurMinEnCM) >= 0 && hauteur.compareTo(hauteurMaxEnCM) <= 0){
			
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
	
	
	// Getter method for hauteurEnCM
	
	public BigDecimal getHauteurEnCM() {
		return this.hauteurEnCM;
	}
}
