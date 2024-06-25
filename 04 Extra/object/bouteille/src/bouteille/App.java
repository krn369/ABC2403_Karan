// Create a class named Bouteille that represents a bottle. The class should have attributes for the bottle's capacity,
// current liquid amount, whether it is open or closed, and the type of liquid. Implement constructors for creating bottles with 
// default properties, specific properties, and copying another bottle. Add methods to check if the bottle is full, open or close the bottle,
// fill or empty the bottle by specific amounts, and completely fill or empty the bottle.

// Créez une classe nommée Bouteille qui représente une bouteille. La classe doit avoir des attributs concernant la capacité de la bouteille,
// la quantité actuelle de liquide, si elle est ouverte ou fermée et le type de liquide. Implémentez des constructeurs pour créer des 
// bouteilles avec des propriétés par défaut, des propriétés spécifiques et copier une autre bouteille. Ajoutez des méthodes pour 
// vérifier si la bouteille est pleine, ouvrir ou fermer la bouteille, remplir ou vider la bouteille selon des quantités spécifiques et 
// remplir ou vider complètement la bouteille.

// This question tests understanding of:

// Class attributes and methods
// Constructors, including default, parameterized, and copy constructors
// Basic logic for implementing methods with conditions and return values

	

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
