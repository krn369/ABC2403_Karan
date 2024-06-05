# Exercice 3a.7 : Barnabé fait ses courses
Barnabé fait ses courses dans plusieurs magasins.

Dans chacun, il dépense 1 € de plus que la moitié de ce qu’il possédait en entrant.

Dans le dernier magasin, il dépense le solde.

Soit la somme S dont il disposait au départ (S > 1 €).

Représenter l’algorithme permettant de trouver le nombre de magasins dans lesquels il a acheté.



````
VARIABLES

	argentDepart est un ENTIER (représentant l'argent initial de Barnabé)
	nombreMagasins est un ENTIER (initialisé à 0)
	depenseParMagasin est un ENTIER

TRAITEMENT

	// Vérifier si l'argent initial est supérieur à 1 €
	SI argentDepart <= 1 ALORS
		ECRIRE "Barnabé n'a pas pu faire d'achats."
		FIN SI

	// Boucle pour simuler les achats dans chaque magasin
	TANT QUE argentDepart > 0 FAIRE
		nombreMagasins <-- nombreMagasins + 1

		// Calculer la dépense dans le magasin actuel
		depenseParMagasin <-- (argentDepart / 2)+ 1 // 1 € de plus que la moitié
		argentDepart <-- argentDepart - depenseParMagasin // Mettre à jour l'argent restant

	FIN TANT QUE

	// Afficher le nombre de magasins visités
	ECRIRE "Barnabé a acheté dans ", nombreMagasins, " magasins."

RESULTAT
FIN

````