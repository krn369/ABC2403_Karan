# Exercice 3.3 : Les nombres suivants
Écrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants.

Par exemple, si l’utilisateur entre le nombre 17, le programme affichera :

Les 10 nombres après 17 sont: 18, 19 ,20 ,21 ,22 ,23 ,24 ,25 ,26 ,27

Écrire cet algorithme dans un premier temps avec une boucle tant que, puis écrivez une 2nde version avec une boucle pour.


````
VARIABLES

	nombreDepart est un ENTIER
	compteur est un ENTIER

TRAITEMENT

	// Demander le nombre de départ à l'utilisateur
	ECRIRE "Saisissez un nombre de départ : "
	LIRE nombreDepart

	// Initialiser le compteur à 0
	compteur <-- 0

	// Boucle TANT QUE pour afficher les 10 nombres suivants
	TANT QUE compteur =< 10 FAIRE
		// Afficher le nombre actuel (nombreDepart + compteur)
		ECRIRE nombreDepart + compteur, ", "

		// Incrémenter le compteur
		compteur <-- compteur + 1
	FIN TANT QUE

	// Message de fin
	ECRIRE "Fin de la liste."

RESULTAT

FIN

````