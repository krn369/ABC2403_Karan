# Corrections exercices Algèbre de Boole

Corrections des exercices du document [03-algebre-de-boole-corrections.docx](./03-algebre-de-boole-corrections.docx)

## Les 3 couleurs 

Soient les couleurs: 

| Variable | Signification | 
| --- | --- |
| **Cb** | couleur de base | 
| **Cad1** | 1ère couleur additionnelle  | 
|**Cad2**  | 2ème couleur additionnelle  | 
| **Cr** | couleur résultat | 

**Pour chacune des affirmations suivantes, vous présenterez :** 

- La table de vérité à partir des propositions données 
- L'expression booléenne simplifiée. Pour cet énoncé, vous disposez des fonctions logiques ET (.), OU (+) et NON.

--- 

## A. Le résultat attendu est Cr = couleur très claire. 

`Cr` est de type "**très claire**" si les 2 couleurs additionnelles sont blanches. Le blanc étant exclu de cette catégorie, la couleur de base ne doit pas être blanche. 

Les propositions sont: 

- P1 : Cr = très claire 
- P2 : Cb = bleu 
- P3 : Cad1 = blanc 
- P4 : Cad2 = blanc 

**Table de vérité**

| Entrée | Entrée | Entrée |  | Sortie |
| --- | --- | --- | --- | --- |
| P2 | P3 | P4 | = | P1 |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |

**Expression algébrique correspondante**

``


## B. Le résultat attendu est Cr = couleur claire. 

`Cr` est "**clair**" si une seule des 2 couleurs additionnelles est blanche. Le blanc étant exclu de cette catégorie, la couleur de base ne doit pas être blanche.  

Les propositions sont: 

- P1 : Cr = claire 
- P2 : Cb = rouge 
- P3 : Cad1 = blanc 
- P4 : Cad2 = blanc 

**Table de vérité**

| Entrée | Entrée | Entrée |  | Sortie |
| --- | --- | --- | --- | --- |
| P2 | P3 | P4 | = | P1 |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |

**Expression algébrique correspondante**

``
 

## C. Le résultat attendu est Cr = mauve. 

`Cr` est "**mauve**" si `Cb` est bleue et si l'une des 2 couleurs additionnelles est rouge et l'autre blanche. Lors de cette 
opération de mélange, les couleurs additionnelles ne peuvent être que rouges ou blanches. 

Les propositions sont: 

- P1 : Cr = mauve 
- P2 : Cb = bleu 
- P3 : Cad1 = blanc 
- P4 : Cad2 = rouge 

**Table de vérité**

| Entrée | Entrée | Entrée |  | Sortie |
| --- | --- | --- | --- | --- |
| P2 | P3 | P4 | = | P1 |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |

**Expression algébrique correspondante**

``
 

## D. Le résultat attendu est Cr = violet. 
`Cr` est "**violet**" si `Cb` est bleue et si les 2 couleurs additionnelles sont rouges ou bleues, mais pas toutes les 2 bleues. 
Lors de cette opération de mélange, les couleurs additionnelles ne peuvent être que rouges ou bleues.  

Les propositions sont: 

- P1 : Cr = violet 
- P2 : Cb = bleu 
- P3 : Cad1 = bleu 
- P4 : Cad2 = rouge 

**Table de vérité**

| Entrée | Entrée | Entrée |  | Sortie |
| --- | --- | --- | --- | --- |
| P2 | P3 | P4 | = | P1 |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |
|  |  |  | = |  |

**Expression algébrique correspondante**
