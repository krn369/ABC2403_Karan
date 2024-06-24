package bouteille;

public class App {

	public static void main(String[] args) {

        // Create a Coca bottle
        Bouteille coca = new Bouteille(1.5f, 1.0f, false, "Coca");
        System.out.println("Coca bottle created with " + coca.contenuEnL + "L of " + coca.typeDeContenu);

        // Open the Coca bottle and fill it completely
        coca.ouvrir();
        coca.remplirComplet();
        System.out.println("Coca bottle is now filled to " + coca.contenuEnL + "L");

        // Create a H2O bottle
        Bouteille h2o = new Bouteille();
        System.out.println("H2O bottle created with " + h2o.contenuEnL + "L of " + h2o.typeDeContenu);

        // Open the H2O bottle and empty it completely
        h2o.ouvrir();
        h2o.viderComplet();
        System.out.println("H2O bottle is now emptied to " + h2o.contenuEnL + "L");

        // Create a wine bottle
        Bouteille wine = new Bouteille(0.75f, 0.75f, true, "Wine");
        System.out.println("Wine bottle created with " + wine.contenuEnL + "L of " + wine.typeDeContenu);

        // Empty some wine from the bottle
        wine.vider(0.25f);
        System.out.println("Wine bottle now contains " + wine.contenuEnL + "L after pouring out 0.25L");	

	}

}
