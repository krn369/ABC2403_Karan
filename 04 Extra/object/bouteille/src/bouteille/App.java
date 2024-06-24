package bouteille;

public class App {

	public static void main(String[] args) {

        // Create a Coca bottle
	// A bottle of Coca is created with a capacity of 1.5 liters, currently holding 1 liter of Coca, and it is initially closed.
	// A message is printed to confirm the creation of the Coca bottle.
		
        Bouteille coca = new Bouteille(1.5f, 1.0f, false, "Coca");
        System.out.println("Bouteille de Coca créée avec " + coca.contenuEnL + "L de " + coca.typeDeContenu);

        // Open the Coca bottle and fill it completely
        coca.ouvrir();
        coca.remplirComplet();
        System.out.println("La bouteille de Coca est maintenant remplie à " + coca.contenuEnL + "L");

        // Create a H2O bottle
        Bouteille h2o = new Bouteille();
        System.out.println("Bouteille H2O créée avec " + h2o.contenuEnL + "L de " + h2o.typeDeContenu);

        // Open the H2O bottle and empty it completely
        h2o.ouvrir();
        h2o.viderComplet();
        System.out.println("La bouteille H2O est maintenant vidée " + h2o.contenuEnL + "L");

        // Create a wine bottle
        Bouteille wine = new Bouteille(0.75f, 0.75f, true, "Wine");
        System.out.println("Bouteille de vin créée avec " + wine.contenuEnL + "L de " + wine.typeDeContenu);

        // Empty some wine from the bottle
        wine.vider(0.25f);
        System.out.println("La bouteille de vin contient désormais " + wine.donneContenanceEnCL() + "CL après avoir versé 25 CL");	

	}

}
