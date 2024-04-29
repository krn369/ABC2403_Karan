package exerciceMath;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
    	
    	Scanner sc;
    	
    	sc = new Scanner(System.in);

        System.out.println("Veuillez entrer le rayon de la sphère: ");
        double radius = sc.nextDouble();

        // Calculer et afficher la surface sur une seule ligne
        System.out.println("L’aire de la sphère est : " + 4 * Math.PI * radius * radius);

        // Calculer et afficher le volume sur une seule ligne
        System.out.println("Le volume de la sphère est : " + (4.0 / 3.0) * Math.PI * radius * radius * radius);  
        
    	 
    	for (int a = 0; a <=100; a = a++ );
    		
    	sc.close();
    }	
    	 
    	
    	
       
}