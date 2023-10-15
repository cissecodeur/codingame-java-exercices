
/*
Dans cet exercice nous allons calculer une estimation du nombre π (Pi).
La technique est la suivante :
On prend un point P au hasard de coordonnées (x, y) tel que 0 # x # 1 et 0 # y # 1 . Si
x2 + y2 # 1 , alors le point est à l'intérieur du quart de disque de rayon 1 , sinon le point est à l'extérieur.
Fig 1. Exemple avec 33 points aléatoires.
On sait que la probabilité que le point se situe à l'intérieur du quart de disque est égale à #/4 .
Écrivez la méthode approx(pts) qui va utiliser le tableau de points pts (tirés au hasard) pour retourner une estimation du nombre π.
Données :
Chaque item de pts contient un point. Un point est représenté par un tableau contenant exactement deux nombres, respectivement x et y tels que 0 # x # 1 et 0 # y # 1 .
 pts n'est jamais null et contient toujours au moins un item.

 Methode Monte carlo
*/
    const ValeurApproximativeDePi = (pts) =>{
          var nombreInside = 0;
           for(let i=0 ; i < pts.length;i++){
                let x = pts[i][0];
                let y = pts[i][1];

                if((x*x) + (y*y) <= 1){
                   nombreInside++;
                }
           }

           return (nombreInside/pts.length)*4;

     }
