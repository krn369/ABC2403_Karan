# Exercice 3a.4 : Recherche des diviseurs d’un nombre.
Lire un nombre entier et afficher tous ses diviseurs autres que 1 et lui-même.

Aide : https://www.mathematiquesfaciles.com/nombres-premiers-multiples-diviseurs_2_41090.htm


````
VARIABLES

	nombre est un ENTIER
	diviseur est un ENTIER

TRAITEMENT

	// Demander à l'utilisateur de saisir un nombre
	ECRIRE "Saisissez un nombre entier : "
	LIRE nombre

	// Vérifier si le nombre est inférieur ou égal à 1
	SI nombre <= 1 ALORS
		ECRIRE "Le nombre n'a pas de diviseurs autres que 1 et lui-même."
		FIN SI

	// Afficher les diviseurs de 2 à la racine carrée du nombre
	POUR diviseur DE 2 À RACINE(nombre) FAIRE
		// Vérifier si le nombre est divisible par le diviseur
		SI nombre MOD diviseur = 0 ALORS
			ECRIRE diviseur
		FIN SI
	FIN POUR

RESULTAT
FIN

````