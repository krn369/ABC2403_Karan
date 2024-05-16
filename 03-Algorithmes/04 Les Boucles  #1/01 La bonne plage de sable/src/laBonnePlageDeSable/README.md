# Exercice 3.1 : La bonne plage de sable
Écrire un algorithme qui demande à l’utilisateur de saisir un nombre compris entre 1 et 3 jusqu’à ce que la réponse convienne.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Bravo, vous avez réussi !”.

````
VARIABLES

	nombreSaisi est un ENTIER
	estDansPlage est un BOOLEEN

TRAITEMENT

	// Boucle qui se répète tant que la réponse n'est pas dans la plage souhaitée
	REPETER
		ECRIRE "Saisissez un nombre entre 1 et 3 : "
		LIRE nombreSaisi

		// Vérifier si le nombre saisi est dans la plage souhaitée
		SI nombreSaisi >= 1 ET nombreSaisi <= 3 ALORS
			estDansPlage <-- VRAI
		SINON
			estDansPlage <-- FAUX
		FINSI
	JUSQU'A estDansPlage

	// Affichage du message de réussite
	ECRIRE nombreSaisi, " Bravo, vous avez réussi !"

RESULTAT

FIN

````