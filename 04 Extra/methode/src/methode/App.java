package methode;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

	public static void main(String[] args) {

		LocalDateTime maintenant = LocalDateTime.now();

		DateTimeFormatter formateur = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formateDateHeure = maintenant.format(formateur);

		System.out.println("La Date et L'heure du moment est : " + formateDateHeure);

	}

}
