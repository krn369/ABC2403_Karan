package tableauDentiers;

public class App {

	public static void main(String[] args) {
		
		// Ecrire un algorithme calculant la somme des valeurs d'un tableau
		// On suppose que le tableau a été préqlqblement saisi avec 10 nombres réels (float)
		
		int i; // utilisé pour la boucle for 
		float somme; // somme des valeurs du tableau
		float [] tableau; // Le tableau
		
		tableau = new float []
				{ 13.37f,14.5f,987.045f,1.01f,3.45f,0.02f,7.45f,42f,};
				
		somme = 0;
		
		for(i= 0; i < tableau.length; i++) {
			// somme = somme + tableau[i];
			somme+= tableau[i];
		}
		
		System.out.println("La somme des valeurs du tableau est : " + somme);
	}

}
