# Écrire un algorithme qui demande un nombre de départ, et qui calcule et affiche la somme des entiers jusqu’à ce nombre.

Par exemple, si l’utilisateur saisit le nombre 5, le programme doit afficher :

La somme des nombres jusque 5 est: 15

NB : on souhaite afficher uniquement le résultat, pas la décomposition du calcul.

````
VARIABLES

	nombreLimite est un ENTIER
	somme est un ENTIER

TRAITEMENT

	// Demander le nombre limite à l'utilisateur
	ECRIRE "Saisissez un nombre limite : "
	LIRE nombreLimite

	// Initialiser la somme à 0
	somme <-- 0

	// Boucle pour calculer la somme des entiers jusqu'à nombreLimite
	POUR i DE 1 À nombreLimite FAIRE
		somme <-- somme + i
	FIN POUR

	// Afficher la somme calculée
	ECRIRE "La somme des nombres jusqu'à ", nombreLimite, " est : ", somme

RESULTAT

FIN

````