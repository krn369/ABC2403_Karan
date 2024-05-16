#Exercice 3.2 : La bonne plage de galets
Écrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la réponse convienne.

En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », et inversement, « Plus grand ! » si le nombre est inférieur à 10.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Yes, you did it !”.

````
VARIABLES

	nombreSaisi est un ENTIER
	estDansPlage est un BOOLEEN

TRAITEMENT

	// Boucle qui se répète tant que la réponse n'est pas dans la plage souhaitée
	REPETER
		ECRIRE "Saisissez un nombre entre 10 et 20 : "
		LIRE nombreSaisi

		// Vérifier si le nombre saisi est dans la plage souhaitée
		SI nombreSaisi >= 10 ET nombreSaisi <= 20 ALORS
			estDansPlage <-- VRAI
		SINON
			// Afficher un message d'erreur en fonction du nombre saisi
			SI nombreSaisi > 20 ALORS
				ECRIRE "Plus petit !"
			SINON
				ECRIRE "Plus grand !"
			FINSI
			estDansPlage <-- FAUX
		FINSI
	JUSQU'A estDansPlage

	// Affichage du message de réussite
	ECRIRE nombreSaisi, " Yes, you did it !"

RESULTAT

FIN

````