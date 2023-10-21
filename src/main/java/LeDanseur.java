public class LeDanseur {

    /*
    Question
Apprenons une nouvelle danse !
La première chose qu’on doit savoir c’est qu’il faut toujours se déplacer soit en avant, soit en arrière et
que dans ce cas, le nombre de pas s’exprime négativement.
Cette danse impose de respecter un enchaînement précis d’étapes : Etape 0 : S’éloigner des obstacles
environnant en s’installant à la position 0 .
Etape 1 : Effectuer un pas en avant (+1 pas)
Etape 2 : Effectuer deux pas en arrière (-2 pas) Pour les étapes suivantes, les pas à effectuer ainsi que leur direction, sont
donnés par le résultat de l’étape précédente moins le résultat de l’étape qui précède la précédente.
Ainsi, à l’étape 3 par exemple, le danseur doit faire 3 pas en arrière (-2 - 1).
L’image qui suit affiche les premiers déplacements du danseur :

A l’étape 3, le danseur se trouve à la position -4.
Implémentez la méthode int Algorithm.getPositionAt(int n) qui retournera la position du
danseur à l’étape n .
Données : 0 <= n <= 2147483647
Important : Essayez de limiter l'usage de la mémoire RAM et du CPU.
Exemples :
Algorithm.getPositionAt(3) retourne -4
Algorithm.getPositionAt(100000) retourne -5
Algorithm.getPositionAt(2147483647) retourne 1
     */

    public static int getPositionAt(int n) {

        int stepsPrevious = 0;
        int stepsBeforePrevious = 0;
        int posAnterior = 0;
        int posActual = 0;
        int steps = 0;

        int  i = 0;

        while (i <= n) {
            if (i == 0) {
                posActual = 0;
            } else if (i == 1) {
                posActual = 1;
                steps = 1;
            } else if (i == 2) {
                posActual = -1;
                steps = -2;
            } else {
                steps = stepsPrevious - stepsBeforePrevious;
                posActual = posAnterior + steps;
            }

            i++;
            posAnterior = posActual;
            stepsBeforePrevious = stepsPrevious;
            stepsPrevious = steps;
        }
        return posActual;
      }

}
