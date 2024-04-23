#  Le cas d’une voiture.

Considérons le cas d’une voiture pour laquelle nous définissons les opérations suivantes

- Démarrer la voiture
- Arrêter la voiture
- Allumer les phares
- Éteindre les phares
- Faire avancer la voiture
- Faire stopper la voiture


**Rechercher les états possibles de la voiture**

- La voiture est démarrée
- La voiture est arrêtée
- Les phares sont allumés
- Les phares sont éteints
- La voiure avance
- La voiture est à l'arrêt

## Questions à se poser ?

- La voiture peut-elle avancer si le moteur est arrêté ?
- La voiture peut-être stoppée si elle avance

La voiture peut avancer si la voiture est démarrée OU que les phares sont allumés

- P1 = la voiture peut avancer
- P2 = la voiture est démarrée
- P3 = les phares sont allumés


## Table de vérité

| P2 | P3 | P1|  |
| --- | --- | --- | --- |
| 1 | 1 | 1 | La voiture peut avancer |
| 1 | 0 | 1 | La voiture peut avancer |
| 0 | 1 | 1 | La voiture peut avancer |
| 0 | 0 | 0 | La voiture ne peut avancer |


`P1 et vrai si P2 est vrai OU que P3 est vrai`

`P1 = P2 + P3`