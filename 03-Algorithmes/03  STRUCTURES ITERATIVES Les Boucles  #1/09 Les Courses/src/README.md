#Exercice 3.9 : Les courses
Écrire un algorithme qui permet de connaître ses chances de gagner au tiercé, quarté, quinté et autres impôts volontaires.

On demande à l’utilisateur le nombre de chevaux partants, et le nombre de chevaux joués. Les deux messages affichés devront être :

Dans l’ordre : une chance sur X de gagner 
Dans le désordre : une chance sur Y de gagner 
X et Y nous sont donnés par la formule suivante, si n est le nombre de chevaux partants et p le nombre de chevaux joués, le signe ! signifie « factorielle » :

X = n! / (n - p)! 
Y = n! / (p! * (n – p)!)
Cet algorithme peut être écrit d’une manière simple, mais relativement peu performante. Ses performances peuvent être singulièrement augmentées par une petite astuce. Vous commencerez par écrire la manière la plus simple, puis vous identifierez le problème, et écrirez une deuxième version permettant de d’améliorer les performances de l’algorithme.

````
VARIABLES

	nombreChevauxPartants est un ENTIER
	nombreChevauxJoues est un ENTIER
	chanceDansOrdre est un DECIMAL
	chanceDesordre est un DECIMAL

TRAITEMENT

	// Demander à l'utilisateur le nombre de chevaux partants
	ECRIRE "Saisissez le nombre de chevaux partants : "
	LIRE nombreChevauxPartants

	// Vérifier si le nombre de chevaux partants est valide
	SI nombreChevauxPartants <= 0 ALORS
		ECRIRE "Le nombre de chevaux partants doit être supérieur à 0."
		FIN SI

	// Demander à l'utilisateur le nombre de chevaux joués
	ECRIRE "Saisissez le nombre de chevaux joués : "
	LIRE nombreChevauxJoues

	// Vérifier si le nombre de chevaux joués est valide
	SI nombreChevauxJoues <= 0 ALORS
		ECRIRE "Le nombre de chevaux joués doit être supérieur à 0."
		FIN SI

	// Vérifier si le nombre de chevaux joués est inférieur ou égal au nombre de chevaux partants
	SI nombreChevauxJoues > nombreChevauxPartants ALORS
		ECRIRE "Le nombre de chevaux joués ne peut pas être supérieur au nombre de chevaux partants."
		FIN SI

	// Calculer la chance de gagner dans l'ordre
	chanceDansOrdre <-- calculerFactorielle(nombreChevauxPartants) / calculerFactorielle(nombreChevauxPartants - nombreChevauxJoues)

	// Calculer la chance de gagner dans le désordre
	chanceDesordre <-- calculerFactorielle(nombreChevauxPartants) / (calculerFactorielle(nombreChevauxJoues) * calculerFactorielle(nombreChevauxPartants - nombreChevauxJoues))

	// Afficher les chances de gagner
	ECRIRE "Dans l'ordre : une chance sur ", chanceDansOrdre, " de gagner."
	ECRIRE "Dans le désordre : une chance sur ", chanceDesordre, " de gagner."

FONCTION calculerFactorielle(n)

	// Fonction récursive pour calculer la factorielle d'un nombre
	SI n == 0 ALORS
		RETURN 1
	SINON
		RETURN n * calculerFactorielle(n - 1)
	FIN SI

FIN FONCTION

RESULTAT
FIN

````