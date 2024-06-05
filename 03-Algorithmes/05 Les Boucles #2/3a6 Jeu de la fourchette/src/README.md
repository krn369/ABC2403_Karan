#  Exercice 3a.6 : Jeu de la fourchette
L’ordinateur « choisit » aléatoirement un nombre mystère (entier compris entre 0 et 100).
Le joueur essaie de le deviner.
Lors de chaque essai, l’ordinateur affiche la « fourchette » dans laquelle se trouve le nombre qu’il a choisi.

Le choix du nombre mystère sera simulé par génération d’un nombre aléatoire : N <-- RANDOM(0,100).

Lorsque l’utilisateur a trouvé le nombre mystère, le programme affiche :

Bravo vous avez trouvé en X essais.


````
VARIABLES

	nombreMystere est un ENTIER (généré aléatoirement entre 0 et 100)
	nombreChoisi par l'utilisateur est un ENTIER
	nombreEssais est un ENTIER (initialisé à 0)
	trouve est un BOOLEEN (initialisé à FAUX)

TRAITEMENT

	// Génération du nombre mystère
	nombreMystere <-- RANDOM(0, 100)

	// Boucle principale du jeu
	TANT QUE trouve = FAUX FAIRE
		nombreEssais <-- nombreEssais + 1

		// Demander à l'utilisateur de saisir un nombre
		ECRIRE "Saisissez un nombre entre 0 et 100 : "
		LIRE nombreChoisi par l'utilisateur

		// Vérifier si le nombre choisi est le nombre mystère
		SI nombreChoisi par l'utilisateur = nombreMystere ALORS
			trouve <-- VRAI
		SINON
			// Afficher la fourchette dans laquelle se trouve le nombre mystère
			SI nombreChoisi par l'utilisateur < nombreMystere ALORS
				ECRIRE "Le nombre mystère est supérieur à ", nombreChoisi par l'utilisateur, "."
			SINON
				ECRIRE "Le nombre mystère est inférieur à ", nombreChoisi par l'utilisateur, "."
			FIN SI
		FIN SI
	FIN TANT QUE

	// Afficher le résultat final
	ECRIRE "Bravo, vous avez trouvé le nombre mystère en ", nombreEssais, " essais !"

RESULTAT
````