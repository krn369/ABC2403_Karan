package bureauElectrique;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		
  // Create an instance of Bureau
        Bureau bureauSimple = new Bureau(new BigDecimal("150"), new BigDecimal("75"), new BigDecimal("80"));

        // Print initial dimensions of bureauSimple
        System.out.println("Dimensions du bureau simple :");
        System.out.println("Largeur : " + bureauSimple.getLargeurEnCM() + " cm");
        System.out.println("Longueur : " + bureauSimple.getLongueurEnCM() + " cm");
        System.out.println("Hauteur : " + bureauSimple.getHauteurEnCM() + " cm");

        // Positionner le bureauSimple à une hauteur de 85 cm
        boolean success = bureauSimple.PositionnerALaHauteur(new BigDecimal("85"));
        System.out.println("Positionner le bureau simple à 85 cm : " + success);
        System.out.println("Nouvelle hauteur du bureau simple : " + bureauSimple.getHauteurEnCM() + " cm");

        // Create an instance of BureauElectrique
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
