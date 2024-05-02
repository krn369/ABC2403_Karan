# Exercie 2.6 : Élections
Les élections législatives, en Guignolerie Septentrionale, obéissent à la règle suivante :

Lorsque l’un des candidats obtient plus de 50% des suffrages, il est élu dès le premier tour.
En cas de deuxième tour, peuvent participer uniquement les candidats ayant obtenu au moins 12.5% des voix au premier tour.
Vous devez écrire un algorithme qui permet la saisie des scores de quatre candidats au premier tour.

Cet algorithme traitera ensuite le candidat numéro 1 (et uniquement lui) : il dira s’il est élu, battu, s’il se trouve en ballottage favorable (il participe au second tour en étant arrivé en tête à l’issue du premier tour) ou défavorable (il participe au second tour sans avoir été en tête au premier tour).


````

VARIABLES
    scoreCandidat1: NOMBRE REEL
    scoreCandidat2: NOMBRE REEL
    scoreCandidat3: NOMBRE REEL
    scoreCandidat4: NOMBRE REEL
    seuilMajorite: NOMBRE REEL
    seuilDeuxiemeTour: NOMBRE REEL
    estElu: BOOLEEN
    estBallottageFavorable: BOOLEEN
    estBallottageDefavorable: BOOLEEN
    estBattu: BOOLEEN


TRAITMENT

    // Demander à l'utilisateur les scores des candidats
    ÉCRIRE "Saisissez le score du candidat 1 (en %) : "
    LIRE scoreCandidat1
    ÉCRIRE "Saisissez le score du candidat 2 (en %) : "
    LIRE scoreCandidat2
    ÉCRIRE "Saisissez le score du candidat 3 (en %) : "
    LIRE scoreCandidat3
    ÉCRIRE "Saisissez le score du candidat 4 (en %) : "
    LIRE scoreCandidat4

    // Définir les seuils
    seuilMajorite = 50
    seuilDeuxiemeTour = 12.5

    // Initialiser les variables booléennes
    estElu = FAUX
    estBallottageFavorable = FAUX
    estBallottageDefavorable = FAUX
    estBattu = FAUX

    // Déterminer le statut du candidat n°1
    SI scoreCandidat1 > seuilMajorite
        ALORS
            estElu = VRAI
        FINSI
    SINON SI scoreCandidat1 >= seuilDeuxiemeTour
        ALORS
            // Vérifier s'il est en tête parmi les candidats restants
            SI scoreCandidat1 > scoreCandidat2 ET scoreCandidat1 > scoreCandidat3 ET scoreCandidat1 > scoreCandidat4
                ALORS
                    estBallottageFavorable = VRAI
                FINSI
            SINON
                estBallottageDefavorable = VRAI
            FINSI
        SINON
            estBattu = VRAI
        FINSI

    // Afficher le statut du candidat n°1
    SI estElu
        ALORS
            ÉCRIRE "Le candidat 1 est élu dès le premier tour."
        FINSI
    SINON SI estBallottageFavorable
        ALORS
            ÉCRIRE "Le candidat 1 est en ballottage favorable."
        FINSI
    SINON SI estBallottageDefavorable
        ALORS
            ÉCRIRE "Le candidat 1 est en ballottage défavorable."
        FINSI
    SINON SI estBattu
        ALORS
            ÉCRIRE "Le candidat 1 est battu."
        FINSI
FIN

````