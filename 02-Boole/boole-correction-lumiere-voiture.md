
# Corrections exercices Algèbre de Boole


### Propositions

- P1 = La lumière est allumée
- P2 = Porte droite ouverte
- P3 = Porte gauche ouverte
- P4 = Interrupteur appuyé

| Entrée | Entrée | Entrée |  | Sortie |
| --- |--- | --- | --- |--- |
| P2 | P3 | P4 | = | P1 |
| 0 | 0 | 0 | = | 0 |
| 0 | 0 | 1 | = | 1 |
| 0 | 1 | 0 | = | 1 |
| 0 | 1 | 1 | = | 1 |
| 1 | 0 | 0 | = | 1 |
| 1 | 0 | 1 | = | 1 |
| 1 | 1 | 0 | = | 1 |
| 1 | 1 | 1 | = | 1 |

### Expression Boolèenne

En regardant le tableau, nous pouvons simplifier la façon de déterminer quand 
la lumière est allumée. Fondamentalement, la lumière s'allume si : 
SOIT la porte avant droite (P2) OU la porte avant gauche (P3) est ouverte, 
OU le bouton Interrupteur (P4) est appuyé/enfoncé. 

Cela peut s’écrire sous la forme d’une simple équation : 
Lumière (P1) = Porte droite (P2) + Porte gauche (P3) + Bouton (P4) 

Ainsi, tant que l’une de ces trois choses est vraie (porte ouverte ou bouton 
enfoncé), la lumière sera allumée !