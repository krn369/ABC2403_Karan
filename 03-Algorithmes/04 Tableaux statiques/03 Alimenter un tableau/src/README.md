# Exercice 4.3 : Alimenter un tableau
Écrire un algorithme permettant à l’utilisateur de saisir un nombre quelconque de valeurs, qui devront être stockées dans un tableau.

L’utilisateur doit donc commencer par entrer le nombre de valeurs qu’il compte saisir. Il effectuera ensuite cette saisie. Enfin, une fois la saisie terminée, le programme affichera le nombre de valeurs négatives et le nombre de valeurs positives.

````
VARIABLES

	nbValeurs est un entier
	valeurs est un tableau d'entiers (taille dynamique)
	nbPositifs est un entier (initialisé à 0)
	nbNegatifs est un entier (initialisé à 0)

TRAITEMENT

	// Demander à l'utilisateur le nombre de valeurs à saisir
	AFFICHER "Combien de valeurs voulez-vous saisir ?"
	SAISIR nbValeurs

	// Définir la taille du tableau 'valeurs' en fonction du nombre saisi
	valeurs: tableau d'entiers(nbValeurs)

	// Saisie des valeurs par l'utilisateur
	POUR i DE 0 À nbValeurs - 1
		AFFICHER "Saisissez la valeur " & (i + 1) & " : "
		SAISIR valeurs[i]
	FIN POUR

	// Parcourir le tableau et compter les valeurs positives et négatives
	POUR i DE 0 À nbValeurs - 1
		SI valeurs[i] > 0
			nbPositifs ← nbPositifs + 1
		ELSIF valeurs[i] < 0
			nbNegatifs ← nbNegatifs + 1
		FIN SI
	FIN POUR

	// Afficher les résultats
	AFFICHER "Nombre de valeurs saisies :", nbValeurs
	AFFICHER "Nombre de valeurs positives :", nbPositifs
	AFFICHER "Nombre de valeurs négatives :", nbNegatifs
FIN

````