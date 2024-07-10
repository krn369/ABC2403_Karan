# Exercice 3.5 : La factorielle
Écrire un algorithme qui demande à l’utilisateur de saisir un nombre, et qui calcule et affiche sa factorielle.

Par exemple, si l’utilisateur saisit le nombre 8, le programme doit afficher :

La factorielle de 8 est: 40320

NB : la factorielle de 8, notée 8!, vaut 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8

````
VARIABLES

	nombre est un ENTIER
	fact est un ENTIER
	i est un ENTIER

TRAITEMENT

	// Demander à l'utilisateur de saisir un nombre
	ECRIRE "Saisissez un nombre : "
	LIRE nombre

	// Vérifier si le nombre est négatif
	SI nombre < 0 ALORS
		ECRIRE "La factorielle n'est pas définie pour les nombres négatifs."
	SINON
		// Initialiser la factorielle à 1
		fact <-- 1

		// Boucle pour calculer la factorielle
		POUR i DE 1 À nombre FAIRE
			fact <-- fact * i
		FIN POUR

		// Afficher la factorielle calculée
		ECRIRE "La factorielle de ", nombre, " est : ", fact
	FIN SI

RESULTAT

FIN
````