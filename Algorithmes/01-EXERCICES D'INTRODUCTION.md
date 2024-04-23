# Exercice 1.1 : Hello World
Ecrire un programme qui affiche "Hello World !".

```
ECRIRE "Hello World"
```

## Exercice 1.2 : Hello you
L'utilisateur est invité à saisir son prénom dans la console.

Le programme affiche "Bonjour" suivi du prénom saisi.

```
VARIABLES
    Prenom est une CHAINE DE CHARACTERES

TRAITEMENT
    ECRIRE "Saisissez votre Prénom"
    LIRE prenom
    ECRIRE "Bonjour", Prenom, "."

```
Alternative avec contrôle sur la longeur du prénom.

```
VARIABLES
    Prenom est une CHAINE DE CARACTERES

TRAITEMENT
    ECRIRE "Saississez votre prénom"
    LIRE Prenom
    SI Prenom.LONGUEUR > 2 ALORS
        ECRIRE "Bonjour", Prenom, "."
    SI NON
    ECRIRE "Prénom invalide"
    FIN SI
```

# Exercise 1.3 : Calcul de la moyenne de 2 nombres.

L'utilisateur est invité à saisir 2 nombres entier.

Le programme calcule la moyenne des 2 nombres et affiche le résultat sous forme de nombre décimal.

```
VARIABLES
    
    nombre1 est un NOMBRE ENTIER
    nombre2 est un NOMBRE ENTIER
    moyenne est un NOMBRE REEL

TRAITMENT 

    ECRIRE "Veuillez saisir un premier nombre."
    LIRE nombre1
    ECRIRE "Veuillez saisir un second nombre."
    LIRE nombre2
    
    moyenne <-- (nombre1 + nombre2) / 2

RESULTAT

    ECRIRE "La moyenne de ", nombre1, " et ", moyenne, "." //"La moyenne de 12 et 81 est 46,5" 

```