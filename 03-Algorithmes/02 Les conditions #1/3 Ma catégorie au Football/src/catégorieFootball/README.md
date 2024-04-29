# Exercice 2.3 : Ma catégorie au Football
Écrire un algorithme qui demande à l’utilisateur de saisir un âge et l’informe ensuite à quelle catégorie il appartient :

Trop jeune : Moins de 5 ans
Débutant : De 5 à 6 ans
Poussin : De 7 à 8 ans
Benjamin : De 9 à 10 ans
Pupille : De 11 à 12 ans
Minime : De 13 à 14 ans
Cadet : De 15 à 16 ans
Junior : De 17 à 18 ans
Sénior : De 19 à 34 ans
Vétéran : 35 ans et +


```
VARIABLES

    age: NOMBRE ENTIER
    categorie: CHAINE

DEBUT
    // Demander à l'utilisateur de saisir l'âge
    
    ÉCRIRE "Saisissez l'âge du joueur : "
    LIRE age

    // Déterminer la catégorie d'âge en fonction de l'âge saisi
    SI age < 5
        ALORS
            categorie = "Trop jeune"
        FINSI
    SINON SI age >= 5 ET age <= 6
        ALORS
            categorie = "Débutant"
        FINSI
    SINON SI age >= 7 ET age <= 8
        ALORS
            categorie = "Poussin"
        FINSI
    SINON SI age >= 9 ET age <= 10
        ALORS
            categorie = "Benjamin"
        FINSI
    SINON SI age >= 11 ET age <= 12
        ALORS
            categorie = "Pupille"
        FINSI
    SINON SI age >= 13 ET age <= 14
        ALORS
            categorie = "Minime"
        FINSI
    SINON SI age >= 15 ET age <= 16
        ALORS
            categorie = "Cadet"
        FINSI
    SINON SI age >= 17 ET age <= 18
        ALORS
            categorie = "Junior"
        FINSI
    SINON SI age >= 19 ET age <= 34
        ALORS
            categorie = "Sénior"
        FINSI
    SINON
        categorie = "Vétéran"
    FINSI

    // Afficher la catégorie d'âge
    ÉCRIRE "Le joueur est dans la catégorie ", categorie, "."

	FIN

```