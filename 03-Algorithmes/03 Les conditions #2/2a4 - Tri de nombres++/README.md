# Exercice 2a.4 : Tri de nombres++
Lire 3 nombres entier A, B et C puis les afficher dans l’ordre décroissant.

````
VARIABLES

	nombreA est un ENTIER
	nombreB est un ENTIER
	nombreC est un ENTIER
	

TRAITEMENT

	
	ECRIRE "Saisissez le premier nombre : "
	LIRE nombreA
	ECRIRE "Saisissez le deuxième nombre : "
	LIRE nombreB
	ECRIRE "Saisissez le troisième nombre : "
	LIRE nombreC

	
	SI (nombreC < nombreB && nombreB < nombreA ) 
			System.out.println("Dans l'ordre décroissant : " + nombreA + ", " + nombreB + ", " + nombreC);
		FINSI
		SINON SI (nombreB < nombreC && nombreC < nombreA ) ALORS
			System.out.println("Dans l'ordre décroissant : " + nombreA + ", " + nombreC + ", " + nombreB);
		FINSI
		SINON SI (nombreA < nombreC && nombreC < nombreB ) ALORS
			System.out.println("Dans l'ordre décroissant : " + nombreB + ", " + nombreC + ", " + nombreA);
		FINSI
		SINON SI (nombreC < nombreA && nombreA < nombreB ) ALORS
			System.out.println("Dans l'ordre décroissant : " + nombreB + ", " + nombreA + ", " + nombreC);
		FINSI
		SINON SI (nombreA < nombreB && nombreB < nombreC ) ALORS
			System.out.println("Dans l'ordre décroissant : " + nombreC + ", " + nombreB + ", " + nombreA);
		FINSI
	
		SINON 
			ALORS
				System.out.println("Dans l'ordre décroissant : " + nombreC + ", " + nombreA + ", " + nombreB);
		FINSI

RESULTAT

FIN

````