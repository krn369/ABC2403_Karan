# Exercice 3.6 : Et le plus grand est…
Érire un algorithme qui demande successivement 20 nombres à l’utilisateur, et qui lui inqique ensuite quel est le plus grand parmi ces 20 nombres.

Exemple de fonctionnement du programme :

Entrez le nombre numéro 1 : 12
Entrez le nombre numéro 2 : 14
etc...
Entrez le nombre numéro 20: 6

Résultat : 
Le plus grand des nombres saisis est : 14.
14 était le nombre numéro 2.



````
VARIABLES

	nombreCourant est un ENTIER
	plusGrandNombre est un ENTIER (initialisé à -∞)
	numeroDuPlusGrandNombre est un ENTIER (initialisé à 0)
	i est un ENTIER

TRAITEMENT

	// Boucle pour demander et stocker 20 nombres
	POUR i DE 1 À 20 FAIRE
		ECRIRE "Entrez le nombre numéro ", i, " : "
		LIRE nombreCourant

		// Mettre à jour le plus grand nombre si nécessaire
		SI nombreCourant > plusGrandNombre ALORS
			plusGrandNombre <-- nombreCourant
			numeroDuPlusGrandNombre <-- i
		FIN SI
	FIN POUR

	// Afficher le plus grand nombre et son numéro
	ECRIRE "Le plus grand des nombres saisis est : ", plusGrandNombre
	ECRIRE "14 était le nombre numéro ", numeroDuPlusGrandNombre

RESULTAT

FIN

````