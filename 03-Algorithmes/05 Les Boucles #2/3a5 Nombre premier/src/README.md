# Exercice 3a.5 : Nombre premier
Lire un nombre N et déterminer s’il est un nombre premier.

Un nombre premier n’est divisible que par 1 et par lui-même.


````
VARIABLES

	nombre est un ENTIER
	diviseur est un ENTIER
	estPremier est un BOOLEEN (initialisé à VRAI)

TRAITEMENT

	// Demander à l'utilisateur de saisir un nombre
	ECRIRE "Saisissez un nombre entier : "
	LIRE nombre

	// Vérifier si le nombre est inférieur ou égal à 1
	SI nombre <= 1 ALORS
		estPremier <-- FAUX
	FIN SI

	// Vérifier si le nombre est divisible par des nombres de 2 à la racine carrée du nombre
	POUR diviseur DE 2 À RACINE(nombre) FAIRE
		// Vérifier si le nombre est divisible par le diviseur
		SI nombre MOD diviseur = 0 ALORS
			estPremier <-- FAUX
			FIN SI
	FIN POUR

	// Afficher le résultat
	SI estPremier = VRAI ALORS
		ECRIRE nombre, " est un nombre premier."
	SINON
		ECRIRE nombre, " n'est pas un nombre premier."
	FIN SI

RESULTAT
FIN

````