# Exercice 2.7 : Tarif Assurance
Une compagnie d’assurance automobile propose à ses clients quatre familles de tarifs identifiables par une couleur, du moins au plus onéreux :

Tarifs bleu, vert, orange et rouge.
Le tarif dépend de la situation du conducteur :

Un conducteur de moins de 25 ans et titulaire du permis depuis moins de deux ans, se voit attribuer le tarif rouge, si toutefois il n’a jamais été responsable d’accident. Sinon, la compagnie refuse de l’assurer.

Un conducteur de moins de 25 ans et titulaire du permis depuis plus de deux ans, ou de plus de 25 ans mais titulaire du permis depuis moins de deux ans a le droit au tarif orange s’il n’a jamais provoqué d’accident, ou le tarif rouge s’il a été repsonsable d’un accident, sinon il est refusé.

Un conducteur de plus de 25 ans titulaire du permis depuis plus de deux ans bénéficie du tarif vert s’il n’est à l’origine d’aucun accident et du tarif orange pour un accident, du tarif rouge pour deux accidents, et refusé au-delà

De plus, pour encourager la fidélité des clients acceptés, la compagnie propose un contrat de la couleur immédiatement la plus avantageuse s’il est assuré depuis plus de cinq ans. Ainsi, s’il satisfait à cette exigence, un client normalement “vert” devient “bleu”, un client normalement “orange” devient “vert”, et le “rouge” devient orange.

Ecrire l’algorithme permettant de saisir les données nécessaires (sans contrôle de saisie) et de traiter ce problème. Avant de se lancer à corps perdu dans cet exercice, on pourra réfléchir un peu et s’apercevoir qu’il est plus simple qu’il n’en a l’air (cela s’appelle faire une analyse !)…

````
VARIABLES
   age: NOMBRE ENTIER
   tempsPermis: NOMBRE ENTIER
   nbAccidents: NOMBRE ENTIER
   tempsContrat: NOMBRE ENTIER
   couleurTarif: CHAINE
   couleurTarifFidelite: CHAINE
 
DEBUT
   // Demander les données à l'utilisateur
   ÉCRIRE "Saisissez l'âge du conducteur : "
   LIRE age
   ÉCRIRE "Saisissez l'ancienneté du permis (en années) : "
   LIRE anciennetéPermis
   ÉCRIRE "Saisissez le nombre d'accidents responsables : "
   LIRE nbAccidents
   ÉCRIRE "Saisissez l'ancienneté du contrat (en années) : "
   LIRE anciennetéContrat
 
   // Déterminer la couleur du tarif de base
   SI age < 25
       ALORS
           SI tempsPermis < 2
               ALORS
                   SI nbAccidents = 0
                       ALORS
                           couleurTarif = "rouge"
                       SINON
                           ÉCRIRE "Refus d'assurance."
                           FIN DE PROGRAMME
                       FINSI
               SINON
                   SI nbAccidents = 0
                       ALORS
                           couleurTarif = "orange"
                       SINON
                           couleurTarif = "rouge"
                       FINSI
               FINSI
           SINON
               SI nbAccidents = 0
                   ALORS
                       couleurTarif = "vert"
                   SINON
                       SI nbAccidents = 1
                           ALORS
                               couleurTarif = "orange"
                           SINON
                               SI nbAccidents = 2
                                   ALORS
                                       couleurTarif = "rouge"
                                   SINON
                                       ÉCRIRE "Refus d'assurance."
                                       FIN DE PROGRAMME
                                   FINSI
                               FINSI
                       FINSI
               FINSI
           FINSI
   SINON
       SI nbAccidents = 0
           ALORS
               couleurTarif = "vert"
           SINON
               couleurTarif = "orange"
           FINSI
       FINSI
 
   // Appliquer la fidélité après 5 ans
   SI tempsContrat >= 5
       ALORS
           SI couleurTarif = "bleu"
               ALORS
                   couleurTarifFidelite = "bleu"
               FINSI
           SINON SI couleurTarif = "vert"
               ALORS
                   couleurTarifFidelite = "bleu"
               FINSI
           SINON SI couleurTarif = "orange"
               ALORS
                   couleurTarifFidelite = "vert"
               FINSI
           SINON
               couleurTarifFidelite = "orange"
           FINSI
       SINON
           couleurTarifFidelite = couleurTarif
       FINSI
 
   // Afficher le tarif final
   ÉCRIRE "Le tarif d'assurance est : ", couleurTarifFidelite, "."
FIN

````

