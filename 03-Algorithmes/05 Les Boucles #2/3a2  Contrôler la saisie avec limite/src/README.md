# Exercice 3a.2 : Contrôler la saisie avec limite
L’utilisateur est invité à saisir un mot de passe.

Si le mot de passe saisi est correct, le programme affiche “Vous êtes connecté”.

Dans le cas contraire, l’utilisateur doit recommencer la saisie.

L’utilisateur dispose de 3 essais maximum.

Au 3ème échec, le programme affiche “Votre compte est bloqué” et se termine.

Note : Le bon mot de passe est formation



````
VARIABLES

	motDePasseSaisi est une CHAINE
	nombreEssais est un ENTIER (initialisé à 0)
	motDePasseCorrect est un BOOLEEN (initialisé à FAUX)

TRAITEMENT

	// Boucle pour demander le mot de passe jusqu'à 3 essais
	TANT QUE (nombreEssais < 3) ET (motDePasseCorrect = FAUX) FAIRE
		nombreEssais <-- nombreEssais + 1

		// Demander le mot de passe à l'utilisateur
		ECRIRE "Saisissez votre mot de passe (3 essais maximum) : "
		LIRE motDePasseSaisi

		// Vérifier si le mot de passe est correct
		SI motDePasseSaisi = "formation" ALORS
			motDePasseCorrect <-- VRAI
		SINON
			ECRIRE "Mot de passe incorrect. Veuillez recommencer."
		FIN SI
	FIN TANT QUE

	// Vérifier si le mot de passe est correct
	SI motDePasseCorrect = VRAI ALORS
		ECRIRE "Vous êtes connecté !"
	SINON
		ECRIRE "Votre compte est bloqué."
	FIN SI

RESULTAT
FIN

````