package bureauElectrique;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		
		// Create an instance of BureauElectrique
		
		BureauElectrique bureau = new BureauElectrique( new BigDecimal("64"),new BigDecimal("120"),
				new BigDecimal("80"),new BigDecimal("100"),new BigDecimal("75"),new BigDecimal("75"),true );
		
		// Brancher le bureau
		
		bureau.DeBrancher();
		
		// Try to set height to 90 
		
		boolean success = bureau.PositionnerALaHauteur(new BigDecimal("90"));
		
		System.out.println("Positionner à 90 : " + success);
		
		//Descender le bureau par 10 units
		
		success = bureau.Descendre(new BigDecimal("10"));
		System.out.println("Descender par 10 : " + success);
		
		// Imprimer le actuel hauteur
		
		System.out.println(" Hauteur Actuel : " + bureau.getHauteurEnCM());
		
		
		// Create an instance of BureauElectrique for bureauWafae
		
		BureauElectrique bureauWafae = new BureauElectrique( new BigDecimal("64"),new BigDecimal("100"),
				new BigDecimal("80"),new BigDecimal("100"),new BigDecimal("75"),new BigDecimal("75"),true );
		
		// Create an instance of BureauElectrique for bureauJP
		
		BureauElectrique bureauJP = new BureauElectrique( new BigDecimal("70"),new BigDecimal("120"),
				new BigDecimal("80"),new BigDecimal("110"),new BigDecimal("73"),new BigDecimal("70"),true );
		
		// Brancher the bureaus
		
		bureauWafae.Brancher();
		bureauJP.Brancher();
		
		
		// Imprimer les hauteurs initial
		
		System.out.println("La hauteur initiale du bureauWafae est :" + bureauWafae.getHauteurEnCM());
		
		System.out.println("La hauteur initiale du bureauJP est :" + bureauJP.getHauteurEnCM());

	}

}
