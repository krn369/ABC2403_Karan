# Exercice 3a.3 : Intervalle entre 2 nombres.
Lire 2 nombres entier A et B puis afficher tous les nombres entier dans l’intervalle.

Exemples : 
A = 3
B = 7
Résultat = 4 5 6

A = 7
B = 3
Résultat = 6 5 4


````
VARIABLES

	nombreA est un ENTIER
	nombreB est un ENTIER

TRAITEMENT

	// Demander à l'utilisateur de saisir les nombres A et B
	ECRIRE "Saisissez le nombre A : "
	LIRE nombreA
	ECRIRE "Saisissez le nombre B : "
	LIRE nombreB

	// Vérifier l'ordre des nombres
	SI nombreA > nombreB ALORS
		// Échanger les valeurs de A et B si nécessaire
		nombreTemp <-- nombreA
		nombreA <-- nombreB
		nombreB <-- nombreTemp
	FIN SI

	// Afficher les nombres entiers dans l'intervalle
	POUR i DE nombreA À nombreB FAIRE
		ECRIRE i
	FIN POUR

RESULTAT
FIN

````