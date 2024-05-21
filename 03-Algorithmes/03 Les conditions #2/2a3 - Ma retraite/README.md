# Exercice 2a.3 : Ma retraite
Lire un nombre A correspondant à un âge (en années).
Selon l’âge fourni, le programme doit afficher l’un des messages suivants :
Vous êtes à la retraite depuis X années
Il vous reste X années avant la retraite.
C’est le moment de prendre sa retraite.
La valeur fournie n’est pas un âge valide.
La retraite est fixée à 60 ans.


````
VARIABLES

	age est un ENTIER
	anneesRetraite est un ENTIER
	message est une CHAINE

TRAITEMENT

	// Lire l'âge saisi par l'utilisateur
	ECRIRE "Saisissez votre âge : "
	LIRE age

	// Vérifier si l'âge est valide (supérieur ou égal à 0)
	SI age < 0 ALORS
		message <-- "La valeur fournie n’est pas un âge valide."
	SINON
		// Calculer le nombre d'années de retraite ou le temps restant avant la retraite
		anneesRetraite <-- 60 - age

		// Déterminer le message en fonction de l'âge et des années de retraite
		SI age >= 60 ALORS
			message <-- "Vous êtes à la retraite depuis " & annéesRetraite & " années."
		SINON
			SI annéesRetraite = 0 ALORS
				message <-- "C’est le moment de prendre sa retraite."
			SINON
				message <-- "Il vous reste " & annéesRetraite & " années avant la retraite."
			FINSI
		FINSI
	FINSI

	// Afficher le message déterminé
	ECRIRE message

RESULTAT

FIN

````