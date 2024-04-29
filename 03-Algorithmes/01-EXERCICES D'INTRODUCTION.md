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

    ECRIRE "La moyenne de ", nombre1, " et ", nombre2, "est" moyenne, "." //"La moyenne de 12 et 81 est 46,5" 

```

s

# Exercice 1.5 : Calcul de la surface d’un secteur circulaire
Lire le rayon R d’un cercle et un angle A (en degré(s)).

Calculer et afficher :

- L’ aire du secteur circulaire = (π R² A) / 360


```
VARIABLES

    rayon est un NOMBRE ENTIER
    angle est un NOMBRE ENTIER EN DEGRE
    secteur  est un NOMBRE REEL

TRAITMENT

    ECRIRE "Veuillez entrer un rayon du cercle"
    LIRE rayon

    ECRIRE "Veuillez entrer un angle du cercle"
    LIRE angle

    secteur <-- (π * rayon² A) / 360 

RESULTAT

    ECRIRE "L'arie du secteur circulaire est", secteur, "."

```
# Exercice 1.6 : Inversion de 2 valeurs
Lire 2 nombres entier A et B.
Afficher la valeur de A puis la valeur de B.
Mettre le contenu de A dans B et celui de B dans A.
Afficher à nouveau la valeur de A puis la valeur de B.

```
VARIABLES

    a est un NOMBRE ENTIER
    b est un NOMBRE ENTIER  

TRAITMENT 1

   AFFICHER "Veuillez saisir un premier nombre (A)."
    LIRE a

    AFFICHER "Veuillez saisir un second nombre (B)."
    LIRE b

RESULTANT 1

    AFFICHER "La originale valeur de A est",a, "et de B est",b, "."

TRAITMENT 2 

    c est un NOMBRE ENTIER.

    La valeur de 'a' est stockée dans 'c'
    La valeur de 'b' est stockée dans 'a'
    La valeur de 'c' est stockée dans 'b'  // c contenait la valeur de 'a' avant l'inversion 

 RESULTANT 2

 AFFICHER " L'inverse valeur de A est",b, "et de B est",c, "."    


```
