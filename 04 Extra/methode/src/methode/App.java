package methode;



public class App {

	public static void main(String[] args) {
		
		double resultat = App.additionner(2.6, 5.8);
		System.out.println(resultat);

		/*
		 * import java.time.LocalDateTime;
		 * import java.time.format.DateTimeFormatter;
		 * LocalDateTime maintenant = LocalDateTime.now();
		 * 
		 * DateTimeFormatter formateur =
		 * DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); String formateDateHeure =
		 * maintenant.format(formateur);
		 * 
		 * System.out.println("La Date et L'heure du moment est : " + formateDateHeure);
		 */
	}

	public static double additionner(double valeur1, double valeur2) {
		
		double somme = 0;
		
		somme = valeur1 + valeur2;
		
		return somme;
	}
}
