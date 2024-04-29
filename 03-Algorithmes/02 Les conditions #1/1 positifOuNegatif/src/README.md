# Exercice 2.1 : Positif ou négatif ?
Écrire un algorithme qui demande à l’utilisateur de saisir 1 nombre entier et l’informe ensuite si le nombre est positif ou négatif.

Pour information, le nombre 0 est considéré positif.


```


VARIABLES
    nombre: NOMBRE ENTIER

TRAITMENT

    // Demander à l'utilisateur de saisir un nombre
    
    ÉCRIRE "Saisissez un nombre entier : "
    LIRE nombre

    // Déterminer si le nombre est positif ou négatif. 
    
    SI nombre >= 0
        ALORS
            ÉCRIRE "Le nombre ", nombre, " est positif."
        FIN SI
        
    SINON  nombre < 0
        ALORS
            ÉCRIRE "Le nombre ", nombre, " est négatif."
            
        FIN SI


```