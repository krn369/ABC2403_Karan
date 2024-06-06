package bouteille;

public class App {

	public static void main(String[] args) {

		Bouteille bouteille1 = new Bouteille();

		float a = 1.2f;

		Bouteille bouteille2 = new Bouteille(a, 0.8f, true, "H2O");

		Bouteille bouteille3 = new Bouteille(bouteille2);

		float contenanceEnClDeBouteille2 = bouteille2.donneContenanceEnCL();

	}

}
