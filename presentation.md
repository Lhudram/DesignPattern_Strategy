# Introduction

Bonjour !  
Nous allons aujourd’hui explorer le pattern Strategy. Pour ce faire nous allons expliquer ce qu’est un design pattern (ou patron de conception) pour ensuite expliquer la problématique autour du pattern Strategy et comment il y répond.  
Allons-y !  

# Design quoi ?

Derrière ce mot barbare réside en fait une définition toute simple : un design pattern est une façon générique d’organiser ses modules pour répondre à une problématique et ce peu importe le langage.  
On en trouve 3 types :  
Création : pour faciliter la configuration de classes et objets.  
Structure : pour organiser les classes d’une application.  
Comportement : pour organiser les objets et faciliter la communication entre eux, c’est également le type du pattern Strategy.  
Les 23 design pattern principaux, dont celui traité aujourd’hui, ont été définis par le ‘’Gang of Four’’ dans le livre Design Patterns : Elements of Reusable Object-Oriented publié en 1995.

# Du coup, il sert à quoi le pattern Strategy ?

La problématique de ce pattern est plutôt simple : comment faire pour réaliser différentes opérations avec un seul et même objet ?  
Vous me direz, c’est simple on fait une classe avec toutes les opérations ! Mais non car procéder comme ceci violerait un principe SOLID : le Single Responsibility principle.  
Pour éviter ceci, on structure nos classes de la manière suivante :  
![UML Diagram](https://raw.githubusercontent.com/Lhudram/DesignPattern_Strategy/master/UML_Presentation.png)
Source : https://fr.wikipedia.org/wiki/Stratégie_(patron_de_conception)#/media/File:Strategy_Pattern_in_UML.png

Mis comme cela, ce n’est pas particulièrement clair.  
Mais pas d’inquiétude ! Tout ceci sera amplement expliqué dans l’exemple de la page suivante.  

# Quels avantages pour quels inconvénients ?

Ce pattern permet :  
-Une meilleure lisibilité du code.  
-D’éviter de violer un principe SOLID.  
-Mais avant tout de définir plusieurs algorithmes interchangeables dynamiquement.  

Son seul inconvénient ? Il nécessite d’ajouter une classe.  
Vous admettrez que cela fait peu d’inconvénients. Malgré cela, ça ne veut pas dire que vous pouvez l’utiliser à tout va, c’est avant tout un pattern destiné à un usage très précis : réaliser différentes opérations avec un seul et même objet.  
