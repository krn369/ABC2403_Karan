package sommeDesValeursDe2Tableaux;

public class App {

	public static void main(String[] args) {

		// à partir de deux tableaux d'entiers précédemment saisis,
		// écrivez un algorithme qui cqlcule lq somme des produits des deux tableux.
		// Pour calculer le résultat,
		// il faut multiplier chaque élément du tableau 1 par chaque élément du tableau 2,
		// et additionner le tout.
		
		int[] tableau1; // Déclaration du 1er tableau
		int[] tableau2; // Déclaration du 2nd tableau
		int resultatTableau; // résultat du calcul
		
		resultatTableau = 0; // Initialisation du résultat à 0
		tableau1 = new int[] { 4, 8, 7, 12}; // Initialisation du 1er tableau
		tableau2 = new int[] { 3,6};
		
		/*
		 * POUR i de 0 à tableau1.length-1, incrémenter i POUR j de 0 à
		 * tableau2.length-1 incrémenter j resultatTableau = resultatTableau +
		 * tableau1[i] * tableau2[2] FIN POUR FIN POUR
		 */	
		
		for(int i=0; i < tableau1.length; i++) {
			
			for(int j=0; j < tableau2.length; j++) {
				
				resultatTableau += tableau1[i] * tableau2[j];
			}
		}
		
		System.out.println(resultatTableau);
	}
}
