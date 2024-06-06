# Exercice 4.2 : Créer un tableau de chaines de caractères
Écrire un algorithme qui déclare et remplit un tableau contenant les six voyelles de l’alphabet latin.

````
VARIABLES

	voyelles est un tableau de caractères (taille: 6)
	compteurVoyelles est un entier (initialisé à 0)

TRAITEMENT

	// Déclarer le tableau 'voyelles' avec 6 éléments
	voyelles: tableau de caractères(6)

	// Voyelles de l'alphabet latin
	voyellesAlphabet: caractère(6) = "aeiouy"

	// Remplir le tableau 'voyelles' avec les voyelles de l'alphabet latin
	POUR i DE 0 À 5
		voyelles[i] ← voyellesAlphabet[i]
		compteurVoyelles ← compteurVoyelles + 1
	FIN POUR

RESULTAT
	// Le tableau 'voyelles' est rempli des six voyelles de l'alphabet latin: a, e, i, o, u, y
	// La variable 'compteurVoyelles' indique le nombre de voyelles ajoutées (6)
FIN

````