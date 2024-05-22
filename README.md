# PowerOfThor
Votre programme doit permettre à Thor de rejoindre l'éclair de puissance. L'objectif est d'obtenir 100% avec le code le plus court.



Thor évolue sur une carte de 40 cases de large et 18 cases de hauteur. Notez que les coordonnées (X et Y) commencent en partant du haut ! Ainsi la case la plus en haut à gauche a pour coordonnées "X=0,Y=0" et celle située le plus en bas à droite a pour coordonnées "X=39,Y=17".

Au début du programme vous recevez :
la variable lightX : la position X de l'éclair que Thor doit rejoindre.
la variable lightY : la position Y de l'éclair que Thor doit rejoindre.
la variable initialTX : la position X initiale de Thor.
la variable initialTY : la position Y initiale de Thor.
À la fin du tour de jeu, vous devez afficher la direction que Thor doit prendre parmi :


N (Nord)
NE (Nord-Est)
E (Est)
SE (Sud-Est)
S (Sud)
SW (Sud-Ouest)
W (Ouest)
NW (Nord-Ouest)
Chaque déplacement fait bouger Thor de 1 case dans la direction choisie.
 
 
Conditions de victoire
Vous gagnez lorsque Thor arrive sur l'éclair de puissance
 
Conditions de défaite
Thor sort de la carte
 	Algorithme en Pseudo Code
Pour réussir votre mission, nous vous proposons l'algorithme suivant :

 
Avant la boucle de jeu, créez deux variables thorX et thorY, qui contiendront la position courante de Thor. Initialisez ces variables à initialTX et initialTY.

 
À chaque tour de jeu, effectuez les actions suivantes :

Initialisez deux variables de type chaîne de charactères à chaîne vide : directionX et directionY.
Si thorX est supérieur à lightX, directionX prend comme valeur W sinon si thorX est inférieur à lightX, directionX prend comme valeur E.
Si thorY est supérieur à lightY, directionY prend comme valeur N sinon si thorY est inférieur à lightY, directionY prend comme valeur S.
Mettez à jour les variables thorX et thorY en fonction de la direction choisie (+1 ou -1).
Indiquez, avant la fin du tour, sur la sortie standard, la direction qui équivaut à la concaténation de directionY et de directionX (chaînes mises bout à bout).
