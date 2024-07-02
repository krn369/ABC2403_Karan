package insertionDansUnTableuOrdonne;

import java.util.*; 

public class App {

    public static void main(String[] args) {
  
    	
    	int[] tableau = {1, 4, 5, 10, 20, 22, 25, 30, 32};
    	
    	System.out.print("Original version : ");
    	
    	printTableau(tableau);
    	
    	tableau = newTableau(tableau);
    	
    	System.out.print("New version : ");
    	
    	printTableau(tableau);
    	    	
    	}
    	 
    
    public static void printTableau(int[]tableau) {
    	
    		
    	for(int i = 0; i<tableau.length; i++) {
    		
    		System.out.print(tableau[i] + " ");
    	}
    	   	
}
    public static int[] newTableau(int[]tableau) {
    	
    	int[] newTableau = new int[tableau.length+1];
    	for(int i = 0; i<tableau.length; i++) {
    		newTableau[i] = tableau[i]; }
    	
    	Scanner sc = new Scanner(System.in);
        	System.out.println("\nEntrez un nombre à ajouter au tableau : ");
    	newTableau[newTableau.length-1] = sc.nextInt();
    	
    	sc.close();
    	
        Arrays.sort(newTableau);
        
    	
    	return newTableau; 	
    
    }
    
    
    }

    