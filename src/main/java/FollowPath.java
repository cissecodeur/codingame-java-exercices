public class FollowPath {


    /* Objectif:
    vous avez une liste de chaînes de caractères représentant une grille en deux dimensions.

Le premier caractère de la première chaîne correspond au coin supérieur gauche, de coordonnées (0, 0).
La grille a toujours la même taille :
largeur = 15 (chaque chaîne contient 15 caractères) hauteur = 10 (il y a 10 chaînes dans la liste) La grille contient un chemin unique, composé d'étoiles (caractère * ) et de lettres minuscules.
Le chemin commence toujours aux coordonnées (0, 0), et ne contient ni fourche ni boucle. Il peut avancer dans les quatre directions (haut, droite, bas, gauche), mais pas en diagonale.
Vous devez suivre le chemin et enregistrer les lettres dans l'ordre où vous les rencontrez (n'enregistrez pas les étoiles).
A la fin du parcours, renvoyez la chaîne constituée par les lettres.
Le chemin peut commencer immédiatement par une lettre, et peut aussi se terminer par une lettre. Le chemin a une longueur minimale de deux caractères et contient au moins une lettre.
Exemple
Avec la grille suivante :
*** * *
      **c**od**i**
               * e* *n **m*a*g***
Vous devez renvoyer la chaîne codingame
  Implémentation
 Fonction
Implémenter la fonction followPath. Paramètres
gridMap (string[]) : Liste de 10 chaînes, chacune ayant 15 caractères, définissant un quadrillage en 2D.
Valeur de retour
output (string) : La chaîne de charactères construite avec les lettres rencontrées lors du parcours du chemin.

Contraintes
length( gridMap[] ) = 15
Mémoire RAM disponible : 512 Mo Durée maximum d'exécution : 1 second

     */


    public static String followPath(String[] gridMap) {
        int width = 15;
        int height = 10;
        int x = 0;
        int y = 0;
        int dx = 1; // Déplacement initial vers la droite
        int dy = 0;
        StringBuilder result = new StringBuilder();

        while (true) {
            char currentChar = gridMap[y].charAt(x);

            if (currentChar != '*') {
                result.append(currentChar);
            }

            // Mise à jour des coordonnées en fonction de la direction
            x += dx;
            y += dy;

            if (x < 0 || x >= width || y < 0 || y >= height || currentChar == '*') {
                // Revenir en arrière d'une étape pour corriger la sortie du caractère
                x -= dx;
                y -= dy;

                // Changer la direction (sens horaire : droite -> bas -> gauche -> haut)
                int temp = dx;
                dx = -dy;
                dy = temp;
            }

            // Si le parcours est terminé, sortir de la boucle
            if (x == 0 && y == 0) {
                break;
            }
        }

        return result.toString();
    }

}
