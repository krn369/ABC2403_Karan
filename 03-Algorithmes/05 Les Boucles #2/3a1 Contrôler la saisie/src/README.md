# Exercice 3a.1 : Contrôler la saisie
L’utilisateur est invité à saisir son prénom.

Le programme affiche ensuite “Bonjour” suivi du prénom saisi.

Le prénom doit contenir au moins 2 caractères.

Si le prénom contient moins de 2 caractères, l’utilisateur doit recommencer la saisie.

L’utilisateur dispose d’un nombre d’essai illimité.


````
VARIABLES

	prenom est une CHAINE
	nombreEssais est un ENTIER (initialisé à 0)
	prenomValide est un BOOLEEN (initialisé à FAUX)

TRAITEMENT

	// Boucle pour demander le prénom jusqu'à ce qu'il soit valide
	TANT QUE prenomValide = FAUX FAIRE
		nombreEssais <-- nombreEssais + 1

		// Demander le prénom à l'utilisateur
		ECRIRE "Saisissez votre prénom (au moins 2 caractères) : "
		LIRE prenom

		// Vérifier la longueur du prénom
		SI LONGUEUR(prenom) >= 2 ALORS
			prenomValide <-- VRAI
		SINON
			ECRIRE "Le prénom doit contenir au moins 2 caractères. Veuillez recommencer."
		FIN SI
	FIN TANT QUE

	// Afficher le message de bienvenue
	ECRIRE "Bonjour, ", prenom, " !"

RESULTAT
FIN

````