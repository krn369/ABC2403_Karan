# Exercice 2a.2 : Es-tu majeur ?
Lire un nombre A correspondant à un âge (en années).
Afficher “Vous êtes majeur” ou “Vous êtes mineur” selon le cas.
Pour un nombre négatif le message doit être “Vous n’êtes pas encore né”.
La majorité est fixée à 18 ans.


````
VARIABLES

	age est un nombre ENTIER

TRAITEMENT

	// Lire l'âge saisi par l'utilisateur
	ECRIRE "Saisissez votre âge : "
	LIRE age

	// Déterminer le message en fonction de l'âge
	SI age >= 18 ALORS
		ECRIRE "Vous êtes majeur."
	SINON
		SI age > 0 ALORS
			ECRIRE "Vous êtes mineur."
		SINON
			ECRIRE "Vous n’êtes pas encore né."
		FINSI
	FINSI

RESULTAT

FIN

````