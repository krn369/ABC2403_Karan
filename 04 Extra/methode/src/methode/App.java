package methode;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

	public static void main(String[] args) {

		System.out.print("La Date et L'heure du moment est : " );
		App.afficherJourHeureDuMoment();

		

	}
	
	public static void afficherJourHeureDuMoment() {
		
		SimpleDateFormat s= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date date = new Date();
		
		System.out.println(s.format(date));
		
		
	}

}
