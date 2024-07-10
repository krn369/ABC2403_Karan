#  Exercice 2.2 : Positif ou négatif (bis) ?
Écrire un algorithme qui demande à l’utilisateur de saisir 2 nombres entiers et l’informe ensuite si leur produit est positif ou négatif.


```

VARIABLES

    nombre1: NOMBRE ENTIER
    nombre2: NOMBRE ENTIER
    produit: NOMBRE ENTIER

TRAITMENT 

    // Demander à l'utilisateur de saisir deux nombres
    ÉCRIRE "Saisissez un premier nombre entier : "
    LIRE nombre1
    ÉCRIRE "Saisissez un second nombre entier : "
    LIRE nombre2

    // Calculer le produit des deux nombres
    produit = nombre1 * nombre2

    // Déterminer si le produit est positif, négatif ou nul
    SI produit <-- 0
        ALORS
            ÉCRIRE "Le produit est 0."
        FIN SI
        
    SINON SI nombre1 > 0 ET nombre2 > 0
        ALORS
            ÉCRIRE "Le produit est positif."
        FIN SI
        
    SINON SI nombre1 < 0 ET nombre2 < 0
        ALORS
            ÉCRIRE "Le produit est positif."
        FIN SI
        
    SINON
        ÉCRIRE "Le produit est négatif."
    FIN SI


```
