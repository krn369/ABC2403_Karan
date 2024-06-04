package intervalleEntre2Nombres;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombreA;
		int nombreB;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Saisissez le nombre A : ");
		nombreA = sc.nextInt();
		
		System.out.print("Saisissez le nombre B :");
		nombreB = sc.nextInt();
		
		if (nombreA > nombreB) {
			
			int nombreTemp = nombreA;
			nombreA = nombreB;
			nombreB = nombreTemp;
			
		}
		
		System.out.println("\nNombres entiers dans l'intervalle ascendant : ");
		for(int i = nombreA; i <= nombreB; i++) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}

}
