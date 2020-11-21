# Fil rouge :

Pour notre profiter de ce que nous apprenons durant cette formation pour développer la caisse enregistreuse (Robotonik 2.0) d'un petit commerce. C'est pourquoi nous reviendrons plusieurs fois sur ce TP de manière à enrichir notre projet avec ce que nous apprenons.


## Etape 1 (nouveau projet):

Créer un nouveau projet dans Eclipse. 
Celui ci doit comporter une nouvelle classe 'Lanceur' ainsi qu'une méthode 'main' permettant d'afficher un message de bienvenue.

## Etape 2 (première classe): 

Nous allons maintenant créer notre CaisseEnregistreuse. Le rôle de celle ci est d'effectuer les opérations d'encaissement. 
A chaque encaissement, notre caisse va changer d'état pour se souvenir du montant total encaissé et doit pouvoir nous le communiquer.

Pour cela, vous devez rajouter un attribut 'montantTotal', une méthode 'encaisser(int montant)' et une méthode 'int getMontantTotal()'

Une fois que cela est fait, modifiez votre méthode 'main()' pour qu'elle :
* crée une caisse ('CaisseEnregistreuse maCaisse = new CaisseEnregistreuse();')
* affiche le montant ('System.out.println(maCaisse.getMontantTotal())')
* encaisse 10 ('maCaisse.encaisser(10)')
* affiche le montant

## Etape 3 (règle métier):

Par mesure de sécurité, le responsable du commerce souhaite qu'avant de pouvoir encaisser il faille "ouvrir" la caisse. 

Nous allons donc rajouté un état à notre caisse : isActive.

Implémentez la (ou les) méthode(s) permettant de changer l'état de la caisse ainsi que le contrôle vérifiant si la caisse est active avant son utilisation.

## Etape 4 (actions multiples) :

Un client vient faire des 100 achats. Modifier la méthode main pour simuler les 100 achats sans oublier d'activer la caisse avant.

## Etape 5 :

Notre client souhaite garder une trace de toutes les opérations effectué. Il veut notamment savoir le montant ainsi que le produit acheté. 
Pour le moment, nous n'allons pas stocker les Opérations mais nous contenter de les afficher (via un System.out.println() )

Créez la classe 'Operation' avec les attributs requis. 
Créez l'enum 'Produit'. 

Ajoutez dans votre classe Operation la méthode afficher() que vous appelerez depuis la méthode encaisser(). Celle ci doit afficher "Vente du produit % le % pour un montant de % €"

Modifiez votre méthode encaisser(...) pour quel prenne en paramètre une Operation


## Etape 6 (polymorphisme) : 

Il est temps de penser au remboursement du client. De notre point de vue, un remboursement c'est une opération avec un montant négatif sur le montant total de la caisse. Néanmoins quand on fait une opération de remboursement on veut changer le message à afficher.

Créer une classe OperationRemboursement qui étend la classe Operation. Celle ci doit surchager la méthode afficher() pour afficher : "Remboursement d'un montant de % le %"

## Etape 7 (interface) : 

Votre architecte logiciel a décidé qu'il faut renommer votre classe Operation en OperationVente et créer une interface Operation. 
OperationVente et OperationRemboursement doivent implémenter cette interface. 

## Etape 8 (collection) :

Nous souhaitons doter notre caisse d'une mémoire pour pouvoir retracer l'ensemble des Operation. Vous allez donc ajouter la propriété : 'List<Operation> ...' qui comprendra l'ensemble des operations sur la caisse. 

Modifiez la méthode getMontant pour qu'elle calcule le montant total en fonction des operations.

Créez une méthode : afficherOperations() pour qu'elle fasse appel à la méthode afficher() de chaque opération

## Etape 9 (Exception) : 

Pour garantir la cohérence des opérations vous allez implémenter le mécanisme d'exception. Si le montant est négatif dans OperationVente, ou si le montant est positif dans OperationRemboursement vous déclencherez une exception OperationIllegaleException


## Etape 10 (in / out) :

On souhaite pouvoir extraire la liste des opérations effectué sur la caisse enregistreuse. 

Modifier la méthode afficher() au sein de votre classe Opération pour qu’elle retourne une chaîne de texte au lieu de l’affiche dans la console.

Créer une classe : Imprimante et une méthode imprimer(...) qui prend en paramètre une liste d’opérations

Cette méthode imprimer(...) doit écrire dans un fichier texte le résultat de la méthode afficher() pour chaque operation

