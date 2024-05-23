# Exercice 3.7 : Et le plus grand est… encore.
Réécrire l’algorithme précédent, mais cette fois-ci on ne connaît pas d’avance combien l’utilisateur souhaite saisir de nombres. La saisie des nombres s’arrête lorsque l’utilisateur entre un zéro.


````
VARIABLES

	nombreCourant est un ENTIER
	plusGrandNombre est un ENTIER (initialisé à -∞)
	numeroDuPlusGrandNombre est un ENTIER (initialisé à 0)
	compteurNombres est un ENTIER

TRAITEMENT

	// Boucle pour lire les nombres jusqu'à l'entrée d'un 0
	TANT QUE nombreCourant !<-- 0 FAIRE
		compteurNombres <-- compteurNombres + 1
		ECRIRE "Entrez le nombre numéro ", compteurNombres, " (0 pour quitter) : "
		LIRE nombreCourant

		// Mettre à jour le plus grand nombre si nécessaire
		SI nombreCourant > plusGrandNombre ALORS
			plusGrandNombre <-- nombreCourant
			numeroDuPlusGrandNombre <-- compteurNombres
		FIN SI
	FIN TANT QUE

	// Vérifier si au moins un nombre a été saisi
	SI compteurNombres = 0 ALORS
		ECRIRE "Aucun nombre n'a été saisi."
	SINON
		// Afficher le plus grand nombre et son numéro
		ECRIRE "Le plus grand des nombres saisis est : ", plusGrandNombre
		ECRIRE "14 était le nombre numéro ", numeroDuPlusGrandNombre
	FIN SI

RESULTAT

FIN

````