# Exercice 3.8 : Paiement et rendu monnaie
Écrire un algorithme qui demande à l’utilisateur de saisir des prix en € (nombre à 1 décimale) correspondant aux achats d’un client. Lorsque l’utilisateur saisit le nombre 0, on estime que la saisie est temrinée. Le programme calcule et affiche la somme totale à payer.

On estime que le client paie uniquement avec des billets de 5€.

Afficher ensuite :

Le nombre de billets de 5€ qu’il doit donner pour payer la somme dûe.
La somme à rendre par le magasin
La répartition optimale des billets / pièces à rendre au client (pièces disponibles : 0.10€ 0.20€, 0.50€, 1€, 2€).
Exemple :

Saisir un prix : 12.5
Saisir un prix : 9.3
Saisir un prix : 15.9
Saisir un prix : 0

Le client doit payer : 37.70 Euros.
Le client doit donner 8 billets de 5 Euros soit 40 Euros.
Rendu monnaie : 2.30 Euros
Répartition de la monnaie à restituer au client : 
- 1 pièce de 2 Euros
- 2 pièces de 0.20 Euros
- 1 pièce de 0.10 Euros

````

VARIABLES

	prixCourant est un DECIMAL
	sommeTotale est un DECIMAL
	nombreBillets5Euros est un ENTIER
	resteAPayer est un DECIMAL
	piece2Euros est un ENTIER
	piece20Centimes est un ENTIER
	piece10Centimes est un ENTIER

TRAITEMENT

	// Initialiser les variables
	sommeTotale <-- 0.0
	nombreBillets5Euros <-- 0
	resteAPayer <-- 0.0
	piece2Euros <-- 0
	piece20Centimes <-- 0
	piece10Centimes <-- 0

	// Boucle pour lire les prix jusqu'à l'entrée d'un 0
	TANT QUE prixCourant <> 0 FAIRE
		ECRIRE "Saisissez un prix (0 pour quitter) : "
		LIRE prixCourant

		// Ajouter le prix courant à la somme totale
		sommeTotale <-- sommeTotale + prixCourant
	FIN TANT QUE

	// Calculer le montant à payer en billets de 5€
	nombreBillets5Euros <-- ENTIER(sommeTotale / 5.0)

	// Calculer le reste à payer après les billets de 5€
	resteAPayer <-- sommeTotale - (nombreBillets5Euros * 5.0)

	// Afficher le montant à payer
	ECRIRE "Le client doit payer : ", sommeTotale, " Euros."

	// Afficher le nombre de billets de 5€
	ECRIRE "Le client doit donner ", nombreBillets5Euros, " billets de 5 Euros soit ", nombreBillets5Euros * 5.0, " Euros."

	// Afficher le reste à rendre
	ECRIRE "Rendu monnaie : ", resteAPayer, " Euros."

	// Distribuer les pièces de monnaie en optimisant la quantité
	TANT QUE resteAPayer >= 2.0 FAIRE
		resteAPayer <-- resteAPayer - 2.0
		piece2Euros <-- piece2Euros + 1
	FIN TANT QUE

	TANT QUE resteAPayer >= 0.5 FAIRE
		resteAPayer <-- resteAPayer - 0.5
		piece20Centimes <-- piece20Centimes + 1
	FIN TANT QUE

	TANT QUE resteAPayer >= 0.1 FAIRE
		resteAPayer <-- resteAPayer - 0.1
		piece10Centimes <-- piece10Centimes + 1
	FIN TANT QUE

	// Afficher la répartition des pièces de monnaie
	ECRIRE "Répartition de la monnaie à restituer au client :"
	SI piece2Euros > 0 ALORS
		ECRIRE " - ", piece2Euros, " pièce(s) de 2 Euros"
	FIN SI
	SI piece20Centimes > 0 ALORS
		ECRIRE " - ", piece20Centimes, " pièce(s) de 0.20 Euros"
	FIN SI
	SI piece10Centimes > 0 ALORS
		ECRIRE " - ", piece10Centimes, " pièce(s) de 0.10 Euros"
	FIN SI

RESULTAT
FIN

````