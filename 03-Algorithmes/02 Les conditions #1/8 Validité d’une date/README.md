# Exercice 2.8 : Validité d’une date
Écrivez un algorithme qui demande à l’utilisateur de saisir 3 nombres entiers

Un numéro de jour
Un numéro de mois
Un numéro d’année
L’algorithme indique ensuite s’il s’agit ou non d’une date valide.

Cet exercice est certes d’un manque d’originalité affligeant, mais après tout, en algorithmique comme ailleurs, il faut connaître ses classiques ! Et quand on a fait cela une fois dans sa vie, on apprécie pleinement l’existence d’un type « Date » dans certains langages…).

Il n’est sans doute pas inutile de rappeler rapidement que le mois de février compte 28 jours, sauf si l’année est bissextile, auquel cas il en compte 29.

L’année est bissextile si elle est divisible par quatre. Toutefois, les années divisibles par 100 ne sont pas bissextiles, mais les années divisibles par 400 le sont. Ouf !


````
VARIABLES

	jour est un ENTIER
	mois est un ENTIER
	annee est un ENTIER
	estValide est un BOOLEEN

TRAITEMENT

	ECRIRE "Saisissez un jour : "
	LIRE jour

	ECRIRE "Saisissez un mois : "
	LIRE mois

	ECRIRE "Saisissez une année : "
	LIRE annee

	// Vérifier si le jour est valide
	SI jour < 1 OU jour > 31 ALORS
		estValide <-- FAUX
	SINON
		// Vérifier si le mois est valide
		SI mois < 1 OU mois > 12 ALORS
			estValide <-- FAUX
		SINON
			// Vérifier la validité de la date en fonction du mois et de l'année
			SI mois = 2 ALORS
				SI (annee MOD 4 = 0) ET (annee MOD 100 <> 0) OU (annee MOD 400 = 0) ALORS
					SI jour > 29 ALORS
						estValide <-- FAUX
					SINON
						estValide <-- VRAI
					FINSI
				SINON
					SI jour > 28 ALORS
						estValide <-- FAUX
					SINON
						estValide <-- VRAI
					FINSI
				FINSI
			SINON
				SI (mois = 4) OU (mois = 6) OU (mois = 9) OU (mois = 11) ALORS
					SI jour > 30 ALORS
						estValide <-- FAUX
					SINON
						estValide <-- VRAI
					FINSI
				SINON
					estValide <-- VRAI
				FINSI
			FINSI
		FINSI
	FINSI

	SI estValide ALORS
		ECRIRE "La date saisie est valide."
	SINON
		ECRIRE "La date saisie est invalide."
	FINSI

RESULTAT

FIN

````