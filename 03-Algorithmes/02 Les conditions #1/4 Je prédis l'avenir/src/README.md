# Exercice 2.4 : Je prédis l’avenir
Cet algorithme est destiné à prévenir l’avenir et il doit être infaillible !

Le programme demande à l’utilisateur de saisir 2 nombres entiers correspondant respectivement à des heures et des minutes. Le programme affichera ensuite l’heure qu’il sera 3 minutes plus tard.

Par exemple, si l’utilisateur saisit 23 puis 12 (correspondant à 23h12), le programme doit afficher Dans 3 minutes, il sera 23h15.

Si les nombres saisis par l’utilisateur sont “hors limite”, le programme affichera “Les données saisies sont invalides”


```
VARIABLES

    heure: NOMBRE ENTIER
    minutes: NOMBRE ENTIER
    heure_plus_trois: NOMBRE ENTIER
    minutes_plus_trois: NOMBRE ENTIER


TRAITMENT


    // Demander à l'utilisateur de saisir l'heure
    ÉCRIRE "Saisissez l'heure (entre 0 et 23) : "
    LIRE heure

    // Vérifier si l'heure est dans la plage valide (0 à 23)
    SI heure < 0 OU heure > 23
        ALORS
            ÉCRIRE "Les données saisies sont invalides."
            FIN SI
    SINON
        // Demander à l'utilisateur de saisir les minutes
        ÉCRIRE "Saisissez les minutes (entre 0 et 59) : "
        LIRE minutes

        // Vérifier si les minutes sont dans la plage valide (0 à 59)
        SI minutes < 0 OU minutes > 59
            ALORS
                ÉCRIRE "Les données saisies sont invalides."
                FIN SI
            SINON
                // Calculer les minutes après 3 minutes
                minutes_plus_trois = minutes + 3

                // Ajuster les minutes si elles dépassent 59
                SI minutes_plus_trois > 59
                    ALORS
                        minutes_plus_trois = minutes_plus_trois - 60
                        heure_plus_trois = heure + 1
                    FIN SI

                // Calculer l'heure après 3 minutes
                heure_plus_trois = heure

                // Afficher l'heure après 3 minutes
                ÉCRIRE "Dans 3 minutes, il sera ", heure_plus_trois, ":", minutes_plus_trois, "."
                
            FIN SI
        	FIN SI
    	FIN SI
    
FIN

```