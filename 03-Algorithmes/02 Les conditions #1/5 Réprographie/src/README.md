# Exercice 2.5 : Réprographie
Un magasin proposant un service de Réprographie facture 0.10€ les 10 premières photocopies, 0.09€ les vingt suivants et 0.08 au delà.

Écrire l’algorithme qui demande à l’utilisateur de saisir le nombre de photocopies effectuées et affiche le montant de la facture correspondante.

```
VARIABLES
    nbPhotocopies: NOMBRE ENTIER
    prixTranche1: NOMBRE REEL
    prixTranche2: NOMBRE REEL
    prixTranche3: NOMBRE REEL
    montantTranche1: NOMBRE REEL
    montantTranche2: NOMBRE REEL
    montantTranche3: NOMBRE REEL
    montantTotal: NOMBRE REEL

TRAITMENT 

    // Demander à l'utilisateur le nombre de photocopies
    ÉCRIRE "Saisissez le nombre de photocopies : "
    LIRE nbPhotocopies

    // Déterminer les prix et les montants par tranche
    prixTranche1 = 0.10
    prixTranche2 = 0.09
    prixTranche3 = 0.08

    // Calculer le nombre de photocopies dans chaque tranche
    SI nbPhotocopies <= 10
        ALORS
            montantTranche1 = nbPhotocopies * prixTranche1
            montantTranche2 = 0
            montantTranche3 = 0
        FINSI
    SINON SI nbPhotocopies <= 30
        ALORS
            montantTranche1 = 10 * prixTranche1
            montantTranche2 = (nbPhotocopies - 10) * prixTranche2
            montantTranche3 = 0
        FINSI
    SINON
        ALORS
            montantTranche1 = 10 * prixTranche1
            montantTranche2 = 20 * prixTranche2
            montantTranche3 = (nbPhotocopies - 30) * prixTranche3
        FINSI

    // Calculer le montant total
    montantTotal = montantTranche1 + montantTranche2 + montantTranche3

    // Afficher le montant total
    ÉCRIRE "Le montant total de la facture est de : ", montantTotal, "€."
FIN

```