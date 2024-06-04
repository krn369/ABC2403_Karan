package methodeAddition;

public class App {

	public static void main(String[] args) {

		double resultat = App.additionner(2.6, 5.8);
		System.out.println(resultat);

	}

	public static double additionner(double valeur1, double valeur2) {

		double somme = 0;

		somme = valeur1 + valeur2;

		return somme;
	}

}
