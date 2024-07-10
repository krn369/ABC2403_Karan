
# Exercice 1.6 : Inversion de 2 valeurs
Lire 2 nombres entier A et B.
Afficher la valeur de A puis la valeur de B.
Mettre le contenu de A dans B et celui de B dans A.
Afficher à nouveau la valeur de A puis la valeur de B.

```
VARIABLES

    a est un NOMBRE ENTIER
    b est un NOMBRE ENTIER
    c est un NOMBRE ENTIER  

TRAITMENT 1

   AFFICHER "Veuillez saisir un premier nombre (A)."
    LIRE a

    AFFICHER "Veuillez saisir un second nombre (B)."
    LIRE b

RESULTANT 1

    AFFICHER "La originale valeur de A est",a, "et de B est",b, "."

TRAITMENT 2 

.

 a <-- c   // La valeur de 'a' est stockée dans 'c'
 b <-- a   // La valeur de 'b' est stockée dans 'a'
 c <-- b   // La valeur de 'c' est stockée dans 'b'  ( c contenait la valeur de 'a' avant l'inversion )

 RESULTANT 2

 AFFICHER " L'inverse valeur de A est",b, "et de B est",c, "."    


```