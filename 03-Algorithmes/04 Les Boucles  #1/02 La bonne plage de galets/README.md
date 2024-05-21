#Exercice 3.2 : La bonne plage de galets
Écrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la réponse convienne.

En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », et inversement, « Plus grand ! » si le nombre est inférieur à 10.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Yes, you did it !”.

````
VARIABLES

	nombreSaisi est un nombre ENTIER
	estValid est un BOOLEEN

TRAITEMENT


	REPETER //Do
		ECRIRE "Saisissez un nombre entre 10 et 20 : "
		LIRE nombreSaisi

		// Vérifier si le nombre saisi est dans la plage souhaitée
		estValid =  nombreSaisi >= 10 ET nombreSaisi <= 20 ALORS
			estValid <-- VRAI
			
		SI estValid <-- FAUX
			// Afficher un message d'erreur en fonction du nombre saisi
			ECRIRE ""Erreur !!! "
			SI nombreSaisi > 20 ALORS
				ECRIRE " Essayez Plus petit !"
			SINON
				ECRIRE "Essayez Plus grand !"
			FINSI
		
		FINSI
	JUSQU'A estDansPlage

	// Affichage du message de réussite
	ECRIRE nombreSaisi, " Yes, you did it !"

RESULTAT

FIN

````